package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> contaList;

    public Banco(String nome) {
        this.nome = nome;
        this.contaList = new ArrayList<Cliente>();
    }

    public void adicionarCliente(String nomeCliente) {
        contaList.add(new Cliente(nomeCliente));
    }

    public void procurarCliente(String nome) {
        boolean clienteEncontrado = false;
        if(!contaList.isEmpty()) {
            for (Cliente cliente : contaList) {
                if(cliente.getNome().equalsIgnoreCase(nome)) {
                    clienteEncontrado = true;
                    cliente.imprimirExtratoCorrente();
                    cliente.imprimirExtratoPoupanca();
                    break;
                }
            }
            if(clienteEncontrado==false) {
                System.out.println("Cliente não encontrado.");
            }
        }
        else {
            System.out.println("Lista se encontra vazia.");
        }
    }

    public void imprimirListaClientes() {
        System.out.println(contaList);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
