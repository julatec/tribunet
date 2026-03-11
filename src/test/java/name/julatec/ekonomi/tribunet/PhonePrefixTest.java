package name.julatec.ekonomi.tribunet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PhonePrefixTest {

    @ParameterizedTest(name = "prefixFor({0}) = {1}")
    @CsvSource({
            "CR, +506",
            "US, +1",
            "MX, +52",
            "DE, +49",
            "BR, +55",
            "ES, +34",
            "FR, +33",
            "JP, +81",
            "CN, +86",
            "GB, +44",
            "PA, +507",
            "GT, +502",
            "SV, +503",
            "HN, +504",
            "NI, +505",
    })
    void prefixFor_knownCountries(String iso2, String expectedPrefix) {
        assertEquals(expectedPrefix, PhonePrefix.prefixFor(iso2));
    }

    @Test
    void prefixFor_unknownCode_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PhonePrefix.prefixFor("XX"));
    }

    @Test
    void prefixFor_emptyCode_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PhonePrefix.prefixFor(""));
    }

    @Test
    void prefixFor_nullCode_throwsException() {
        assertThrows(Exception.class, () -> PhonePrefix.prefixFor(null));
    }

    @ParameterizedTest(name = "countryFor({0}) = {1}")
    @CsvSource({
            "506, CR",
            "507, PA",
            "502, GT",
            "503, SV",
            "504, HN",
            "505, NI",
            "591, BO",
            "593, EC",
            "595, PY",
            "598, UY",
    })
    void countryFor_knownPrefixes(String prefix, String expectedIso2) {
        assertEquals(expectedIso2, PhonePrefix.countryFor(prefix));
    }

    @Test
    void countryFor_unknownPrefix_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PhonePrefix.countryFor("000"));
    }

    @Test
    void countryFor_unknownPrefix_999_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PhonePrefix.countryFor("999"));
    }

    @Test
    void prefixFor_costaRica_startsWith_plus() {
        assertTrue(PhonePrefix.prefixFor("CR").startsWith("+"));
    }
}
