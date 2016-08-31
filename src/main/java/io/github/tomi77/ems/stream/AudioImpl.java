package io.github.tomi77.ems.stream;

/**
 * Stats about the audio portion of the stream.
 */
public class AudioImpl implements Audio {
    private Integer bytesCount;

    private String codec;

    private Long codecNumeric;

    private Integer droppedBytesCount;

    private Integer droppedPacketsCount;

    private Integer packetsCount;

    public AudioImpl(Integer bytesCount, String codec, Long codecNumeric, Integer droppedBytesCount, Integer droppedPacketsCount, Integer packetsCount) {
        this.bytesCount = bytesCount;
        this.codec = codec;
        this.codecNumeric = codecNumeric;
        this.droppedBytesCount = droppedBytesCount;
        this.droppedPacketsCount = droppedPacketsCount;
        this.packetsCount = packetsCount;
    }

    public AudioImpl(Integer bytesCount, String codec, String codecNumeric, Integer droppedBytesCount, Integer droppedPacketsCount, Integer packetsCount) {
        this(bytesCount, codec, Long.parseUnsignedLong(codecNumeric), droppedBytesCount, droppedPacketsCount, packetsCount);
    }

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
}
