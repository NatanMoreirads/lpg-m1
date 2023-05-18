package modulo01.natan_santos.aula03_operadores.labs2;

import java.util.Scanner;

public class Exer01 {
    
    public static void main(String[] args){
        int n1, n2;
        boolean iguais;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Digite um numero para comparacao: ");
        n1 = resultado.nextInt();

        System.out.println("Digite outro numero: ");
        n2 = resultado.nextInt();

        iguais = (n1 == n2);

        System.out.println("Os números não são iguais? " + iguais);
    }
}
