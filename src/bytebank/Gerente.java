package bytebank;

public class Gerente extends Funcionario implements InterfazPuedeAutenticar{
    private String clave;

    public void setClave(String clave){
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        if(clave == this.clave){
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Login erroneo");
            return false;
        }
    }
    @Override
    public double getBonificacion(){
        return super.getSalario()*1.1;
    }

}
