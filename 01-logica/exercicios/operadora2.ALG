Algoritmo "operadora"


Var

   minutos : inteiro
   valorFinal : real

Inicio


   escreva("Digite a quantidade de minutos: ")
   leia(minutos)
   
   valorFinal <- 50.00

   se minutos <= 100 então
      escreval("Valor a pagar: R$ ", valorFinal:8:2)
      senao

         valorFinal <- valorFinal + (minutos - 100) * 2
         
         escreval("Valor a pagar: R$ ", valorFinal:8:2)
   fimse

Fimalgoritmo