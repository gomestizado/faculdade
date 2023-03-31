#include <stdio.h>

//AVA2 - Matheus Gomes Coelho

int numero(int num)
{
	if (num %2 == 0)
 		return 0;
 	else
 		return 1;
}

int main ()
{
	int num1, num2, res, tipo, contpar = 0;
	
	printf ("Par ou Impar\n\n");
	
	printf ("Digite o primeiro valor: ");
	scanf ("%i", &num1);
	printf ("\nDigite o segundo valor: ");
	scanf ("%i", &num2);	
	
	for(res=num1; res<=num2; res++)
	{			
	tipo = numero(res);
	
	if (tipo==0)
		{
		printf("O numero %i e PAR \n", res);
		contpar++;
		}
	else if (tipo==1)
		{
		printf("O numero %i e IMPAR \n", res);
		}	
	}
	printf("A quantidade de numeros pares e %i", contpar);
}