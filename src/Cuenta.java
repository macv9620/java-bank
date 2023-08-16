public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Titular: " + this.titular.nombre);
        System.out.println("Depositar: " + valor);
        System.out.println("Saldo depositado con éxito, nuevo saldo: " + this.saldo);
    }

    public void retirar(double valor){
        if((this.saldo - valor) <= 0.0){
            System.out.println("Titular: " + this.titular.nombre);
            System.out.println("Retirar: " + valor);
            System.out.println("No tienes saldo suficiente para retirar");
        } else {
            this.saldo -= valor;
            System.out.println("Titular: " + this.titular.nombre);
            System.out.println("Retirar: " + valor);
            System.out.println("Saldo retirado con éxito, nuevo saldo: " + this.saldo);
        }
    }

    public void transferir (Cuenta cuenta, double valor){
        if((this.saldo - valor) <= 0.0){
            System.out.println("Titular: " + this.titular.nombre);
            System.out.println("Transferir: " + valor);
            System.out.println("No tienes saldo suficiente para transferir");
        } else {
            this.saldo -= valor;
            cuenta.saldo += valor;
            System.out.println("Transferir: " + valor);
            System.out.println("Transferencia exitosa");
            System.out.println("Titular: " + this.titular.nombre);
            System.out.println("Saldo cuenta origen: " + this.saldo);
            System.out.println("Titular: " + cuenta.titular.nombre);
            System.out.println("Saldo cuenta destino: " + cuenta.saldo);
        }
    }
}
