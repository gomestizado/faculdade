#include <stdio.h>

int main()
{
	float num1, num2, resultado;
	int escolha;
	
	//AVA1 - Matheus Gomes Coelho
	
	printf("Calculadora\nBem-vindo!\n\n");
	
	printf("(1) - Somar\n");
	printf("(2) - Subtrair\n");
	printf("(3) - Multiplicar\n");
	printf("(4) - Dividir\n\n");
	
	printf("Escolha de 1 a 4: ");
	scanf("%d", &escolha);
	
	printf("\nDigite o primeiro valor: ");
	scanf("%f", &num1);	
	printf("Digite o segundo valor: ");
	scanf("%f", &num2);
	
	if(escolha == 1)
	{
		resultado = num1 + num2;
	}
	if(escolha == 2)
	{
		resultado = num1 - num2;
	}
	if(escolha == 3)
	{
		resultado = num1 * num2;
	}
	if(escolha == 4)
	{
		resultado = num1 / num2;
	}

	printf("\nTotal: %f", resultado);
	
	return 0;
}