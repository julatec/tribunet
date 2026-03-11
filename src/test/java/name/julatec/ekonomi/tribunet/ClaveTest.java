package name.julatec.ekonomi.tribunet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ClaveTest {

    // A known 50-digit clave for CR, Jan 5 2023, id=100000000000, NORMAL(1), checksum=12345678
    // Positions: [506][050123][100000000000][00000000000000000001][1][12345678]
    private static final String KNOWN_CLAVE = "50605012310000000000000000000000000000001112345678";

    private static Date jan5_2023() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JANUARY, 5, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    // --- Field enum ---

    @Test
    void field_lengths_sumToLength() {
        int sum = 0;
        for (Clave.Field f : Clave.Field.values()) {
            sum += f.length;
        }
        assertEquals(Clave.LENGTH, sum);
    }

    @Test
    void field_country_length_isThree() {
        assertEquals(3, Clave.Field.Country.length);
    }

    @Test
    void field_date_length_isSix() {
        assertEquals(6, Clave.Field.Date.length);
    }

    @Test
    void field_emitter_length_isTwelve() {
        assertEquals(12, Clave.Field.Emitter.length);
    }

    @Test
    void field_sequence_length_isTwenty() {
        assertEquals(20, Clave.Field.Sequence.length);
    }

    @Test
    void field_situation_length_isOne() {
        assertEquals(1, Clave.Field.Situation.length);
    }

    @Test
    void field_checksum_length_isEight() {
        assertEquals(8, Clave.Field.Checksum.length);
    }

    @ParameterizedTest
    @EnumSource(Clave.Field.class)
    void field_format_containsLength(Clave.Field field) {
        assertTrue(field.format.contains(String.valueOf(field.length)));
    }

    @Test
    void length_constant_isFifty() {
        assertEquals(50, Clave.LENGTH);
    }

    // --- Situation enum ---

    @Test
    void situation_normal_ordinalIsOne() {
        assertEquals(1, Clave.Situation.NORMAL.ordinal());
    }

    @Test
    void situation_contingencia_ordinalIsTwo() {
        assertEquals(2, Clave.Situation.CONTINGENCIA.ordinal());
    }

    @Test
    void situation_sinInternet_ordinalIsThree() {
        assertEquals(3, Clave.Situation.SIN_INTERNET.ordinal());
    }

    @Test
    void situation_situation_ordinalIsNine() {
        assertEquals(9, Clave.Situation.SITUATION.ordinal());
    }

    @ParameterizedTest
    @EnumSource(Clave.Situation.class)
    void situation_toString_returnsOrdinal(Clave.Situation situation) {
        assertEquals(String.valueOf(situation.ordinal()), situation.toString());
    }

    // --- of(String) parser ---

    @Test
    void ofString_parsesCountry() throws ParseException {
        Clave clave = Clave.of(KNOWN_CLAVE);
        assertEquals("CR", clave.getCountry());
    }

    @Test
    void ofString_parsesDate() throws ParseException {
        Clave clave = Clave.of(KNOWN_CLAVE);
        Calendar cal = Calendar.getInstance();
        cal.setTime(clave.getDate());
        assertEquals(5, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(2023, cal.get(Calendar.YEAR));
    }

    @Test
    void ofString_parsesId() throws ParseException {
        Clave clave = Clave.of(KNOWN_CLAVE);
        assertEquals("100000000000", clave.getId());
    }

    @Test
    void ofString_parsesSituation() throws ParseException {
        Clave clave = Clave.of(KNOWN_CLAVE);
        assertEquals(Clave.Situation.NORMAL, clave.getSituation());
    }

    @Test
    void ofString_parsesChecksum() throws ParseException {
        Clave clave = Clave.of(KNOWN_CLAVE);
        assertEquals("12345678", clave.getChecksum());
    }

    @Test
    void ofString_toString_producesFiftyDigits() throws ParseException {
        Clave clave = Clave.of(KNOWN_CLAVE);
        assertEquals(50, clave.toString().length());
    }

    @Test
    void ofString_toString_roundTrips() throws ParseException {
        Clave clave = Clave.of(KNOWN_CLAVE);
        assertEquals(KNOWN_CLAVE, clave.toString());
    }

    @Test
    void ofString_nullThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Clave.of((String) null));
    }

    // --- of(String country, Date date, String id, String sequence) factory ---

    @Test
    void ofFactory_producesNonNullClave() {
        Clave clave = Clave.of("CR", jan5_2023(), "100000000000", "00000000000000000001");
        assertNotNull(clave);
    }

    @Test
    void ofFactory_situation_isSITUATION() {
        Clave clave = Clave.of("CR", jan5_2023(), "100000000000", "00000000000000000001");
        assertEquals(Clave.Situation.SITUATION, clave.getSituation());
    }

    @Test
    void ofFactory_checksum_isEightChars() {
        Clave clave = Clave.of("CR", jan5_2023(), "100000000000", "00000000000000000001");
        assertEquals(8, clave.getChecksum().length());
    }

    @Test
    void ofFactory_toString_isFiftyDigits() {
        Clave clave = Clave.of("CR", jan5_2023(), "100000000000", "00000000000000000001");
        assertEquals(50, clave.toString().length());
    }

    @Test
    void ofFactory_country_matchesInput() {
        Clave clave = Clave.of("CR", jan5_2023(), "100000000000", "00000000000000000001");
        assertEquals("CR", clave.getCountry());
    }

    // --- Full constructor ---

    @Test
    void constructor_toString_isFiftyDigits() {
        Clave clave = new Clave("CR", jan5_2023(), "100000000000",
                "00000000000000000001", Clave.Situation.NORMAL, "12345678");
        assertEquals(50, clave.toString().length());
    }

    @Test
    void constructor_getters_returnInputValues() {
        Date date = jan5_2023();
        Clave clave = new Clave("CR", date, "100000000000",
                "00000000000000000001", Clave.Situation.NORMAL, "12345678");
        assertEquals("CR", clave.getCountry());
        assertEquals(date, clave.getDate());
        assertEquals("100000000000", clave.getId());
        assertEquals("00000000000000000001", clave.getSequence());
        assertEquals(Clave.Situation.NORMAL, clave.getSituation());
        assertEquals("12345678", clave.getChecksum());
    }

    // --- toUuid ---

    @Test
    void toUuid_returnsNonNull() throws ParseException {
        Clave clave = Clave.of(KNOWN_CLAVE);
        UUID uuid = clave.toUuid();
        assertNotNull(uuid);
    }

    @Test
    void toUuid_deterministicForSameClave() throws ParseException {
        Clave clave1 = Clave.of(KNOWN_CLAVE);
        Clave clave2 = Clave.of(KNOWN_CLAVE);
        assertEquals(clave1.toUuid(), clave2.toUuid());
    }

    // --- compareTo ---

    @Test
    void compareTo_earlierDateIsLess() throws ParseException {
        Clave earlier = Clave.of(KNOWN_CLAVE);
        // Build a later clave: Feb 5 2023 → "050223"
        String laterStr = "506050223100000000000000000000000000000011" + "12345678";
        // positions: [506][050223][100000000000][00000000000000000001][1][12345678]
        String laterClave = "506050223" + "100000000000" + "00000000000000000001" + "1" + "12345678";
        assertEquals(50, laterClave.length());
        Clave later = Clave.of(laterClave);
        assertTrue(earlier.compareTo(later) < 0);
        assertTrue(later.compareTo(earlier) > 0);
    }

    @Test
    void compareTo_sameClave_isZero() throws ParseException {
        Clave a = Clave.of(KNOWN_CLAVE);
        Clave b = Clave.of(KNOWN_CLAVE);
        assertEquals(0, a.compareTo(b));
    }

    @Test
    void compareTo_differentId_sameDate() throws ParseException {
        // id "100000000000" vs "200000000000"
        String clave1 = "506050123" + "100000000000" + "00000000000000000001" + "1" + "12345678";
        String clave2 = "506050123" + "200000000000" + "00000000000000000001" + "1" + "12345678";
        Clave a = Clave.of(clave1);
        Clave b = Clave.of(clave2);
        assertNotEquals(0, a.compareTo(b));
    }
}
