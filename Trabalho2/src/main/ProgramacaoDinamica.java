package main;

import java.util.Scanner;

public class ProgramacaoDinamica {

    private Integer[] arrayA;
    private Integer[] arrayP;

    public ProgramacaoDinamica(Integer tamanho) {
        this.arrayA = new Integer[tamanho];
        this.arrayP = new Integer[tamanho];
    }

    public void populaArray() {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite os " + arrayA.length + " valores");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = x.nextInt();
        }
    }

    public void operacao1() {
        System.out.println("Não implementada");
    }

    public void operacao2() {
        System.out.println("Não implementada");
    }

    public void operacao3() {
        System.out.println("Não implementada");
    }

    public void operacao4() {
        System.out.println("Não implementada");
    }

    public void showArray() {
        System.out.print("A: [");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println("]");

        System.out.print("P: [");
        for (int i = 0; i < arrayP.length; i++) {
            System.out.print(arrayP[i] + " ");
        }
        System.out.println("]");
    }
}
