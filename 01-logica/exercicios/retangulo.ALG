Algoritmo "retangulo"

Var

   base, altura, area, perimetro, diagonal : real

Inicio

   escreva("Digite o valor da base do ret�ngulo: ")
   leia(base)
   escreva("Digite o valor da altura do ret�ngulo: ")
   leia(altura)
   
   area <- base * altura
   perimetro <- base * 2.00 + altura * 2.00
   diagonal <- raizQ(Exp(base, 2) + Exp(altura, 2))
   
   escreval
   escreval("�rea do ret�ngulo =", area:8:4)
   escreval("Per�metro do ret�ngulo =", perimetro:8:4)
   escreval("Diagonal do ret�ngulo =", diagonal:8:4)

Fimalgoritmo