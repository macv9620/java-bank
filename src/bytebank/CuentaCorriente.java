package bytebank;

public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double comision = 5.0;
        super.setComisionCobrada(comision);
        return super.saca((valor + comision));
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }
}
