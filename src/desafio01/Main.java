package desafio01;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    static String palavra1;
    static String palavra2;
    static String palavra3;

    public static void main(String[] args) {
        System.out.println("Escreva uma palavra: ");
        palavra1 = teclado.nextLine();
        System.out.println("Escreva outra palavra:");
        palavra2 = teclado.nextLine();
        System.out.println("Escreva a última palavra:");
        palavra3 = teclado.nextLine();

        System.out.println("As suas palavras foram: ");
        System.out.println(palavra1);
        System.out.println(palavra2);
        System.out.println(palavra3);

        teclado.close();
    }

}
