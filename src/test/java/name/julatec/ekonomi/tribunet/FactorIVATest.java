package name.julatec.ekonomi.tribunet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

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

    @Test
    void valueOf_one_returnsF01() {
        assertEquals(F01, FactorIVA.valueOf(BigDecimal.valueOf(1.0)));
    }

    @Test
    void valueOf_two_returnsF02() {
        assertEquals(F02, FactorIVA.valueOf(BigDecimal.valueOf(2.0)));
    }

    @Test
    void valueOf_four_returnsF04() {
        assertEquals(F04, FactorIVA.valueOf(BigDecimal.valueOf(4.0)));
    }

    @Test
    void valueOf_eight_returnsF08() {
        assertEquals(F08, FactorIVA.valueOf(BigDecimal.valueOf(8.0)));
    }

    @Test
    void valueOf_thirteen_returnsF13() {
        assertEquals(F13, FactorIVA.valueOf(BigDecimal.valueOf(13.0)));
    }

    @Test
    void valueOf_null_returnsOtros() {
        // null is treated as ZERO, which maps to the last zero-factor constant (Otros)
        assertEquals(Otros, FactorIVA.valueOf((BigDecimal) null));
    }

    @Test
    void valueOf_unknownFactor_returnsNull() {
        assertNull(FactorIVA.valueOf(BigDecimal.valueOf(5.0)));
        assertNull(FactorIVA.valueOf(BigDecimal.valueOf(99.0)));
    }

    @Test
    void values_containsAllEightConstants() {
        assertEquals(8, FactorIVA.values().length);
    }

    @ParameterizedTest
    @EnumSource(FactorIVA.class)
    void allConstants_haveNonNullFactor(FactorIVA factorIVA) {
        assertNotNull(factorIVA.factor);
    }

    @Test
    void valueOf_zero_returnsAZeroFactorConstant() {
        FactorIVA result = FactorIVA.valueOf(BigDecimal.ZERO);
        assertNotNull(result);
        // The zero slot is shared by Exonerado, Excento, Otros — any one is valid
        assertTrue(result == Exonerado || result == Excento || result == Otros);
    }
}
