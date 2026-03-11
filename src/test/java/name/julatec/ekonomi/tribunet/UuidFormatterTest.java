package name.julatec.ekonomi.tribunet;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UuidFormatterTest {

    private static final String HEX = "550e8400e29b41d4a716446655440000";
    private static final String UUID_STR = "550e8400-e29b-41d4-a716-446655440000";

    @Test
    void uuidFromString_producesCorrectUuid() {
        UUID uuid = UuidFormatter.uuidFromString(HEX);
        assertEquals(UUID_STR, uuid.toString());
    }

    @Test
    void uuidToString_removesHyphens() {
        UUID uuid = UUID.fromString(UUID_STR);
        assertEquals(HEX, UuidFormatter.uuidToString(uuid));
    }

    @Test
    void roundTrip_uuidToStringToUuid() {
        UUID original = UUID.fromString(UUID_STR);
        String str = UuidFormatter.uuidToString(original);
        UUID roundTripped = UuidFormatter.uuidFromString(str);
        assertEquals(original, roundTripped);
    }

    @Test
    void roundTrip_randomUuid() {
        UUID original = UUID.randomUUID();
        String hex = UuidFormatter.uuidToString(original);
        assertEquals(32, hex.length());
        assertFalse(hex.contains("-"));
        assertEquals(original, UuidFormatter.uuidFromString(hex));
    }

    @Test
    void uuidFromString_allZeros() {
        UUID uuid = UuidFormatter.uuidFromString("00000000000000000000000000000000");
        assertEquals("00000000-0000-0000-0000-000000000000", uuid.toString());
    }

    @Test
    void uuidToString_allZeroUuid() {
        UUID uuid = UUID.fromString("00000000-0000-0000-0000-000000000000");
        assertEquals("00000000000000000000000000000000", UuidFormatter.uuidToString(uuid));
    }
}
