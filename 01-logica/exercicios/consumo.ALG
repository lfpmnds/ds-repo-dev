Algoritmo "consumo"

Var

   distancia, combustivel, gasto : real

Inicio

   escreva("Distância percorrida pelo carro (em km): ")
   leia(distancia)
   escreva("Combustível gasto pelo carro (em l): ")
   leia(combustivel)
   
   gasto <- distancia / combustivel
   
   escreval
   escreval("Consumo médio: ", gasto:8:3)


Fimalgoritmo