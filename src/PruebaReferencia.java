public class PruebaReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 200;

        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.saldo = primeraCuenta.saldo;

        System.out.println(primeraCuenta.saldo);
        System.out.println(segundaCuenta.saldo);

        primeraCuenta.saldo = 4500;
        System.out.println(segundaCuenta.saldo);

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

    }
}
