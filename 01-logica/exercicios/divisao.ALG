Algoritmo "divisao"

Var

   numerador, denominador, n, i : inteiro
   produto : real

Inicio

   escreva("Quantos casos voc� vai digitar? ")
   leia(n)
   
   para i de 1 ate n faca
      escreva("Entre com o numerador: ")
      leia(numerador)
      escreva("Entre com o denominador: ")
      leia(denominador)
      
      se denominador = 0 entao
         escreval("DIVIS�O IMPOSS�VEL")
      senao
         produto <- numerador / denominador
         escreval("DIVIS�O = ", produto:3:2)
      fimse
   fimpara

Fimalgoritmo