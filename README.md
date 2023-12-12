# Purchase - Gerenciamento de Compras
Aplicação de gerenciamento de compras com cartão de crédito proposto pela plataforma Alura.


# Descrição
A aplicação utiliza conceitos de listas e ordenação, permitindo que o usuário adicione compras com descrição e valor, e verifica se o saldo disponível no cartão de crédito é suficiente para realizar a compra. 
Ao final, informa as compras realizadas ordenadas por valor e o saldo restante no cartão.

# Conceitos e Estruturas Aplicadas

## Interface List & ArrayList

Utilização da _interface List_ e a implementação concreta _ArrayList_ na classe ``CartaoDeCredito`` para armazenar as compras feitas com o cartão.
A lista `compras` na classe `CartaoDeCredito` é uma estrutura que mantém objetos do tipo `Compra`.


## Comparable & compareTo

`Comparable` é implementado na classe `Compra` por meio da interface `Comparable<Compra>`.
O método `compareTo` é implementado na classe `Compra` para permitir a comparação entre objetos do tipo `Compra` com base no valor das compras.
A lógica de comparação é realizada no método `compareTo`, comparando os valores das compras para _ordenação_.


## toString

Utilizado na classe `Compra` para fornecer uma representação em forma de string dos objetos dessa classe.
O método `toString` é _sobrescrito_ na classe `Compra` para retornar uma representação da compra no formato de string contendo a descrição e o valor da compra.


## While

Permite que o usuário insira informações sobre as compras enquanto decide continuar ou sair do programa.

## ForEach

Percorre a lista de compras `credito.getCompras()` e exibe as descrições e valores das compras.

Esses conceitos são fundamentais na programação Java orientada a objetos e são aplicados no código para permitir a representação, comparação e manipulação de compras feitas com um cartão de crédito.

# Fluxo
```
Olá! Seja bem-vindo(a) ao Purchase!

A aplicação permite que você gerencie suas compras e consulte seu limite.

Aliás, para prosseguirmos, pode nos informar o seu limite de cartão de crédito? :)
100

Informe-nos a descrição da compra efetuada: 
Mouse

Agora, precisamos que digite o valor dessa compra: 
50

Compra realizada com sucesso!

Para sair, digite 0. Se deseja continuar, digite 1:
1

Informe-nos a descrição da compra efetuada: 
Fone

Agora, precisamos que digite o valor dessa compra: 
40

Compra realizada com sucesso!

Para sair, digite 0. Se deseja continuar, digite 1:
1

Informe-nos a descrição da compra efetuada: 
Teclado

Agora, precisamos que digite o valor dessa compra: 
70

Sentimos muito... não podemos prosseguir, pois o seu saldo é insuficiente

***********************
COMPRAS EFETUADAS

Fone - 40.0
Mouse - 50.0
***********************

Saldo do cartão de crédito: 10.0
```

# Referências

https://www.alura.com.br/apostila-java-orientacao-objetos/collections-framework?_gl=1*x823ad*_ga*MjAxNTIyMDMyNi4xNjgxMzI4MzY3*_ga_1EPWSW3PCS*MTcwMjQwNzUwNy4xMi4xLjE3MDI0MDc1ODAuMC4wLjA.*_fplc*YjBpdEtSNVZLb0l2JTJGUDU1cERnJTJCZ1duVlJwZlhzZ0ZpZkNIa2RNWGtLck5MUHIlMkY1dmh6MHU0STZCVVlLSElXVFQ2dUhHcU1JeXN0dWcwczhQQTd1aW5tM0RtTEQxWkhkc3NvMFhqaURmQVdDdzV3UklmRkp1eWdPbzVYbEdRJTNEJTNE

https://www.alura.com.br/artigos/ordenando-colecoes-com-comparable-e-comparator?_gl=1*jt6rm0*_ga*MjAxNTIyMDMyNi4xNjgxMzI4MzY3*_ga_1EPWSW3PCS*MTcwMjMyMzYyOS45LjEuMTcwMjMyNzA2MC4wLjAuMA.._fplcU0FBQ3BpZUt4djNsakYlMkJnUHBHVDV6UXYzQnpLTTR6Qmdmcko2Y0pjZ3lYQzVaNTF2b3h5ZzY4OFVJd3NYc3BFVm9KNyUyQmplcm41OUxuNkt5dXBUSkJpdHRpcXpqUEcxQyUyQjM3NXAlMkZMYTNPa3pRTGZDRk9CMEx4T05qamtxeFElM0QlM0Q

https://www.alura.com.br/artigos/estrutura-dados-computacao-na-pratica-com-java?_gl=1*oinb35*_ga*MjAxNTIyMDMyNi4xNjgxMzI4MzY3*_ga_1EPWSW3PCS*MTcwMjMyMzYyOS45LjEuMTcwMjMyODkzNS4wLjAuMA.._fplcU0FBQ3BpZUt4djNsakYlMkJnUHBHVDV6UXYzQnpLTTR6Qmdmcko2Y0pjZ3lYQzVaNTF2b3h5ZzY4OFVJd3NYc3BFVm9KNyUyQmplcm41OUxuNkt5dXBUSkJpdHRpcXpqUEcxQyUyQjM3NXAlMkZMYTNPa3pRTGZDRk9CMEx4T05qamtxeFElM0QlM0Q.

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html
