package io.github.tomi77.ems.stream;

import junit.framework.TestCase;

public class AudioTest extends TestCase {

    public void testConstructorAndGetters() {
        Audio audio = new AudioImpl(727893, "AAAC", "4702111241970122752", 0, 0, 2243);

        // assert statements
        assertEquals("Bytes count must be 727893", new Integer(727893), audio.getBytesCount());
        assertEquals("Codec must be AAAC", "AAAC", audio.getCodec());
        assertEquals("Codec numeric must be 4702111241970122752", new Long(Long.parseUnsignedLong("4702111241970122752")), audio.getCodecNumeric());
        assertEquals("Dropped bytes count must be 0", new Integer(0), audio.getDroppedBytesCount());
        assertEquals("Dropped packets count must be 0", new Integer(0), audio.getDroppedPacketsCount());
        assertEquals("Packets count must be 2243", new Integer(2243), audio.getPacketsCount());
    }
}