package modulo01.natan_santos.aula03_operadores.labs2;

import java.util.Scanner;

public class Exer02 {
    
    public static void main(String[] args){
        float v1, v2;
        boolean comparacao;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Digite um valor real: ");
        v1 = resultado.nextFloat();

        System.out.println("Digite outro valor: ");
        v2 = resultado.nextFloat();

        comparacao = (v1 > v2);
        System.out.println("O primeiro valor é maior que o segundo? " + comparacao);

    }
}
