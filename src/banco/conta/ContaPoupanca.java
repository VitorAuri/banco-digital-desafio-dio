package banco.conta;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA POUPANCA ===");
        super.imprimirInfosComuns();
    }
}
