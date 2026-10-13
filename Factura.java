
public class Factura {

    private String numeroFactura;
    private String cliente;
    private double montoNeto;


    public Factura(String numeroFactura, String cliente, double montoNeto) {

        if (montoNeto < 0) {
            throw new IllegalArgumentException(
                    "El monto neto no puede ser negativo"
            );
        }

        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.montoNeto = montoNeto;
    }


    public double calcularTotalConIVA() {
        return montoNeto * 1.21;
    }


    public double calcularIVA() {
        return montoNeto * 0.21;
    }


    public String getNumeroFactura() {
        return numeroFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMontoNeto() {
        return montoNeto;
    }
}
