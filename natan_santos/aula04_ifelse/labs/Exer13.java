package modulo01.natan_santos.aula04_ifelse.labs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {
        int numero;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um Número: ");
        numero = resultado.nextInt();

        if (numero  % 2 == 0){
            System.out.println("Seu número é par!");
        }else {
            System.out.println("Seu número é impar!");
        }

    }
}