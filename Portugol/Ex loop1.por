programa
{
	
	funcao inicio()
	{
		real n=0, S=0, M=0
		inteiro qtd=-1
		
		enquanto(n>=0)
		{
		S+=n
		qtd++
		escreva("Digite um número:")
		leia(n)
		limpa()
		}
		
		M=S/qtd
		escreva("O somatorio (S) dos números lidos é:\nS = ",S)
		escreva("\nA média (M) dos números lidos é:\nM = ",M)
		escreva("\nA quantidade qtd) de números lidos é:\nqtd = ",qtd)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 33; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {S, 6, 12, 1}-{M, 6, 17, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */