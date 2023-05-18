package modulo01.natan_santos;
import java.util.Scanner;


public class Aula0604{
public static void main(String[] argn) {
        Integer num;
        Scanner Ler = new Scanner(System.in);
        try {
        System.out.println("Digite um número:");
        num = Ler.nextInt();
        System.out.println("O número é:"+ num);
        Ler.close();

        } catch (Exception e){
        System.out.println("Digite apenas números");
        };


        }
        }
