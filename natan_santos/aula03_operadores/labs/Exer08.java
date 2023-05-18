package modulo01.natan_santos.aula03_operadores.labs;

import java.util.Scanner;

public class Exer08 {
    
    public static void main(String[] args){
        Scanner soma= new Scanner(System.in);
        double salario, hora;

        System.out.println("Entre com o valor/hora: ");
        salario= soma.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mes: ");
        hora= soma.nextDouble();

        System.out.println("o salario e de: " + String.format("%.2f",salario *hora));
    }
}
