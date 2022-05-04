Algoritmo "pagamento"

Var

   nome : caractere
   hora, valor, pagamento : real

Inicio

   escreva("Nome do funcionário: ")
   leia(nome)
   escreva("Horas trabalhadas: ")
   leia(hora)
   escreva("Valor da hora trabalhada: ")
   leia(valor)
   
   pagamento <- hora * valor
   
   escreval
   escreval("O funcionário ", nome, " deve receber R$ ", pagamento:8:2)

Fimalgoritmo