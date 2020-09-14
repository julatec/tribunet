package name.julatec.ekonomi.tribunet;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.TreeMap;

import static java.math.BigDecimal.ZERO;

public enum FactorIVA {

    Exonerado(Optional.of(0.0d)),
    Excento(Optional.empty()),
    Otros(Optional.empty()),
    F01(Optional.of(01.0d)),
    F02(Optional.of(02.0d)),
    F04(Optional.of(04.0d)),
    F08(Optional.of(08.0d)),
    F13(Optional.of(13.0d));

    public final Optional<BigDecimal> factor;

    private static final TreeMap<BigDecimal, FactorIVA> reverseMap;

    static {
        reverseMap = new TreeMap<>();
        for (FactorIVA factorIVA : values()) {
            reverseMap.put(factorIVA.factor.orElse(ZERO), factorIVA);
        }
    }

    FactorIVA(Optional<Double> factor) {
        this.factor = factor.map(BigDecimal::new);
    }

    public static FactorIVA valueOf(BigDecimal factor) {
        return reverseMap.get(Optional.ofNullable(factor).orElse(ZERO));
    }


}
