package todosLosNumerosDeUnRango;

import java.util.Scanner;

public class TodosLosNumerosDeUnRango
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int cont = 0;
		int num;
		boolean repetido;
		while(cont < numeros.length)
		{
			System.out.print("Introduce número: ");
			num = sc.nextInt();
			if(num > 0 && num < 11)
			{
				repetido = false;
				for(int i = 0; i < numeros.length && !repetido; i++)
				{
					if(num == numeros[i])
					{
						repetido = true;
					}
				}
				if(!repetido)
				{
					numeros[cont] = num;
					cont++;
				}
			}
		}
		sc.close();
	}
}

