programa
{
	
	funcao inicio()
	{
		
        real P, E, M

		escreva("Qual o peso de tomate")
		leia(P)

		se (P > 50) {
			E= P - 50
			M = E * 4
			escreva("Você excedeu o limite de peso em: " + E + "  kilos" 
			+"\nVocê deve pagar uma multa de: R$" +M) 
			
		} senao se (P <= 0) {
			escreva("Você não está levando mercadoria!")
		
		} senao se (P <= 50 e P > 0) {
			E= 0.0
			M= 0.0
			escreva("Multa = "+ M + "\nExcesso = " + E )
		}
		
		
	


	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 460; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */