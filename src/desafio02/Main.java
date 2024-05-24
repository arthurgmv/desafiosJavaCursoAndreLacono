package desafio02;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    static int num;

    public static void main(String[] args) {
        System.out.println("Digite um número");
        num = teclado.nextInt();

        if (num % 2 != 0){
            System.out.println("O número " + num + " é ímpar");
        } else if (num % 2 == 0  && num >= 2 && num <= 5){
            System.out.println("O número " + num + " é par e do tipo A");
        } else if (num % 2 == 0 && num >=6 && num <= 20) {
            System.out.println("O número " + num + " é par e do tipo B");
        } else if (num % 2 == 0 && num >20) {
            System.out.println("O número " + num + " é par e do tipo C");
        } else {
            System.out.println("Insira um número válido!");
        }
        teclado.close();
    }

}
