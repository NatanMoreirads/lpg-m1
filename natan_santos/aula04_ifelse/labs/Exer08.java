package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        int n1;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um numero entre 10 e 100: ");
        n1 = resultado.nextInt();

        if (n1 >= 10 && n1 <= 100){
        System.out.println("O numero está entre 10 e 100! ");
        }else{
            System.out.println("O numero informado não esta entre 10 e 100! ");
        }

    }
}
