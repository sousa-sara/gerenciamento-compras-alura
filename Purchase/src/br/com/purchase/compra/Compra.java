package br.com.purchase.compra;

// Declaração da classe Compra que implementa a interface Comparable
public class Compra implements Comparable<Compra> {

    // Declaração de variáveis privadas para descrição e valor da compra
    private String descricao;
    private double valor;

    // Construtor da classe Compra que recebe uma descrição e um valor como parâmetros
    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    // Método para obter a descrição da compra
    public String getDescricao() {
        return descricao;
    }

    // Método para obter o valor da compra
    public double getValor() {
        return valor;
    }

    // Sobrescrita do método toString para retornar uma representação da Compra em formato de string
    @Override
    public String toString() {
        return "Compra: descricao = " + descricao +
                " valor =" + valor;
    }

    // Implementação do método compareTo da interface Comparable para comparar Compras com base no valor
    @Override
    public int compareTo(Compra outraCompra) {
        // Compara o valor desta Compra com o valor de outraCompra e retorna o resultado da comparação
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}