programa
{
	
	funcao inicio()
	{
	 
	  inteiro valor, somaValor=0, media, contValor=0
         escreva("Digite um valor: ")
         leia(valor)

         enquanto(valor>=0){
             contValor++
             somaValor += valor
             escreva("Digite um valor: ")
             leia(valor)
         }

         media = somaValor/contValor
         escreva("\n\nA média de valores é igual a " + media)
         escreva("\n\nTotal de valores somados é igual a " + contValor + "\n\n")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 503; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */