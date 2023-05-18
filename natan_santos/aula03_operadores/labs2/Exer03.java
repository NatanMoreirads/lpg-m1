package modulo01.natan_santos.aula03_operadores.labs2;

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args){
        Scanner resultado = new Scanner(System.in);
        String cor1, cor2;
        boolean comparacao;

        System.out.println("Fale a cor de uma casa: ");
        cor1 = resultado.next();

        System.out.println("Fale outra cor de uma casa: ");
        cor2 = resultado.next();

        comparacao = (cor1.equals(cor2));
        System.out.println("As duas casas tem a mesma cor? " + comparacao);
    }
}
