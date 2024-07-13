import banco.Banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Santander");


        banco.criarCliente("Jorge");
        banco.criarCliente("Claudio");
        banco.imprimirListaClientes();
        banco.procurarCliente("jorge");


    }
}
