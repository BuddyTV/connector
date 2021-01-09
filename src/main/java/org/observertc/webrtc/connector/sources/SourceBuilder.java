package org.observertc.webrtc.connector.sources;

import org.observertc.webrtc.connector.configbuilders.AbstractBuilder;
import org.observertc.webrtc.connector.configbuilders.Builder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * All concrete sourcebuilder should
 * be annotated, in order to be listed in the packages.
 */
public class SourceBuilder extends AbstractBuilder {
    private static final Logger logger = LoggerFactory.getLogger(SourceBuilder.class);
    private final List<String> packages;

    public SourceBuilder() {
        Package thisPackage = this.getClass().getPackage();
        this.packages = Arrays.stream(Package.getPackages())
                .filter(p -> p.getName().startsWith(thisPackage.getName()))
                .map(Package::getName)
                .collect(Collectors.toList());

    }

    public Source build() {
        Config config = this.convertAndValidate(Config.class);
        String builderClassName = AbstractBuilder.getBuilderClassName(config.type);
        Optional<Builder> concreteSourceBuilderHolder = this.tryInvoke(builderClassName);
        if (!concreteSourceBuilderHolder.isPresent()) {
            logger.error("Cannot find source builder for {} in packages: {}", config.type, String.join(",", this.packages ));
            return null;
        }
        Builder<Source> builder = (Builder<Source>) concreteSourceBuilderHolder.get();

        builder.withConfiguration(config.config);
        Source result = builder.build();
        return result;
    }

    public static class Config {

        @NotNull
        public String type;

        @NotNull
        public Map<String, Object> config;

    }
}
