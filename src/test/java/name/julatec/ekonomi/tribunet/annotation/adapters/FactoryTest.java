package name.julatec.ekonomi.tribunet.annotation.adapters;

import name.julatec.ekonomi.tribunet.annotation.AdapterFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    // ---- Helpers ----

    private static cr.go.hacienda.tribunet.v42y2016.factura.FacturaElectronica facturaV42y2016() {
        var f = new cr.go.hacienda.tribunet.v42y2016.factura.FacturaElectronica();
        f.setEmisor(new cr.go.hacienda.tribunet.v42y2016.factura.EmisorType());
        f.setReceptor(new cr.go.hacienda.tribunet.v42y2016.factura.ReceptorType());
        f.setDetalleServicio(new cr.go.hacienda.tribunet.v42y2016.factura.FacturaElectronica.DetalleServicio());
        return f;
    }

    private static cr.go.hacienda.tribunet.v42y2016.tiquete.TiqueteElectronico tiqueteV42y2016() {
        var t = new cr.go.hacienda.tribunet.v42y2016.tiquete.TiqueteElectronico();
        t.setEmisor(new cr.go.hacienda.tribunet.v42y2016.tiquete.EmisorType());
        t.setReceptor(new cr.go.hacienda.tribunet.v42y2016.tiquete.ReceptorType());
        t.setDetalleServicio(new cr.go.hacienda.tribunet.v42y2016.tiquete.TiqueteElectronico.DetalleServicio());
        return t;
    }

    private static cr.go.hacienda.tribunet.v42y2017.factura.FacturaElectronica facturaV42y2017() {
        var f = new cr.go.hacienda.tribunet.v42y2017.factura.FacturaElectronica();
        f.setEmisor(new cr.go.hacienda.tribunet.v42y2017.factura.EmisorType());
        f.setReceptor(new cr.go.hacienda.tribunet.v42y2017.factura.ReceptorType());
        f.setDetalleServicio(new cr.go.hacienda.tribunet.v42y2017.factura.FacturaElectronica.DetalleServicio());
        return f;
    }

    private static cr.go.hacienda.tribunet.v42y2017.tiquete.TiqueteElectronico tiqueteV42y2017() {
        var t = new cr.go.hacienda.tribunet.v42y2017.tiquete.TiqueteElectronico();
        t.setEmisor(new cr.go.hacienda.tribunet.v42y2017.tiquete.EmisorType());
        t.setReceptor(new cr.go.hacienda.tribunet.v42y2017.tiquete.ReceptorType());
        t.setDetalleServicio(new cr.go.hacienda.tribunet.v42y2017.tiquete.TiqueteElectronico.DetalleServicio());
        return t;
    }

    private static cr.go.hacienda.tribunet.v43.factura.FacturaElectronica facturaV43() {
        var f = new cr.go.hacienda.tribunet.v43.factura.FacturaElectronica();
        f.setEmisor(new cr.go.hacienda.tribunet.v43.factura.EmisorType());
        f.setReceptor(new cr.go.hacienda.tribunet.v43.factura.ReceptorType());
        f.setDetalleServicio(new cr.go.hacienda.tribunet.v43.factura.FacturaElectronica.DetalleServicio());
        f.setResumenFactura(new cr.go.hacienda.tribunet.v43.factura.FacturaElectronica.ResumenFactura());
        return f;
    }

    private static cr.go.hacienda.tribunet.v43.tiquete.TiqueteElectronico tiqueteV43() {
        var t = new cr.go.hacienda.tribunet.v43.tiquete.TiqueteElectronico();
        t.setEmisor(new cr.go.hacienda.tribunet.v43.tiquete.EmisorType());
        t.setReceptor(new cr.go.hacienda.tribunet.v43.tiquete.ReceptorType());
        t.setDetalleServicio(new cr.go.hacienda.tribunet.v43.tiquete.TiqueteElectronico.DetalleServicio());
        t.setResumenFactura(new cr.go.hacienda.tribunet.v43.tiquete.TiqueteElectronico.ResumenFactura());
        return t;
    }

    private static cr.go.hacienda.tribunet.v42y2016.nota.credito.NotaCreditoElectronica notaCreditoV42y2016() {
        var n = new cr.go.hacienda.tribunet.v42y2016.nota.credito.NotaCreditoElectronica();
        n.setEmisor(new cr.go.hacienda.tribunet.v42y2016.nota.credito.EmisorType());
        n.setReceptor(new cr.go.hacienda.tribunet.v42y2016.nota.credito.ReceptorType());
        n.setDetalleServicio(new cr.go.hacienda.tribunet.v42y2016.nota.credito.NotaCreditoElectronica.DetalleServicio());
        return n;
    }

    private static cr.go.hacienda.tribunet.v42y2017.nota.credito.NotaCreditoElectronica notaCreditoV42y2017() {
        var n = new cr.go.hacienda.tribunet.v42y2017.nota.credito.NotaCreditoElectronica();
        n.setEmisor(new cr.go.hacienda.tribunet.v42y2017.nota.credito.EmisorType());
        n.setReceptor(new cr.go.hacienda.tribunet.v42y2017.nota.credito.ReceptorType());
        n.setDetalleServicio(new cr.go.hacienda.tribunet.v42y2017.nota.credito.NotaCreditoElectronica.DetalleServicio());
        return n;
    }

    private static cr.go.hacienda.tribunet.v43.nota.credito.NotaCreditoElectronica notaCreditoV43() {
        var n = new cr.go.hacienda.tribunet.v43.nota.credito.NotaCreditoElectronica();
        n.setEmisor(new cr.go.hacienda.tribunet.v43.nota.credito.EmisorType());
        n.setReceptor(new cr.go.hacienda.tribunet.v43.nota.credito.ReceptorType());
        n.setDetalleServicio(new cr.go.hacienda.tribunet.v43.nota.credito.NotaCreditoElectronica.DetalleServicio());
        n.setResumenFactura(new cr.go.hacienda.tribunet.v43.nota.credito.NotaCreditoElectronica.ResumenFactura());
        return n;
    }

    private static cr.go.hacienda.tribunet.v42y2016.nota.debito.NotaDebitoElectronica notaDebitoV42y2016() {
        var n = new cr.go.hacienda.tribunet.v42y2016.nota.debito.NotaDebitoElectronica();
        n.setEmisor(new cr.go.hacienda.tribunet.v42y2016.nota.debito.EmisorType());
        n.setReceptor(new cr.go.hacienda.tribunet.v42y2016.nota.debito.ReceptorType());
        n.setDetalleServicio(new cr.go.hacienda.tribunet.v42y2016.nota.debito.NotaDebitoElectronica.DetalleServicio());
        return n;
    }

    private static cr.go.hacienda.tribunet.v42y2017.nota.debito.NotaDebitoElectronica notaDebitoV42y2017() {
        var n = new cr.go.hacienda.tribunet.v42y2017.nota.debito.NotaDebitoElectronica();
        n.setEmisor(new cr.go.hacienda.tribunet.v42y2017.nota.debito.EmisorType());
        n.setReceptor(new cr.go.hacienda.tribunet.v42y2017.nota.debito.ReceptorType());
        n.setDetalleServicio(new cr.go.hacienda.tribunet.v42y2017.nota.debito.NotaDebitoElectronica.DetalleServicio());
        return n;
    }

    private static cr.go.hacienda.tribunet.v43.nota.debito.NotaDebitoElectronica notaDebitoV43() {
        var n = new cr.go.hacienda.tribunet.v43.nota.debito.NotaDebitoElectronica();
        n.setEmisor(new cr.go.hacienda.tribunet.v43.nota.debito.EmisorType());
        n.setReceptor(new cr.go.hacienda.tribunet.v43.nota.debito.ReceptorType());
        n.setDetalleServicio(new cr.go.hacienda.tribunet.v43.nota.debito.NotaDebitoElectronica.DetalleServicio());
        n.setResumenFactura(new cr.go.hacienda.tribunet.v43.nota.debito.NotaDebitoElectronica.ResumenFactura());
        return n;
    }

    // ---- FacturaFactory ----

    @Test
    void facturaFactory_supportedClasses_nonEmpty() {
        assertTrue(new FacturaFactory().supportedClasses().length > 0);
    }

    @Test
    void facturaFactory_adapt_v42y2016_factura() {
        Factura result = new FacturaFactory().adapt(facturaV42y2016());
        assertNotNull(result);
        assertNull(result.getClave());
        assertNull(result.getFechaEmision());
    }

    @Test
    void facturaFactory_adapt_v42y2016_tiquete() {
        assertNotNull(new FacturaFactory().adapt(tiqueteV42y2016()));
    }

    @Test
    void facturaFactory_adapt_v42y2017_factura() {
        assertNotNull(new FacturaFactory().adapt(facturaV42y2017()));
    }

    @Test
    void facturaFactory_adapt_v42y2017_tiquete() {
        assertNotNull(new FacturaFactory().adapt(tiqueteV42y2017()));
    }

    @Test
    void facturaFactory_adapt_v43_factura() {
        assertNotNull(new FacturaFactory().adapt(facturaV43()));
    }

    @Test
    void facturaFactory_adapt_v43_tiquete() {
        assertNotNull(new FacturaFactory().adapt(tiqueteV43()));
    }

    @Test
    void facturaFactory_adapt_unsupported_returnsNull() {
        FacturaFactory factory = new FacturaFactory();
        assertNull(factory.adapt("unsupported"));
        assertNull(factory.adapt(42));
        assertNull(factory.adapt(null));
    }

    @Test
    void facturaFactory_adapted_getters_delegateToTarget() {
        var target = facturaV42y2016();
        target.setClave("50601012310000000000000000000000000000001112345678");
        Factura factura = new FacturaFactory().adapt(target);
        assertEquals("50601012310000000000000000000000000000001112345678", factura.getClave());
        assertNotNull(factura.getEmisor());
        assertNotNull(factura.getReceptor());
        assertNotNull(factura.getDetalleServicio());
        assertNotNull(factura.getResumenFactura());
    }

    // ---- MensajeHaciendaFactory ----

    @Test
    void mensajeHaciendaFactory_supportedClasses_nonEmpty() {
        assertTrue(new MensajeHaciendaFactory().supportedClasses().length > 0);
    }

    @Test
    void mensajeHaciendaFactory_adapt_v42y2016() {
        assertNotNull(new MensajeHaciendaFactory().adapt(
                new cr.go.hacienda.tribunet.v42y2016.mensaje.hacienda.MensajeHacienda()));
    }

    @Test
    void mensajeHaciendaFactory_adapt_v42y2017() {
        assertNotNull(new MensajeHaciendaFactory().adapt(
                new cr.go.hacienda.tribunet.v42y2017.mensaje.hacienda.MensajeHacienda()));
    }

    @Test
    void mensajeHaciendaFactory_adapt_v43() {
        assertNotNull(new MensajeHaciendaFactory().adapt(
                new cr.go.hacienda.tribunet.v43.mensaje.hacienda.MensajeHacienda()));
    }

    @Test
    void mensajeHaciendaFactory_adapt_unsupported_returnsNull() {
        assertNull(new MensajeHaciendaFactory().adapt(null));
        assertNull(new MensajeHaciendaFactory().adapt("x"));
    }

    // ---- NotaCreditoFactory ----

    @Test
    void notaCreditoFactory_supportedClasses_nonEmpty() {
        assertTrue(new NotaCreditoFactory().supportedClasses().length > 0);
    }

    @Test
    void notaCreditoFactory_adapt_v42y2016() {
        assertNotNull(new NotaCreditoFactory().adapt(notaCreditoV42y2016()));
    }

    @Test
    void notaCreditoFactory_adapt_v42y2017() {
        assertNotNull(new NotaCreditoFactory().adapt(notaCreditoV42y2017()));
    }

    @Test
    void notaCreditoFactory_adapt_v43() {
        assertNotNull(new NotaCreditoFactory().adapt(notaCreditoV43()));
    }

    @Test
    void notaCreditoFactory_adapt_unsupported_returnsNull() {
        assertNull(new NotaCreditoFactory().adapt(null));
        assertNull(new NotaCreditoFactory().adapt("x"));
    }

    // ---- NotaDebitoFactory ----

    @Test
    void notaDebitoFactory_supportedClasses_nonEmpty() {
        assertTrue(new NotaDebitoFactory().supportedClasses().length > 0);
    }

    @Test
    void notaDebitoFactory_adapt_v42y2016() {
        assertNotNull(new NotaDebitoFactory().adapt(notaDebitoV42y2016()));
    }

    @Test
    void notaDebitoFactory_adapt_v42y2017() {
        assertNotNull(new NotaDebitoFactory().adapt(notaDebitoV42y2017()));
    }

    @Test
    void notaDebitoFactory_adapt_v43() {
        assertNotNull(new NotaDebitoFactory().adapt(notaDebitoV43()));
    }

    @Test
    void notaDebitoFactory_adapt_unsupported_returnsNull() {
        assertNull(new NotaDebitoFactory().adapt(null));
        assertNull(new NotaDebitoFactory().adapt("x"));
    }

    // ---- AdaptAnnotation & AdapterFactory ----

    @Test
    void adaptAnnotation_isPresentOnFactura() {
        assertNotNull(Factura.class.getAnnotation(name.julatec.ekonomi.tribunet.annotation.Adapt.class));
    }

    @Test
    void adaptAnnotation_factura_hasMultipleTargetClasses() {
        var adapt = Factura.class.getAnnotation(name.julatec.ekonomi.tribunet.annotation.Adapt.class);
        assertTrue(adapt.value().length > 1);
    }

    @Test
    void adapterFactory_facturaFactory_implementsInterface() {
        AdapterFactory factory = new FacturaFactory();
        assertNotNull(factory.supportedClasses());
    }
}
