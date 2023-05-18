package modulo01.natan_santos.aula03_operadores.labs2;

import java.util.Scanner;

public class Exer08 {
    
    public static void main(String[] args){
        String t1, t2;
        Scanner resultado = new Scanner(System.in);
        boolean comparacao;

        System.out.println("Digite por Extenso um numero: ");
        t1 = resultado.next();

        System.out.println("Digite outro numero por extenso: ");
        t2 = resultado.next();

        comparacao = (t1.equals(t2));
        System.out.println("Os Numeros são iguais? "+ comparacao);
    }
}
