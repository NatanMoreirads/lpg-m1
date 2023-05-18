package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner resultado = new Scanner(System.in);
        int numero;

        System.out.println("Informe um numero: ");
        numero = resultado.nextInt();

        if (numero <= 0 || (numero >= 5 && numero <= 15)){
            System.out.println("Seu número entre 5 e 15! ");
        }else {
            System.out.println("Seu número não está entre 5 e 15! ");
        }
    }
}
