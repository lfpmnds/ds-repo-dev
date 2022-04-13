Algoritmo "troco"

Var

   preco, troco, dinheiro : real
   quantidade : inteiro

Inicio

   escreva("Preço unitário do produto: ")
   leia(preco)
   escreva("Quantidade comprada: ")
   leia(quantidade)
   escreva("Dinheiro recebido: ")
   leia(dinheiro)
   
   troco <- dinheiro - (preco * quantidade)
   
   escreval
   escreval("TROCO = ", troco:8:2)

Fimalgoritmo