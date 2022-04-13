Algoritmo "medidas"



Var

   a, b, c, areaQuadrado, areaTriangulo, areaTrapezio : real

Inicio

   escreva("Digite a medida A: ")
   leia(a)
   escreva("Digite a medida B: ")
   leia(b)
   escreva("Digite a medida C: ")
   leia(c)
   
   areaQuadrado <- a * a
   areaTriangulo <- (a * b) / 2
   areaTrapezio <- (a + b) * c / 2
   
   escreval
   escreval("Área do quadrado = ", areaQuadrado:8:4)
   escreval("Área do triângulo = ", areaTriangulo:8:4)
   escreval("Área do trapézio = ", areaTrapezio:8:4)

Fimalgoritmo