programa
{
	
	funcao inicio()
	{
	 real habitante, salario = 0.0, salarioTotal = 0.0, numFilho, numFilhoTotal = 0.0, mediaSalario = 0.0, mediaFilhoTotal, maiorSalario, percentual, mediaFilho
      real pessoasAte100 = 0.0, numHab

      numHab = 5.0
      
	 para(habitante = 1.0; habitante <= 20; habitante++) {
	 	
	 	escreva("Qual o seu sálario?")
	 	leia(salario)
	 	escreva("Quantos filhos você tem?")
	 	leia(numFilho)

	 	salarioTotal = salarioTotal + salario
	 	numFilhoTotal = numFilhoTotal + numFilho

	 	se(salario > maiorSalario) {
	 		maiorSalario = salario
	 	}

	 	se(salario <= 100) {
	 		pessoasAte100++
	 	}
	 }

	 mediaSalario = salarioTotal / 20
	 mediaFilho = numFilhoTotal / 20
	 percentual = pessoasAte100 / 20 * 100

	 escreva("A média do sálario é de: R$" + mediaSalario)
	 escreva("\nA média de filhos por habitante é de: " + mediaFilho)
	 escreva("\nO maior sálario dentre os habitantes é de: R$" + maiorSalario)
	 escreva("\nO percentual de pessoas com sálario até R$100,00 é de " + percentual + "%!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 234; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */