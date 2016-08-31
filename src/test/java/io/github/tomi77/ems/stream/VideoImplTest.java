package io.github.tomi77.ems.stream;

import junit.framework.TestCase;

public class VideoImplTest extends TestCase {
    private Video video;

    public void setUp() {
        video = new VideoImpl(4881934, "VH264", "6217274493967007744", 0, 0, 306, 30, 1255, 66, 720);
    }

    public void testGetBytesCount() throws Exception {
        assertEquals(new Integer(4881934), video.getBytesCount());
    }

    public void testGetCodec() throws Exception {
        assertEquals("VH264", video.getCodec());
    }

    public void testGetCodecNumeric() throws Exception {
        assertEquals(new Long(Long.parseUnsignedLong("6217274493967007744")), video.getCodecNumeric());
    }

    public void testGetDroppedBytesCount() throws Exception {
        assertEquals(new Integer(0), video.getDroppedBytesCount());
    }

    public void testGetDroppedPacketsCount() throws Exception {
        assertEquals(new Integer(0), video.getDroppedPacketsCount());
    }

    public void testGetHeight() throws Exception {
        assertEquals(new Integer(306), video.getHeight());
    }

    public void testGetLevel() throws Exception {
        assertEquals(new Integer(30), video.getLevel());
    }

    public void testGetPacketsCount() throws Exception {
        assertEquals(new Integer(1255), video.getPacketsCount());
    }

    public void testGetProfile() throws Exception {
        assertEquals(new Integer(66), video.getProfile());
    }

    public void testGetWidth() throws Exception {
        assertEquals(new Integer(720), video.getWidth());
    }
}
