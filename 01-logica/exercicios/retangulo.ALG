Algoritmo "retangulo"

Var

   base, altura, area, perimetro, diagonal : real

Inicio

   escreva("Digite o valor da base do retângulo: ")
   leia(base)
   escreva("Digite o valor da altura do retângulo: ")
   leia(altura)
   
   area <- base * altura
   perimetro <- base * 2.00 + altura * 2.00
   diagonal <- raizQ(Exp(base, 2) + Exp(altura, 2))
   
   escreval
   escreval("Área do retângulo =", area:8:4)
   escreval("Perímetro do retângulo =", perimetro:8:4)
   escreval("Diagonal do retângulo =", diagonal:8:4)

Fimalgoritmo