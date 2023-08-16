public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.titular = new Cliente();
        primeraCuenta.titular.nombre = "Mateo Vasco";

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.titular = new Cliente();
        segundaCuenta.titular.nombre = "Juliana Cortes";

        primeraCuenta.depositar(1000);
        primeraCuenta.retirar(250);

        segundaCuenta.depositar(4000);
        segundaCuenta.retirar(1500);

        primeraCuenta.transferir(segundaCuenta, 90);

        primeraCuenta.retirar(10000);
        segundaCuenta.retirar(10000);
    }
}
