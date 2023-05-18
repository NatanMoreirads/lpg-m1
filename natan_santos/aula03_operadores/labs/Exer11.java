package modulo01.natan_santos.aula03_operadores.labs;

import java.util.Scanner;

public class Exer11 {
    
    public static void main(String[] args){
        float altura;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Entre com a Altura: ");
        altura = resultado.nextFloat();
        double pesoIdeal = ((72.7 * altura)- 58);

        System.out.printf("O peso ideal e: %.2f" ,pesoIdeal);

    }
}
