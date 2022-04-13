Algoritmo "divisao"

Var

   numerador, denominador, n, i : inteiro
   produto : real

Inicio

   escreva("Quantos casos você vai digitar? ")
   leia(n)
   
   para i de 1 ate n faca
      escreva("Entre com o numerador: ")
      leia(numerador)
      escreva("Entre com o denominador: ")
      leia(denominador)
      
      se denominador = 0 entao
         escreval("DIVISÃO IMPOSSÍVEL")
      senao
         produto <- numerador / denominador
         escreval("DIVISÃO = ", produto:3:2)
      fimse
   fimpara

Fimalgoritmo