Algoritmo "aumento"

Var

   salario, novoSalario, aumento : real
   porcentagem : inteiro

Inicio

   escreva("Digite o salário da pessoa: ")
   leia(salario)
   
   se salario <= 1000.0 entao
      novoSalario <- salario + salario * 0.2
      porcentagem <- 20
   senao
      se salario <= 3000.0 entao
         novoSalario <- salario + salario * 0.15
         porcentagem <- 15
      senao
         se salario <= 8000.0 entao
            novoSalario <- salario + salario * 0.1
            porcentagem <- 10
         senao
            novoSalario <- salario + salario * 0.05
            porcentagem <- 5
         fimse
      fimse
   fimse
   escreval("Novo salário: R$ ", novoSalario:10:2)
   escreval("Aumento: R$ ", (novoSalario - salario):10:2)
   escreval("Porcentagem = ", porcentagem, " %")

Fimalgoritmo