Algoritmo "lanchonete"

Var

   preco, precoFinal : real
   quantidade, produto: inteiro

Inicio

   escreva("Código do produto comprado: ")
   leia(produto)
   
   escolha produto
      caso 1
         preco <- 5.00
      caso 2
         preco <- 3.50
      caso 3
         preco <- 4.80
      caso 4
         preco <- 8.90
      caso 5
         preco <- 7.32
   fimescolha

   escreval("Preço unitário: R$", preco:8:2)
   escreva("Quantidade comprada: ")
   leia(quantidade)
   
   precoFinal <- preco * quantidade
   
   escreval("Valor a pagar: R$ ", precoFinal:8:2)

   
Fimalgoritmo