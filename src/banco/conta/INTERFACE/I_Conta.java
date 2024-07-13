package banco.conta.INTERFACE;

import banco.conta.Conta;

public interface I_Conta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
