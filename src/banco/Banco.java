package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> contaList;

    public Banco(String nome) {
        this.nome = nome;
        this.contaList = new ArrayList<>();
    }

    public void criarCliente(String nomeCliente) {
        contaList.add(new Cliente(nomeCliente));
    }

    public void removerCliente(String nomeCliente) {
        boolean clienteEncontrado = false;
        if(!contaList.isEmpty()) {
            for (Cliente cliente : contaList) {
                if(cliente.getNome().equalsIgnoreCase(nomeCliente)) {
                    clienteEncontrado = true;
                    contaList.remove(cliente);
                    System.out.println("Cliente removido.");
                    break;
                }
            }
            if (!clienteEncontrado) {
                System.out.println("Cliente não encontrado.");
            }
        }
        else {
            System.out.println("Lista se encontra vazia.");
        }
    }

    public void procurarCliente(String nome) {
        boolean clienteEncontrado = false;
        if(!contaList.isEmpty()) {
            for (Cliente cliente : contaList) {
                if(cliente.getNome().equalsIgnoreCase(nome)) {
                    clienteEncontrado = true;
                    System.out.println("! CLIENTE ENCONTRADO, SEGUE INFORMAÇÕES !");
                    cliente.imprimirExtratoCorrente();
                    cliente.imprimirExtratoPoupanca();
                    break;
                }
            }
            if(!clienteEncontrado) {
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
