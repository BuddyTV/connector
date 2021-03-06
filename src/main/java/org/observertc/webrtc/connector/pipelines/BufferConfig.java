package org.observertc.webrtc.connector.pipelines;

import javax.validation.constraints.Min;

public class BufferConfig {

    @Min(1)
    public int maxItems = 1000;

    @Min(0)
    public int maxWaitingTimeInS = 30;
}
