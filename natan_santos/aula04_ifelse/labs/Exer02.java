package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
    int num;
    Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um numero entre 10 e 20: ");
        num = resultado.nextInt();

        if (num >= 10 && num <= 20) {
            System.out.println("O " + num + " esta entre 10 e 20!");
        }else{
            System.out.println("O " + num + " não esta entre 10 e 20!");
        }
    }
}
