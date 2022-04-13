Algoritmo "temperatura"

Var

   fahrenheit, celsius : real
   temperatura : caractere

Inicio

   escreva("Voce vai digitar a temperatura em qual escala (C/F)? ")
   leia(temperatura)
   
   se temperatura = "F" entao
      escreva("Digite a temperatura em Fahrenheit: ")
      leia(fahrenheit)
      
      celsius <- (5 / 9) * (fahrenheit - 32)
   
      escreval("Temperatura equivalente em Celsius: ", celsius:8:2)
   senao
      escreva("Digite a temperatura em Celsius: ")
      leia(celsius)
      
      fahrenheit <- (9 / 5) * celsius + 32
      
      escreval("Temperatura equivalente em Fahrenheit: ", fahrenheit:8:2)
   fimse
   
Fimalgoritmo