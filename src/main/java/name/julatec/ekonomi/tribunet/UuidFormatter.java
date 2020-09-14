package name.julatec.ekonomi.tribunet;

import java.util.UUID;

public interface UuidFormatter {

    static UUID uuidFromString(String name) {
        return UUID.fromString(name.replaceFirst(
                "(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)",
                "$1-$2-$3-$4-$5"));
    }

    static String uuidToString(UUID uuid) {
        return uuid.toString().replaceAll("-", "");
    }

}
