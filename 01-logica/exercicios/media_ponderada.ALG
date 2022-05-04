Algoritmo "media_ponderada"

Var

   n, i : inteiro
   a, b, c, media : real

Inicio

   escreva("Quantos casos você vai digitar? ")
   leia(n)
   
   para i de 1 ate n faca
      escreval("Digite três números:")
      leia(a)
      leia(b)
      leia(c)

      media <- (a * 2 + b * 3 + c * 5) / 10

      escreval("MÉDIA = ", media:4:1)
   fimpara

Fimalgoritmo