package io.github.tomi77.ems.stream;

/**
 * Stats about the audio portion of the stream.
 */
class AudioImpl implements Audio {
    private Integer bytesCount;

    private String codec;

    private Long codecNumeric;

    private Integer droppedBytesCount;

    private Integer droppedPacketsCount;

    private Integer packetsCount;

    public Integer getBytesCount() {
        return bytesCount;
    }

    public String getCodec() {
        return codec;
    }

    public Long getCodecNumeric() {
        return codecNumeric;
    }

    public Integer getDroppedBytesCount() {
        return droppedBytesCount;
    }

    public Integer getDroppedPacketsCount() {
        return droppedPacketsCount;
    }

    public Integer getPacketsCount() {
        return packetsCount;
    }

    public void fromJson() {
        throw new UnsupportedOperationException("Not implemented, yet.");
    }
}
