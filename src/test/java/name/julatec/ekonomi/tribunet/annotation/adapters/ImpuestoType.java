package name.julatec.ekonomi.tribunet.annotation.adapters;

import name.julatec.ekonomi.tribunet.annotation.Adapt;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.TreeMap;

@Adapt({
        cr.go.hacienda.tribunet.v42y2016.factura.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2016.tiquete.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2016.nota.credito.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2016.nota.debito.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2017.factura.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2017.tiquete.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2017.nota.credito.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2017.nota.debito.ImpuestoType.class,
        cr.go.hacienda.tribunet.v43.factura.ImpuestoType.class,
        cr.go.hacienda.tribunet.v43.factura.compra.ImpuestoType.class,
        cr.go.hacienda.tribunet.v43.factura.exportacion.ImpuestoType.class,
        cr.go.hacienda.tribunet.v43.tiquete.ImpuestoType.class,
        cr.go.hacienda.tribunet.v43.nota.credito.ImpuestoType.class,
        cr.go.hacienda.tribunet.v43.nota.debito.ImpuestoType.class,
})
public interface ImpuestoType {

    default String getCodigo() {
        return null;
    }

    default String getCodigoTarifa() {
        return null;
    }

    default BigDecimal getTarifa() {
        return null;
    }

    default BigDecimal getFactorIVA() {
        return null;
    }

    default BigDecimal getMonto() {
        return null;
    }

    default BigDecimal getMontoExportacion() {
        return null;
    }

    default ExoneracionType getExoneracion() {
        return null;
    }

    enum Codigo {

        Empty(Optional.empty()),
        SelectivoDeConsumo(Optional.of("02")),
        Combustivos(Optional.of("03")),
        BebidasAlcoholicas(Optional.of("04")),
        BebidasEnvasadas(Optional.of("05")),
        Cemento(Optional.ofNullable("12")),
        Otros(Optional.ofNullable("99")),
        BaseImponible(Optional.empty()),
        ProductosDeTabaco(Optional.ofNullable("06")),
        OtrosCargos(Optional.empty()),
        ValorAgregado(Optional.ofNullable("01")),
        ValorAgregadoEspecial(Optional.ofNullable("07")),
        ValorAgregadoUsados(Optional.ofNullable("08")),
        Total(Optional.empty());

        public final Optional<String> code;

        Codigo(Optional<String> code) {
            this.code = code;
        }

        private static final TreeMap<String, Codigo> reverseMap;

        static {
            reverseMap = new TreeMap<>();
            for (Codigo codigo : values()) {
                reverseMap.put(codigo.code.orElse(""), codigo);
            }
            reverseMap.put("", Empty);
        }

        public static Codigo of(String codigo) {
            return reverseMap.get(Optional.ofNullable(codigo).orElse(""));
        }
    }
}
