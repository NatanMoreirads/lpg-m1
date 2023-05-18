package modulo01.natan_santos.aula04_ifelse.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
    String palavra;
    Scanner resultado = new Scanner(System.in);

        System.out.println("Escreva uma palavra que que inicie com 'A' e termine com 'Z': ");
        palavra = resultado.next();

        if (palavra.toLowerCase().startsWith("a") && palavra.toLowerCase().endsWith("z")){
            System.out.println("Sua palavra inicia com a letra 'A' e termina com a letra 'Z'!");
        }else {
            System.out.println("Sua palavra não inicia com a letra 'A' e termina com a letra 'Z'!");
        }
    }
}
