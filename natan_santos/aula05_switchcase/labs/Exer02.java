package modulo01.natan_santos.aula05_switchcase.labs;

import java.util.Scanner;

public class Exer02 {
    
    public static void main(String[] args){
        String palavra;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Digite uma vogal: ");
        palavra = resultado.next();

        switch (palavra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": System.out.println(palavra + " é uma vogal!"); break;
            default: System.out.println(palavra + " É uma consoante ");
        }
    }
}
