import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        int idade;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        idade = resultado.nextInt();

        if (idade >= 0 && idade <= 12){
            System.out.println("Criança!");
        } else if (idade >= 13 && idade <= 17){
            System.out.println("Adolescente!");
        } else if (idade >= 18 && idade <= 59){
            System.out.println("Adulto!");
        } else if (idade >= 60){
            System.out.println("Idoso!");
        } else {
            System.out.println("ERRO!");
        }
    }
}
