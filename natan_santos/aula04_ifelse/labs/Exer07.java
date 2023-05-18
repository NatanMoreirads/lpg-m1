package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
    int num;
    Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        num = resultado.nextInt();

        if (num % 2 == 0 && num % 3 == 0){
            System.out.println("O " + num + " é par, e é divisivel por 3! ");
        }else {
            System.out.println("O " + num + " não é par e não é divisivel por 3!");
        }
    }
}
