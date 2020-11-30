package separandoDigitos;

import java.util.Scanner;

public class Index {

	public static int contaDigitos(int x) {
		int contador = 0;
		
		if(x == 0)contador = 1;
		else {
			while(x != 0 ) {
				contador++;
				x = x/10;
			}
		}
		
		return contador;
	}
	
	
	public static void main(String[] args) {	
		int numero;
		int aux, qtdDigitos;
		int resto;
		int dividendo = 1;		
		Scanner leitor = new Scanner(System.in);

		
		System.out.print("Insira um numero de 5 digitos \n");		
		try {
			numero  = Integer.parseInt(leitor.nextLine());
		}catch(Exception e) {
			throw new Error("Não é um numero inteiro");
		}
		
		
		System.out.print("\nSeu número:" + numero);
		System.out.print("\n ==============\n");
		
		qtdDigitos = contaDigitos(numero);
		
					
		if(qtdDigitos == 1) {
			System.out.print(numero);
		}
		else {
			for(int i = 0; i <qtdDigitos-1; i++) {
				dividendo = dividendo*10;
			}
			
			
			resto = numero%dividendo;
			aux = numero/dividendo;
			System.out.print("\n" +aux+", ");
			
			for(int i = 0; i <qtdDigitos-2; i++) {
				aux = resto/(dividendo = dividendo/10);
				resto = resto%(dividendo);
				System.out.print(aux+", ");
			}
			
			System.out.print(resto);
		}
	}
}
