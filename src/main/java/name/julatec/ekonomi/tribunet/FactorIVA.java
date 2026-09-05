package name.julatec.ekonomi.tribunet;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import static java.math.BigDecimal.ZERO;

/**
 * Tarifas de IVA de Hacienda (Nota 8.1, Anexos y Estructuras v4.4). El código Hacienda no
 * corresponde al porcentaje (02 = 1%, 07 = 8%, 08 = 13%) — cada constante lleva el nombre del
 * código real, no del porcentaje.
 * <p>
 * {@code Excento}/{@code Exonerado}/{@code Otros} no son códigos de Hacienda: son estados que
 * asigna {@code DetailedDocument} cuando una línea no trae dato de tarifa (sin nodo Impuesto),
 * trae una exoneración, o trae un código que no se reconoce. Van declarados antes que los
 * T-codes para que {@link Enum#compareTo} los trate siempre como el valor "más bajo" — una
 * tarifa real detectada en una línea debe poder reemplazar a cualquiera de estos tres.
 */
public enum FactorIVA {

    Excento(Optional.empty(), "Sin dato de tarifa (línea sin nodo Impuesto)"),
    Exonerado(Optional.of(0.0d), "Línea con exoneración"),
    Otros(Optional.empty(), "Código de tarifa no reconocido"),

    T01("01", Optional.of(0.0d), "Tarifa 0% (Artículo 32, num 1, RLIVA)"),
    T02("02", Optional.of(1.0d), "Tarifa reducida 1%"),
    T03("03", Optional.of(2.0d), "Tarifa reducida 2%"),
    T04("04", Optional.of(4.0d), "Tarifa reducida 4%"),
    T05("05", Optional.of(0.0d), "Transitorio 0%"),
    T06("06", Optional.of(4.0d), "Transitorio 4%"),
    T07("07", Optional.of(8.0d), "Tarifa transitoria 8%"),
    T08("08", Optional.of(13.0d), "Tarifa general 13%"),
    T09("09", Optional.of(0.5d), "Tarifa reducida 0.5%"),
    T10("10", Optional.empty(), "Tarifa Exenta"),
    T11("11", Optional.of(0.0d), "Tarifa 0% sin derecho a crédito"),

    /** @deprecated usar {@link #T02}. */
    @Deprecated F01("02", Optional.of(1.0d), "Tarifa reducida 1%"),
    /** @deprecated usar {@link #T03}. */
    @Deprecated F02("03", Optional.of(2.0d), "Tarifa reducida 2%"),
    /** @deprecated usar {@link #T04}. */
    @Deprecated F04("04", Optional.of(4.0d), "Tarifa reducida 4%"),
    /** @deprecated usar {@link #T07}. */
    @Deprecated F08("07", Optional.of(8.0d), "Tarifa transitoria 8%"),
    /** @deprecated usar {@link #T08}. */
    @Deprecated F13("08", Optional.of(13.0d), "Tarifa general 13%");

    /**
     * Código real de Hacienda ("01".."11"), o {@code null} para los estados que no son un
     * código de tarifa ({@code Excento}/{@code Exonerado}/{@code Otros}).
     */
    public final String codigo;

    public final Optional<BigDecimal> factor;

    public final String descripcion;

    private static final Map<String, FactorIVA> porCodigo;

    /**
     * Fallback exclusivo para documentos sin campo de código (v4.2): un solo destino por
     * valor, elegido a propósito y no por el orden de declaración del enum. Los códigos que
     * Hacienda distingue solo por el campo de código —el 0% de 01/05/10/11, el 4% de 04/06—
     * no pueden reconstruirse desde un documento que nunca declaró esa distinción.
     */
    private static final TreeMap<BigDecimal, FactorIVA> legadoPorTarifa;

    static {
        porCodigo = new HashMap<>();
        for (FactorIVA factorIVA : values()) {
            if (factorIVA.codigo == null) {
                continue;
            }
            // Los T-codes son la fuente de verdad y siempre ganan, sin importar el orden de
            // declaración; los alias deprecados solo ocupan un código si nada más lo reclamó.
            if (factorIVA.name().startsWith("T") || !porCodigo.containsKey(factorIVA.codigo)) {
                porCodigo.put(factorIVA.codigo, factorIVA);
            }
        }

        legadoPorTarifa = new TreeMap<>();
        legadoPorTarifa.put(BigDecimal.valueOf(0.0), T01);
        legadoPorTarifa.put(BigDecimal.valueOf(0.5), T09);
        legadoPorTarifa.put(BigDecimal.valueOf(1.0), T02);
        legadoPorTarifa.put(BigDecimal.valueOf(2.0), T03);
        legadoPorTarifa.put(BigDecimal.valueOf(4.0), T04);
        legadoPorTarifa.put(BigDecimal.valueOf(8.0), T07);
        legadoPorTarifa.put(BigDecimal.valueOf(13.0), T08);
    }

    FactorIVA(Optional<Double> factor, String descripcion) {
        this(null, factor, descripcion);
    }

    FactorIVA(String codigo, Optional<Double> factor, String descripcion) {
        this.codigo = codigo;
        this.factor = factor.map(BigDecimal::new);
        this.descripcion = descripcion;
    }

    /**
     * Busca por el código real de Hacienda (Nota 8.1) — sin ambigüedad, es el camino
     * preferido. Existe como {@code CodigoTarifa} en v4.3 y como {@code CodigoTarifaIVA} en
     * v4.4; no existe en v4.2.
     *
     * @param codigo código de dos dígitos ("01".."11"), o {@code null}.
     * @return la tarifa correspondiente, o {@code null} si no se reconoce.
     */
    public static FactorIVA fromCodigo(String codigo) {
        return codigo == null ? null : porCodigo.get(codigo);
    }

    /**
     * Fallback legado por valor numérico de la tarifa, para documentos sin campo de código
     * (v4.2). No distingue entre tarifas que Hacienda solo diferencia por código.
     *
     * @param factor valor de la tarifa (un {@code null} se trata como cero).
     * @return la tarifa correspondiente, o {@code null} si el valor no es reconocido.
     * @deprecated preferir {@link #fromCodigo(String)} cuando el documento tenga código.
     */
    @Deprecated
    public static FactorIVA valueOf(BigDecimal factor) {
        return legadoPorTarifa.get(Optional.ofNullable(factor).orElse(ZERO));
    }
}
