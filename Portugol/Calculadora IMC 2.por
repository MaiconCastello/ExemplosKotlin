programa
{
	
	funcao inicio()
	{

	real altura, peso, IMC
	
	escreva("Bem-vinde a calculadora de IMC, preencha as informações de altura (m) e peso (kg) abaixo: (ex: 1.75, 84, 1.68)",
	"\nDica: Utilize apenas números e não coloque virgulas!")
	escreva("\n\nAltura (m): ")
	leia(altura)
	escreva("\nPeso (kg): ")
	leia(peso)

	IMC = peso/(altura*altura)

	se(IMC<18.5)
		{
		escreva("\nSeu IMC é ", IMC, ", ou seja, abaixo de 18.5, portanto você está Abaixo do peso :(")
		}

		se(IMC>=18.5 e IMC<25.0)
		{
		escreva("\nSeu IMC é ", IMC, ", ou seja, Entre 18.5 e 24.9, portanto você está Normal (Peso Ideal) :)")
		}

		se(IMC>=25.0 e IMC<30.0)
		{
		escreva("\nSeu IMC é ", IMC, ", ou seja, Entre 25.0 e 29.9, portanto você está com Sobrepeso :'^)")
		}
		
		se(IMC>=30.0 e IMC<40.0)
		{
		escreva("\nSeu IMC é ", IMC, ", ou seja, Entre 30.0 e 39.9, portanto você está com Obesidade :F")
		}

		se(IMC>40.0)
		{
		escreva("\nSeu IMC é ", IMC, ", ou seja, acima de 40.0, portanto você está com Obesidade Grave つ ◕_◕ つ take my energy つ ◕_◕ つ" )
		}
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1058; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */