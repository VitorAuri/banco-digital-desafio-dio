import banco.Banco;
import banco.Cliente;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Santander");

        banco.adicionarCliente("Jorge");
        banco.imprimirListaClientes();
        banco.procurarCliente("Jorge");
    }
}
