package modulo01.natan_santos.aula03_operadores.labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args){
        Scanner diametro= new Scanner(System.in);
        double medida1;

        System.out.println("Digite o raio do circulo");
        medida1= diametro.nextDouble();
        double area = Math.PI * Math.pow(medida1, 2);

        System.out.println("A area do circulo e: "+ String.format("%.2f",area));

        System.out.println("E o dobro da area e: "+ String.format("%.2f",area *2));
    }
}