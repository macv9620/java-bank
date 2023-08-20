package bytebank;

public class Cliente implements InterfazPuedeAutenticar{

    private String nombre;
    private String documento;
    private String telefono;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
