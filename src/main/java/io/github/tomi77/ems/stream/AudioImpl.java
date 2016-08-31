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

    @Override
    public Integer getBytesCount() {
        return bytesCount;
    }

    @Override
    public String getCodec() {
        return codec;
    }

    @Override
    public Long getCodecNumeric() {
        return codecNumeric;
    }

    @Override
    public Integer getDroppedBytesCount() {
        return droppedBytesCount;
    }

    @Override
    public Integer getDroppedPacketsCount() {
        return droppedPacketsCount;
    }

    @Override
    public Integer getPacketsCount() {
        return packetsCount;
    }
}
