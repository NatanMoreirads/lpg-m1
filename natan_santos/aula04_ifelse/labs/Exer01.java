package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
    int num;
    Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        num = resultado.nextInt();

        if (num > 0 && num % 2 ==0){
            System.out.println("O numero " + num + " é Inteiro, Positivo e Par!");
        }else {
            System.out.println("O numero " + num + " não é Inteiro,Positivo e Par!");
        }
    }
}
