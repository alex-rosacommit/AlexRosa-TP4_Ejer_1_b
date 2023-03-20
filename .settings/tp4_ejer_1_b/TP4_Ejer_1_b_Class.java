package tp4_ejer_1_b;
import java.util.Scanner;

public class TP4_Ejer_1_b_Class {

	public static void main(String[] args) {
		/*
		 * b.	haga lo mismo, pero solicitando los parámetros
		 *  de a uno por consola 
		*/
		Scanner leer = new Scanner(System.in);
		int[] numerosOrdenados = new int[3];
		int orden = 0;
		
		System.out.println("Ingrese 3 numeros para que sean ordenados.");
		
		System.out.print("Ingrese el primer numero: ");
		numerosOrdenados[0] = Integer.valueOf(leer.nextLine());
		
		System.out.print("Ingrese el segundo numero: ");
		numerosOrdenados[1] = Integer.valueOf(leer.nextLine());
		
		System.out.print("Ingrese el tercer numero: ");
		numerosOrdenados[2] = Integer.valueOf(leer.nextLine());
		
		System.out.println("Seleccione el orden como se mostrarán los numeros:");
		System.out.println("1 <-- Ascendente");
		System.out.println("2 <-- Descendente \n");
		orden = Integer.valueOf(leer.nextLine());
		
		if(orden == 1) {
			System.out.println("Ordenado Ascendentemente");
			for(int i = 0; i < numerosOrdenados.length ; i++) {
				for(int j = i + 1; j < numerosOrdenados.length ; j++) {
					if(numerosOrdenados[i] > numerosOrdenados[j]) {
						int auxiliar = numerosOrdenados[i];
						numerosOrdenados[i] = numerosOrdenados[j];
						numerosOrdenados[j] = auxiliar;
					}
				}
			}
		}
		
		if(orden == 2) {
			System.out.println("Ordenado Descendentemente");
			for(int i = 0; i < numerosOrdenados.length ; i++) {
				for(int j = i + 1; j < numerosOrdenados.length ; j++) {
					if(numerosOrdenados[i] < numerosOrdenados[j]) {
						int auxiliar = numerosOrdenados[i];
						numerosOrdenados[i] = numerosOrdenados[j];
						numerosOrdenados[j] = auxiliar;
					}
				}
			}
		}
		
		for(int i = 0; i < numerosOrdenados.length; i++) {
			System.out.println(numerosOrdenados[i]);
		}
		
		leer.close();
	}

}
