package controller;

import java.util.Scanner;

public class CtrlPrograma {

	public static void main(String[] args) {
		
		//01)
		
//		Scanner scanner = new Scanner(System.in);
//        int[] numeros = new int[20];
//        int pares = 0, impares = 0;
//        
//        System.out.println("Digite 20 números inteiros:");
//        
//        for (int i = 0; i < 20; i++) {
//            System.out.print("Número " + (i + 1) + ": ");
//            numeros[i] = scanner.nextInt();
//        }
//        
//        for (int num : numeros) {
//            if (num % 2 == 0) {
//                pares++;
//            } else {
//                impares++;
//            }
//        }
        
//        System.out.println("\nPares: " + pares);
//        System.out.println("Ímpares: " + impares);
//        
        //02)
        
//        Scanner scanner = new Scanner(System.in);
//        int[] numeros = new int[10];
//        
//        System.out.println("Digite 10 números:");
//        
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Número " + (i + 1) + ": ");
//            numeros[i] = scanner.nextInt();
//        }
//        
//        System.out.print("\nDigite um número para buscar: ");
//        int busca = scanner.nextInt();
//        boolean encontrado = false;
//        
//        for (int i = 0; i < 10; i++) {
//            if (numeros[i] == busca) {
//                System.out.println("Número encontrado na posição: " + i);
//                encontrado = true;
//            }
//        }
//        
//        if (!encontrado) {
//            System.out.println("Número não encontrado no array!");
//        }
		
		
		//03)
		
		/*
		 * Scanner scanner = new Scanner(System.in); String[] nomes = new String[10];
		 * 
		 * System.out.println("Digite 10 nomes:");
		 * 
		 * for (int i = 0; i < 10; i++) { System.out.print("Nome " + (i + 1) + ": ");
		 * nomes[i] = scanner.nextLine(); }
		 * 
		 * System.out.print("\nDigite o nome que deseja remover: "); String nomeRemover
		 * = scanner.nextLine(); boolean removido = false;
		 * 
		 * for (int i = 0; i < 10; i++) { if (nomes[i].equalsIgnoreCase(nomeRemover)) {
		 * nomes[i] = "---"; removido = true;
		 * System.out.println("Nome removido da posição: " + i); } }
		 * 
		 * if (!removido) { System.out.println("Nome não encontrado!"); }
		 * 
		 * System.out.println("\nArray atualizado:"); for (int i = 0; i < 10; i++) {
		 * System.out.println("Posição " + i + ": " + nomes[i]); }
		 */
		
		//04)
		
//		Scanner scanner = new Scanner(System.in);
//        int[] numeros = new int[10];
//        
//        System.out.println("Digite 10 números inteiros:");
//        
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Número " + (i + 1) + ": ");
//            numeros[i] = scanner.nextInt();
//        }
//        
//        // Array para marcar quais números já foram contados
//        boolean[] contados = new boolean[10];
//        
//        System.out.println("\nFrequência dos números:");
//        
//        for (int i = 0; i < 10; i++) {
//            if (!contados[i]) {
//                int count = 1;
//                
//                for (int j = i + 1; j < 10; j++) {
//                    if (numeros[i] == numeros[j]) {
//                        count++;
//                        contados[j] = true;
//                    }
//                }
//                
//                System.out.println(numeros[i] + " aparece " + count + " vez(es)");
//                contados[i] = true;
//            }
//        }
//		
		
		//05)
		
//		
//		Scanner scanner = new Scanner(System.in);
//        int[] numeros = new int[10];
//        
//        System.out.println("Digite 10 números inteiros:");
//        
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Número " + (i + 1) + ": ");
//            numeros[i] = scanner.nextInt();
//        }
//        
//        // Algoritmo Bubble Sort
//        for (int i = 0; i < numeros.length - 1; i++) {
//            for (int j = 0; j < numeros.length - 1 - i; j++) {
//                if (numeros[j] > numeros[j + 1]) {
//                    // Troca os elementos
//                    int temp = numeros[j];
//                    numeros[j] = numeros[j + 1];
//                    numeros[j + 1] = temp;
//                }
//            }
//        }
//        
//        System.out.println("\nArray ordenado:");
//        for (int num : numeros) {
//            System.out.print(num + " ");
//        }
		
		
		
		
		
		
		
		
		
		
        
        
        
        
        
        
	}

}
