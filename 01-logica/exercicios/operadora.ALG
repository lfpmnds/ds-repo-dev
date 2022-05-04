Algoritmo "operadora"

Var

   minutos : inteiro
   valorFinal : real

Inicio

   escreva("Quantidade de minutos: ")
   leia(minutos)
   
   se minutos < 100 entao
      escreval("Total a pagar: R$ 50.00")
      senao
         valorFinal <- (minutos % 100) * 2 + 50.00
         
         escreval("Total a pagar: R$ ", valorFinal:6:2)
   fimse

Fimalgoritmo