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
        System.out.println("Não implementado");
//        if (arrayA.length > 0) {
//            for (int i = 0; i < arrayP.length; i++) {
//                if (arrayP[i] == null) {
//                    for (int j = 0; j < arrayA.length; j++) {
//                        if (arrayA[j] == null) {
//                            arrayP[i] = arrayA[j - 1];
//                            arrayA[j - 1] = null;
//                        }
//                    }
//                }
//            }
//        }
    }

    public void operacao2() {
        System.out.println("Não implementado");
//        if (arrayA.length > 1) {
//            for (int i = 0; i < arrayA.length; i++) {
//                if (i - arrayA.length == 0 && (i + 1) - arrayA.length == -1) {
//                    for (int j = 0; j < arrayP.length; j++) {
//                        if (arrayP[j] == null) {
//                            arrayP[j] = arrayA[i] * arrayA[i + 1];
//                            arrayA[i] = null;
//                            arrayA[i + 1] = null;
//                        }
//                    }
//                }
//            }
//        } else {
//            System.out.println("Tamanho do Array A menor que 1.");
//        }
    }

    public void operacao3() {
        System.out.println("Não implementado");
//        Integer new_arrayA[] = new Integer[arrayA.length];
//
//        int i = arrayA.length - 1;
//        int j = 0;
//
//        while (i >= 0) {
//            new_arrayA[j] = arrayA[i];
//            arrayA[i] = null;
//            i--;
//            j++;
//        }
//
//        for (int k = 0; k < arrayA.length; k++) {
//            arrayA[k] = new_arrayA[k];
//            if (k + 1 == arrayA.length) {
//                for (int l = 0; l < arrayP.length; l++) {
//                    if (arrayP[l] == null) {
//                        arrayP[l] = arrayA[k];
//                    }
//                }
//                arrayA[k] = null;
//            }
//        }

    }

    public void operacao4() {
        System.out.println("Não implementado");
//        Integer new_arrayA[] = new Integer[arrayA.length];
//
//        int i = arrayA.length - 1;
//        int j = 0;
//
//        while (i >= 0) {
//            new_arrayA[j] = arrayA[i];
//            arrayA[i] = null;
//            i--;
//            j++;
//        }
//        if (new_arrayA.length > 1) {
//            for (int k = 0; k < new_arrayA.length; k++) {
//                if (k + 2 == new_arrayA.length) {
//                    for (int l = 0; l < arrayP.length; l++) {
//                        if (arrayP[l] == null) {
//                            arrayP[l] = new_arrayA[k] * new_arrayA[k + 1];
//                        }
//                    }
//                }
//            }
//        }
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
