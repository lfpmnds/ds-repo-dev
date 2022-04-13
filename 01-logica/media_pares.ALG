Algoritmo "media_pares"

Var

   n, i, somaPar, quantidadePar : inteiro
   vet : vetor [0..9] de inteiro
   media : real

Inicio
   escreva("Quantos elementos vai ter o vetor? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      escreva("Digite um número: ")
      leia(vet[i])
   fimpara
   
   somaPar <- 0
   quantidadePar <- 0
   
   para i de 0 ate n-1 faca
      se vet[i] % 2 = 0 entao
         somaPar <- somaPar + vet[i]
         quantidadePar <- quantidadePar + 1
      fimse
   fimpara

   se quantidadePar = 0 entao
      escreval("NENHUM NÚMERO PAR")
   senao
      media <- somaPar / quantidadePar
      escreva("MÉDIA DOS PARES = ", media:4:1)
   fimse

Fimalgoritmo