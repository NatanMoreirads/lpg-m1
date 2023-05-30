import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                String name;
                int age;
                Scanner resultado = new Scanner(System.in);

                System.out.println("Informe seu nome: ");
                name = resultado.next();

                System.out.println("Informe sua idade: ");
                age = resultado.nextInt();

                if(age < 16 ){
                    System.out.println(name + ",  você não apto para votar!");
                }else if (age <= 18 && age >= 16 || age >= 70 ){
                    System.out.println(name + ", Você pode optar por votar!");
                }else {
                    System.out.println(name + ", Você é obrigado a votar!");
                }
    }
}