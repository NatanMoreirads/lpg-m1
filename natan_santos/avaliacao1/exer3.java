import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner resultado = new Scanner(System.in);
        float altura, peso, imc;

        System.out.println("Informe seu Peso: ");
        peso = resultado.nextFloat();

        System.out.println("Informe sua Altura: ");
        altura = resultado.nextFloat();

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso!");
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso Normal!");
        } else if(imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso!");
        } else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade de Grau 1!");
        } else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade de Grau 2!");
        } else if (imc >= 40){
            System.out.println("Obesidade de Grau 3 ou Móbida!");
        }else {
            System.out.println("Informações não correpondentes!");
        }
    }
}
