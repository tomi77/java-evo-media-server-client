package io.github.tomi77.ems.stream;

/**
 * Stats about the video portion of the stream
 */
class VideoImpl implements Video {
    private Integer bytesCount;

    private String codec;

    private Long codecNumeric;

    private Integer droppedBytesCount;

    private Integer droppedPacketsCount;

    private Integer height;

    private Integer level;

    private Integer packetsCount;

    private Integer profile;

    private Integer width;

    public VideoImpl(Integer bytesCount, String codec, Long codecNumeric, Integer droppedBytesCount, Integer droppedPacketsCount, Integer height, Integer level, Integer packetsCount, Integer profile, Integer width) {
        this.bytesCount = bytesCount;
        this.codec = codec;
        this.codecNumeric = codecNumeric;
        this.droppedBytesCount = droppedBytesCount;
        this.droppedPacketsCount = droppedPacketsCount;
        this.height = height;
        this.level = level;
        this.packetsCount = packetsCount;
        this.profile = profile;
        this.width = width;
    }

    public VideoImpl(Integer bytesCount, String codec, String codecNumeric, Integer droppedBytesCount, Integer droppedPacketsCount, Integer height, Integer level, Integer packetsCount, Integer profile, Integer width) {
        this(bytesCount, codec, Long.parseUnsignedLong(codecNumeric), droppedBytesCount, droppedPacketsCount, height, level, packetsCount, profile, width);
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
    public Integer getHeight() {
        return height;
    }

    @Override
    public Integer getLevel() {
        return level;
    }

    @Override
    public Integer getPacketsCount() {
        return packetsCount;
    }

    @Override
    public Integer getProfile() {
        return profile;
    }

    @Override
    public Integer getWidth() {
        return width;
    }
}
