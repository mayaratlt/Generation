programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real n1,n2,n3,n4,q1,q2,q3,q4

		escreva("Insira o primeiro número: ")
		leia(n1)
		escreva("Insira o segundo número: ")
		leia(n2)
		escreva("Insira o terceiro número: ")
		leia(n3)
		escreva("Insira o quarto número: ")
		leia(n4)

		limpa()

		q1 = mat.potencia(n1, 2)
		q2 = mat.potencia(n2, 2)
		q3 = mat.potencia(n3, 2)
		q4 = mat.potencia(n4, 2)

		mat.arredondar(q1, 0)
		mat.arredondar(q2, 0)
		mat.arredondar(q3, 0)
		mat.arredondar(q4, 0)
		

		se (q3>=1000)
		{
			escreva("O valor do quadrado do terceiro número é maior que 1000, seu valor é de: "+q3)
		}
		senao escreva("O valor do quadrado dos números é, respectivamente: "+q1+", "+q2+", "+q3+", "+q4+".")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 40; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */