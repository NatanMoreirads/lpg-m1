package modulo01.natan_santos.aula05_switchcase.labs;

import java.util.Scanner;

public class Exer10 {
    
    public static void main(String[] args){
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe uma letra:");
        char p1 = resultado.next().charAt(0);

        switch (p1){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal minúscula!");break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vogal Maiúscula ");break;

            default:

                if (p1 >= 'b' && p1 <= 'z' || p1 >= 'B' && p1 <= 'Z'){
                    System.out.println("É uma consoante!");break;
                }else{
                    System.out.println("invalido");
                }
        }

    }
}
