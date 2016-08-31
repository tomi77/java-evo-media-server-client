package ems;

import io.github.tomi77.ems.stream.Audio;
import io.github.tomi77.ems.stream.AudioImpl;
import org.junit.Assert;
import org.junit.Test;

public class AudioTests {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        Audio audio = new AudioImpl(727893, "AAAC", "4702111241970122752", 0, 0, 2243);

        // assert statements
        Assert.assertEquals("Bytes count must be 727893", new Integer(727893), audio.getBytesCount());
        Assert.assertEquals("Codec must be AAAC", "AAAC", audio.getCodec());
        Assert.assertEquals("Codec numeric must be 4702111241970122752", new Long(Long.parseUnsignedLong("4702111241970122752")), audio.getCodecNumeric());
        Assert.assertEquals("Dropped bytes count must be 0", new Integer(0), audio.getDroppedBytesCount());
        Assert.assertEquals("Dropped packets count must be 0", new Integer(0), audio.getDroppedPacketsCount());
        Assert.assertEquals("Packets count must be 2243", new Integer(2243), audio.getPacketsCount());
    }
}