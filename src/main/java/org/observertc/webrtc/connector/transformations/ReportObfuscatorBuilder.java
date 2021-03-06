package org.observertc.webrtc.connector.transformations;

import io.micronaut.context.annotation.Prototype;
import org.observertc.webrtc.connector.configbuilders.AbstractBuilder;
import org.observertc.webrtc.connector.configbuilders.Builder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

@Prototype
public class ReportObfuscatorBuilder extends AbstractBuilder implements Builder<Transformation> {

    public static final String DEFAULT_HASH_ALGORITHM = "SHA-256";
    private static final Logger logger = LoggerFactory.getLogger(ReportObfuscatorBuilder.class);

    @Override
    public ReportObfuscator build() {
        Config config = this.convertAndValidate(Config.class);
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance(config.algorithm);
        } catch (NoSuchAlgorithmException e) {
            logger.warn("Hash algorithm for " + config.algorithm + " thrown an exception.", e);
            return null;
        }
        ReportObfuscator result = new ReportObfuscator(messageDigest);
        if (Objects.nonNull(config.marker)) {
            result.withMarker(config.marker);
        }

        if (Objects.nonNull(config.serviceName)) {
            result.withServiceName(config.serviceName);
        }

        return result;
    }

    public static class Config {

        public String algorithm = DEFAULT_HASH_ALGORITHM;

        public String serviceName = null;

        public String marker = null;

    }
}
