import static org.junit.jupiter.api.Assertions.*;

class StringDecoderTest {

    @org.junit.jupiter.api.Test
    void decodeTest() {
        String encoded = "1219950180111108236115111016623101401611235115012312161151110101111127";

        String decodedStr = StringDecoder.decode(encoded);

        assertEquals("Honesty is the Best Policy",decodedStr);
    }
}