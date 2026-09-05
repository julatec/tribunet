package name.julatec.ekonomi.tribunet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static name.julatec.ekonomi.tribunet.FactorIVA.*;
import static org.junit.jupiter.api.Assertions.*;

class FactorIVATest {

    @Test
    void exonerado_hasFactor_zero() {
        assertTrue(Exonerado.factor.isPresent());
        assertEquals(0, BigDecimal.ZERO.compareTo(Exonerado.factor.get()));
    }

    @Test
    void excento_hasEmptyFactor() {
        assertFalse(Excento.factor.isPresent());
    }

    @Test
    void otros_hasEmptyFactor() {
        assertFalse(Otros.factor.isPresent());
    }

    @Test
    void f01_hasFactor_one() {
        assertTrue(F01.factor.isPresent());
        assertEquals(0, BigDecimal.valueOf(1.0).compareTo(F01.factor.get()));
    }

    @Test
    void f02_hasFactor_two() {
        assertTrue(F02.factor.isPresent());
        assertEquals(0, BigDecimal.valueOf(2.0).compareTo(F02.factor.get()));
    }

    @Test
    void f04_hasFactor_four() {
        assertTrue(F04.factor.isPresent());
        assertEquals(0, BigDecimal.valueOf(4.0).compareTo(F04.factor.get()));
    }

    @Test
    void f08_hasFactor_eight() {
        assertTrue(F08.factor.isPresent());
        assertEquals(0, BigDecimal.valueOf(8.0).compareTo(F08.factor.get()));
    }

    @Test
    void f13_hasFactor_thirteen() {
        assertTrue(F13.factor.isPresent());
        assertEquals(0, BigDecimal.valueOf(13.0).compareTo(F13.factor.get()));
    }

    // --- fromCodigo: camino preferido, sin ambigüedad ---

    @ParameterizedTest
    @CsvSource({
            "01, T01",
            "02, T02",
            "03, T03",
            "04, T04",
            "05, T05",
            "06, T06",
            "07, T07",
            "08, T08",
            "09, T09",
            "10, T10",
            "11, T11",
    })
    void fromCodigo_officialCode_returnsMatchingTCode(String codigo, String expectedName) {
        assertEquals(FactorIVA.valueOf(expectedName), FactorIVA.fromCodigo(codigo));
    }

    @Test
    void fromCodigo_prefersTCodeOverDeprecatedAlias() {
        // "02".."08" también son códigos de los alias deprecados F01/F02/F04/F08 — el
        // T-code debe ganar siempre.
        assertEquals(T02, FactorIVA.fromCodigo("02"));
        assertEquals(T03, FactorIVA.fromCodigo("03"));
        assertEquals(T04, FactorIVA.fromCodigo("04"));
        assertEquals(T07, FactorIVA.fromCodigo("07"));
        assertEquals(T08, FactorIVA.fromCodigo("08"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"99", "12", "xx"})
    void fromCodigo_unknownOrMissing_returnsNull(String codigo) {
        assertNull(FactorIVA.fromCodigo(codigo));
    }

    // --- valueOf(BigDecimal): fallback legado, solo para documentos sin código (v4.2) ---

    @Test
    void valueOf_zero_returnsT01_deterministically() {
        assertEquals(T01, FactorIVA.valueOf(BigDecimal.ZERO));
        assertEquals(T01, FactorIVA.valueOf(BigDecimal.valueOf(0.0)));
    }

    @Test
    void valueOf_null_treatedAsZero_returnsT01() {
        assertEquals(T01, FactorIVA.valueOf((BigDecimal) null));
    }

    @Test
    void valueOf_half_returnsT09() {
        assertEquals(T09, FactorIVA.valueOf(BigDecimal.valueOf(0.5)));
    }

    @Test
    void valueOf_one_returnsT02() {
        assertEquals(T02, FactorIVA.valueOf(BigDecimal.valueOf(1.0)));
    }

    @Test
    void valueOf_two_returnsT03() {
        assertEquals(T03, FactorIVA.valueOf(BigDecimal.valueOf(2.0)));
    }

    @Test
    void valueOf_four_returnsT04_notT06() {
        // 4% es ambiguo entre T04 (reducida) y T06 (transitorio); sin código, T04 es el
        // destino elegido a propósito — T06 no existía como concepto legal antes de v4.3.
        assertEquals(T04, FactorIVA.valueOf(BigDecimal.valueOf(4.0)));
    }

    @Test
    void valueOf_eight_returnsT07() {
        assertEquals(T07, FactorIVA.valueOf(BigDecimal.valueOf(8.0)));
    }

    @Test
    void valueOf_thirteen_returnsT08() {
        assertEquals(T08, FactorIVA.valueOf(BigDecimal.valueOf(13.0)));
    }

    @Test
    void valueOf_unknownFactor_returnsNull() {
        assertNull(FactorIVA.valueOf(BigDecimal.valueOf(5.0)));
        assertNull(FactorIVA.valueOf(BigDecimal.valueOf(99.0)));
    }

    @Test
    void values_containsAllNineteenConstants() {
        // 3 estados (Excento/Exonerado/Otros) + 11 T-codes + 5 alias deprecados.
        assertEquals(19, FactorIVA.values().length);
    }

    @Test
    void placeholders_haveLowerOrdinalThanAllTCodes() {
        // Invariante que usa DetailedDocument (factorIVA.compareTo(impuestoFactor)): una
        // tarifa real detectada en una línea debe poder reemplazar a cualquiera de estos tres.
        for (FactorIVA placeholder : new FactorIVA[]{Excento, Exonerado, Otros}) {
            for (FactorIVA codigo : new FactorIVA[]{T01, T02, T03, T04, T05, T06, T07, T08, T09, T10, T11}) {
                assertTrue(placeholder.compareTo(codigo) < 0,
                        placeholder + " debería tener ordinal menor que " + codigo);
            }
        }
    }

    @ParameterizedTest
    @EnumSource(FactorIVA.class)
    void allConstants_haveNonNullFactor(FactorIVA factorIVA) {
        assertNotNull(factorIVA.factor);
    }
}
