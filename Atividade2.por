programa
{
	
	funcao inicio()
	{
	     inteiro ano,mes,dia,dias

		escreva("Quantos dias de vida?")
		leia(dia)

		ano= dia / 365

		mes = (dia % 365) / 30

		dias= (dia % 365) % 30

		escreva("\nVoce possui "+ano+" anos, "+mes+" meses e "+dias+" dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 265; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */