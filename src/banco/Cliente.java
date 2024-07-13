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
        System.out.println("- - - "+this.nome.toUpperCase()+" - - -");
        contaCorrente.imprimirExtrato();
    }

    public void imprimirExtratoPoupanca() {
        System.out.println("- - - "+this.nome.toUpperCase()+" - - -");
        contaPoupanca.imprimirExtrato();
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
