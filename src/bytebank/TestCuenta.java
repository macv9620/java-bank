package bytebank;

public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1, 1);
        cc.deposita(5000);
        System.out.println(cc.getSaldo());


        CuentaAhorros ca = new CuentaAhorros(2, 3);
        ca.deposita(2000);
        System.out.println(ca.getSaldo());

        cc.transfiere(200, ca);
        System.out.println("Saldo cc: " + cc.getSaldo());
        System.out.println("Saldo ca: " + ca.getSaldo());
        System.out.println("Comision acumulada: " + Cuenta.getComisionCobrada());

        ca.transfiere(1000, cc);
        System.out.println("Saldo cc: " + cc.getSaldo());
        System.out.println("Saldo ca: " + ca.getSaldo());
        System.out.println("Comision acumulada: " + Cuenta.getComisionCobrada());
    }
}
