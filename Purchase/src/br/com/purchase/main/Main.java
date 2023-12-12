package br.com.purchase.main;
import br.com.purchase.compra.CartaoDeCredito;
import br.com.purchase.compra.Compra;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Cria um objeto Scanner para receber entrada do usuário
        Scanner leitura = new Scanner(System.in);

        // Apresenta uma mensagem de boas-vindas e solicita o limite do cartão de crédito ao usuário
        System.out.println("\nOlá! Seja bem-vindo(a) ao Purchase!\n" +
                "\nA aplicação permite que você gerencie suas compras e consulte seu limite.\n" +
                "\nAliás, para prosseguirmos, pode nos informar o seu limite de cartão de crédito? :)");
        double limite = leitura.nextDouble(); // Lê o limite do cartão de crédito

        // Cria um objeto CartaoDeCredito com o limite fornecido
        CartaoDeCredito credito = new CartaoDeCredito(limite);

        int opcao = 1;

        // Entra em um loop para permitir ao usuário inserir informações sobre compras
        while(opcao != 0) {

            // Solicita ao usuário a descrição da compra
            System.out.println("\nInforme-nos a descrição da compra efetuada: ");
            String descricao = leitura.next();

            // Solicita ao usuário o valor da compra
            System.out.println("\nAgora, precisamos que digite o valor dessa compra: ");
            double valor = leitura.nextDouble();

            // Cria um objeto Compra com a descrição e o valor fornecidos
            Compra compra = new Compra(descricao, valor);

            // Verifica se a compra pode ser realizada com base no saldo disponível
            boolean compraRealizada = credito.lancaCompra(compra);

            // Exibe mensagens de acordo com o resultado da tentativa de compra
            if(compraRealizada) {
                System.out.println("\nCompra realizada com sucesso!");
                System.out.println("\nPara sair, digite 0. Se deseja continuar, digite 1:");
                opcao = leitura.nextInt(); // Permite ao usuário decidir continuar ou sair
            } else {
                System.out.println("\nSentimos muito... não podemos prosseguir, pois o seu saldo é insuficiente");
                opcao = 0; // Encerra o loop caso o saldo seja insuficiente
            }
        }

        // Apresenta as compras efetuadas ordenadas por ordem alfabética da descrição
        System.out.println("\n***********************");
        System.out.println("COMPRAS EFETUADAS\n");

        Collections.sort(credito.getCompras()); // Ordena as compras por descrição
        for (Compra c : credito.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor()); // Exibe a descrição e o valor de cada compra
        }

        // Exibe o saldo restante no cartão de crédito após as compras
        System.out.println("***********************");
        System.out.println("\nSaldo do cartão de crédito: " + credito.getSaldo());
    }
}