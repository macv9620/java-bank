package bytebank;

public class ControlBonificacion {
    private double totalBonicifacion;
    public double registrarBonificacion(Funcionario funcionario){
        this.totalBonicifacion = funcionario.getBonificacion() + this.totalBonicifacion;
        System.out.println("Bonificación acumulada: " + this.totalBonicifacion);
        return this.totalBonicifacion;
    }
}
