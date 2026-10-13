
public class Main {

    public static void main(String[] args) {

        Factura factura = new Factura("F001", "Gabriel Morales", 10000);


        System.out.println("Número de factura: "
                + factura.getNumeroFactura());

        System.out.println("Cliente: "
                + factura.getCliente());

        System.out.println("Monto neto: $"
                + factura.getMontoNeto());

        System.out.println("IVA (21%): $"
                + factura.calcularIVA());

        System.out.println("Total con IVA: $"
                + factura.calcularTotalConIVA());
    }
}
