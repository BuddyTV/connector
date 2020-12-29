//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.observertc.webrtc.reportconnector.configbuilders;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractTask implements Task {
    private static final Logger logger = LoggerFactory.getLogger(AbstractTask.class);
    private final Map<String, Object> results;
    private String name;
    private String description;
    private volatile boolean run;
    private final int retryNrOnExceptions;

    public AbstractTask(String name, int retryNrOnExceptions) {
        this.run = false;
        this.results = new HashMap();
        if (name == null) {
            this.name = this.getClass().getName();
        } else {
            this.name = name;
        }

        this.retryNrOnExceptions = retryNrOnExceptions;
    }

    public AbstractTask(int retryNrOnExceptions) {
        this((String)null, retryNrOnExceptions);
    }

    public AbstractTask(String name) {
        this(name, 3);
    }

    public String getName() {
        return this.name;
    }

    public Map<String, Object> getResults() {
        return this.results;
    }

    public <T> T getResult(String key) {
        return (T) this.results.get(key);
    }

    protected void setResult(String key, Object value) {
        this.results.put(key, value);
    }

    public String getDescription() {
        return null;
    }

    public AbstractTask withDescription(String description) {
        this.description = description;
        return this;
    }

    public AbstractTask withName(String name) {
        this.name = name;
        return this;
    }

    public void execute(Map<String, Map<String, Object>> results) {
        if (this.run) {
            logger.warn("Something wrong. A task should not be tried to execute twice.");
        } else {
            this.run = true;
            Exception exception = null;
            int tried = 0;

            while(tried < this.retryNrOnExceptions) {
                try {
                    this.onExecution(results);
                    return;
                } catch (Exception var5) {
                    exception = var5;
                    this.onExceptionAtRetry(var5, tried);
                    ++tried;
                }
            }

            this.onExceptionAtFailedRetries(exception);
        }
    }

    protected void reset() {
        this.run = false;
    }

    protected abstract void onExecution(Map<String, Map<String, Object>> var1);

    protected void onExceptionAtRetry(Exception exception, int tried) {
        logger.warn("Exception occured during execution {}, retry: {}", exception, tried);
    }

    protected void onExceptionAtFailedRetries(Exception exception) {
        throw new RuntimeException(exception);
    }
}