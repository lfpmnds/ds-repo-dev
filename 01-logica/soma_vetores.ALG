Algoritmo "soma_vetores"

Var

   n, i, somaVet : inteiro
   vetA, vetB, vetC : vetor [0..99] de inteiro

Inicio
   escreva("Quantos valores vai ter cada vetor? ")
   leia(n)
   
   escreval("Digite os valores do vetor A:")
   para i de 0 ate n-1 faca
      leia(vetA[i])
   fimpara

   escreval("Digite os valores do vetor B:")
   para i de 0 ate n-1 faca
      leia(vetB[i])
   fimpara
   
   escreval("Vetor resultante:")
   para i de 0 ate n-1 faca
      somaVet <- vetA[i] + vetB[i]
      escreval(somaVet)
   fimpara


Fimalgoritmo