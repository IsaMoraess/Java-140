package atvd41;

/*Problema Exemplo-SEM POO
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y 
(suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois 
triângulos e dizer qual dos dois triângulos possui a maior área.

A fórmula para calcular a área de um triângulo a partir das medidas de seus 
lados a, b e c é a seguinte (fórmula de Heron):

área = √(p(p-a)(p-b)(p-c))

Onde:
p = (a + b + c) / 2 */

import java.util.Scanner;

public class ladoTriangulo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // ADICIONA VARIAVEIS
        double xA, xB, xC, yA, yB, yC;

        // INSERIR VALORES
        System.out.println("Entre com os valores do Trinagulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre com os valores do Trinagulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        // FAZER A FORMULA DA ÁREA DO TRIANGULO X
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        // FAZER A FORMULA DA ÁREA DO TRIANGULO Y
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        // MOSTRAR OS VALORES
        System.out.println("Área do Triângulo X: " + areaX);
        System.out.println("Área do Triângulo Y: " + areaY);

        // VERIFICAR QUAL TRIANGULO TEM A MAIOR ÁREA
        if (areaX > areaY) {
            System.out.println("O Triângulo X possui a maior área.");
        } else if (areaX < areaY) {
            System.out.println("O Triângulo Y possui a maior área.");
        } else {
            System.out.println("Os Triângulos X e Y possuem as mesmas áreas.");
        }
    }
}
