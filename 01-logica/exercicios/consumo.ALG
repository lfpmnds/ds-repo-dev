Algoritmo "consumo"

Var

   distancia, combustivel, gasto : real

Inicio

   escreva("Dist�ncia percorrida pelo carro (em km): ")
   leia(distancia)
   escreva("Combust�vel gasto pelo carro (em l): ")
   leia(combustivel)
   
   gasto <- distancia / combustivel
   
   escreval
   escreval("Consumo m�dio: ", gasto:8:3)


Fimalgoritmo