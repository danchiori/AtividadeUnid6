import java.util.Scanner;

public class Atividade4 {

    /*
Enunciado: Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela.

entrada: ler os valores de dois vetores de inteiros, cada um contendo 10 elementos

processo: ler os valores e armazenar em dois vetores, criar um terceiro vetor para armazenar a soma dos valores dos dois vetores originais, depois imprimir os três vetores

saida: os três vetores na tela
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        System.out.println("Digite os valores do vetor 1:");
 
        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }
 
        System.out.println("Digite os valores do vetor 2:");
 
        for (int i = 0; i < 10; i++) {
            vetor2[i] = sc.nextInt();
        }
 
        for (int i = 0; i < 10; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }

         // Mostrar vetor 1
        System.out.println("\nVetor 1:");
 
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor1[i] + " ");
        }
 
        // Mostrar vetor 2
        System.out.println("\nVetor 2:");
 
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor2[i] + " ");
        }
 
        // Mostrar vetor 3
        System.out.println("\nVetor 3:");
 
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor3[i] + " ");
        }

        sc.close();
    }
}
/*
testes
*/