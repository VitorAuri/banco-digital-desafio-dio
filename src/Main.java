import cliente.Cliente;
import conta.ContaCorrente;
import conta.Conta;
import conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Claudio");

        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);

        contaCorrente.depositar(10);
        contaCorrente.imprimirExtrato();
        contaCorrente.transferir(10,contaPoupanca);
        contaPoupanca.imprimirExtrato();
    }
}
