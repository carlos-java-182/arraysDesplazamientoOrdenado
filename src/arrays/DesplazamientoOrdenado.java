package arrays;

import java.util.Scanner;

public class DesplazamientoOrdenado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero, posicion=0;
		boolean creciente = true;
		
		int arreglo[] = new int[10];
		
		do {
		
		for(int i=0; i<5; i++) {
			
			System.out.print(i+ ".- Digita los números de forma creciente: ");
			arreglo[i]= entrada.nextInt();
		}
		
		for(int i=0; i<4; i++) {
		if(arreglo[i]<arreglo[(i+1)]) {
			creciente=true;
		}
		if(arreglo[i]>arreglo[(i+1)]) {
			creciente=false;
			System.out.println("Los números no están en forma creciente");
			break;
			
			
		}}
		
		}while(creciente==false);
		
		
		
		System.out.println("Digita un número: ");
		numero = entrada.nextInt();
		
		int j=0;
		
		while(arreglo[j]<numero && j<5) {
			posicion++;
			j++;
		}
		
		for(int i=4; i>=posicion; i--) {
			arreglo[(i+1)]=arreglo[i];
		}
		
		arreglo[posicion]=numero;
		
		for(int i=0; i<6;i++) {
			System.out.println(i+" El número de esa posición es: "+arreglo[i]);
		}
				
				
	
	}

}
