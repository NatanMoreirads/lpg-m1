package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
    int num;
    Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        num = resultado.nextInt();

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("O " + num + " e divisivel por 5 e por 3!");
        }else {
            System.out.println("O " + num + " não é divisivel por 5 e por 3!");
        }
    }
}
