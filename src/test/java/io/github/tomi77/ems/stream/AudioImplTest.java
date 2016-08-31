package io.github.tomi77.ems.stream;

import junit.framework.TestCase;

public class AudioImplTest extends TestCase {
    private Audio audio;

    public void setUp() throws Exception {
        audio = new AudioImpl(727893, "AAAC", "4702111241970122752", 0, 0, 2243);
    }

    public void testGetBytesCount() throws Exception {
        assertEquals("Bytes count must be 727893", new Integer(727893), audio.getBytesCount());
    }

    public void testGetCodec() throws Exception {
        assertEquals("Codec must be AAAC", "AAAC", audio.getCodec());
    }

    public void testGetCodecNumeric() throws Exception {
        assertEquals("Codec numeric must be 4702111241970122752", new Long(Long.parseUnsignedLong("4702111241970122752")), audio.getCodecNumeric());
    }

    public void testGetDroppedBytesCount() throws Exception {
        assertEquals("Dropped bytes count must be 0", new Integer(0), audio.getDroppedBytesCount());
    }

    public void testGetDroppedPacketsCount() throws Exception {
        assertEquals("Dropped packets count must be 0", new Integer(0), audio.getDroppedPacketsCount());
    }

    public void testGetPacketsCount() throws Exception {
        assertEquals("Packets count must be 2243", new Integer(2243), audio.getPacketsCount());
    }
}