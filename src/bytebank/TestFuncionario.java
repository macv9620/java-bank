package bytebank;

public class TestFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(2000);
        gerente.setClave("00010");
        Auth auth = new Auth();
        auth.autenticar("0000", gerente);
    }
}
