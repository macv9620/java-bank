package bytebank;

public class CuentaAhorros extends Cuenta {
    public CuentaAhorros(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double comision = 10.0;
        super.setComisionCobrada(comision);
        return super.saca((valor + comision));
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }
}
