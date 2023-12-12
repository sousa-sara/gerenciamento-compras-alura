package br.com.purchase.compra;
import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

    private double limite;
    private double saldo;
    private List<Compra> compras; // Lista de compras feitas com o cartão

    // Construtor da classe CartaoDeCredito, requerindo a definição do limite do cartão
    // O saldo é inicializado com o mesmo valor do limite e a lista de compras é criada como vazia
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    // Método para registrar uma compra no cartão de crédito
    // Verifica se há saldo disponível para a compra e, se sim, realiza o lançamento da compra no cartão
    // Adiciona a compra à lista de compras e atualiza o saldo do cartão
    public boolean lancaCompra(Compra compra) {
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true; // Retorna verdadeiro se a compra foi realizada com sucesso
        }
        return false; // Retorna falso se não houver saldo suficiente para a compra
    }

    // Método para obter o limite do cartão
    public double getLimite() {
        return limite;
    }

    // Método para obter o saldo disponível no cartão
    public double getSaldo() {
        return saldo;
    }

    // Método para obter a lista de compras feitas com o cartão
    public List<Compra> getCompras() {
        return compras;
    }
}