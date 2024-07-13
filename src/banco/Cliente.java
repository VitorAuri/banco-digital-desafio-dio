package banco;

import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class Cliente {
    private String nome;
    private Conta contaCorrente;
    private Conta contaPoupanca;

    protected Cliente(String nome) {
        this.nome = nome;
        this.contaCorrente = new ContaCorrente();
        this.contaPoupanca = new ContaPoupanca();
    }

    public void imprimirExtratoCorrente() {
        contaCorrente.imprimirExtrato();
        System.out.println("Nome: " + this.nome);
    }

    public void imprimirExtratoPoupanca() {
        contaPoupanca.imprimirExtrato();
        System.out.println("Nome: " + this.nome);
    }

    @Override
    public String toString() {
        return nome;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }
}
