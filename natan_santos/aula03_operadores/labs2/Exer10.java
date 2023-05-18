package modulo01.natan_santos.aula03_operadores.labs2;

import java.util.Scanner;

public class Exer10 {
    
    public static void main(String[] args){
        String p1, p2;
        boolean comparacao;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informa uma palavra: ");
        p1 =  resultado.next();

        System.out.println("Informe outra palavra: ");
        p2 = resultado.next();

        comparacao= (p1.length() > p2.length());
        System.out.println("A quantidade de letras da primeira palavra é maior que a segunda? "+ comparacao);
    }
}

