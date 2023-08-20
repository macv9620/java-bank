package bytebank;

public interface InterfazPuedeAutenticar {
    public void setClave(String clave);
    public boolean iniciarSesion(String clave);
}
