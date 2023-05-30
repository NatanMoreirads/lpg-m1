import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {


    int n1, n2;
    Scanner resultado = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
    n1 = resultado.nextInt();

        System.out.println("Informe outro número inteiro: ");
    n2 = resultado.nextInt();

        System.out.println("Informe um operador matemático: ");
    String p1 = resultado.next();

        switch (p1){
        case "+": System.out.println("O resultado da Adição é: " + (n1 + n2)); break;
        case "-": System.out.println("O resultado da Subtração é: " + (n1 - n2)); break;
        case "*": System.out.println("O resultado da Multiplicação é: " + (n1 * n2)); break;
        case "/": if (n2 == 0){ System.out.println("Inválido! Não Executável!"); } else{
            System.out.println("O resultado da Divisão é: " + (n1 / n2)); } break;

        default: System.out.println("Informação fora das exigências!");
        }
    }
}
