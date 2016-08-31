package io.github.tomi77.ems.stream;

/**
 * Stats about the video portion of the stream
 */
interface Video {
    /**
     * Get total amount of video data received
     */
    Integer getBytesCount();

    /**
     * Get codec
     */
    String getCodec();

    /**
     * Get numeric codec
     */
    Long getCodecNumeric();

    /**
     * Get number of video bytes lost
     */
    Integer getDroppedBytesCount();

    /**
     * Get number of lost video packets
     */
    Integer getDroppedPacketsCount();

    /**
     * Get video stream’s pixel height
     */
    Integer getHeight();

    /**
     * Get level
     */
    Integer getLevel();

    /**
     * Get total number of video packets received
     */
    Integer getPacketsCount();

    /**
     * Get profile
     */
    Integer getProfile();

    /**
     * Get video stream’s pixel width
     */
    Integer getWidth();
}
