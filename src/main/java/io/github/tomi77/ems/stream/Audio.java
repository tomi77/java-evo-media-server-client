package io.github.tomi77.ems.stream;

/**
 * Stats about the audio portion of the stream.
 */
public interface Audio {
    /**
     * Get total amount of audio data received
     * Ex. 727893
     */
    Integer getBytesCount();

    /**
     * Get codec
     * Ex. AAAC
     */
    String getCodec();

    /**
     * Get numeric codec
     * Ex. 4702111241970122752
     */
    Long getCodecNumeric();

    /**
     * Get number of audio bytes lost
     * Ex. 0
     */
    Integer getDroppedBytesCount();

    /**
     * Get number of lost audio packets
     * Ex. 0
     */
    Integer getDroppedPacketsCount();

    /**
     * Get total number of audio packets received
     * Ex. 2243
     */
    Integer getPacketsCount();
}
