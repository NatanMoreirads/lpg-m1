package modulo01.natan_santos.aula03_operadores.labs;

import java.util.Scanner;

public class Exer12 {
    
    public static void main(String[] args){
        float vh, hm, sb;
        Scanner resultado = new Scanner(System.in);

        System.out.println("Entre com o valor/hora");
        vh = resultado.nextFloat();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
        hm = resultado.nextFloat();

        sb = vh*hm;

        System.out.println("O seu Salario bruto e: " + sb);
        double inss, sindicato, ir;

        inss = sb * 0.08;
        sindicato = sb * 0.05;
        ir = sb * 0.11;

        System.out.println("Seu salario liquido com descontos e: " + (sb - inss - sindicato - ir));

    }
}
