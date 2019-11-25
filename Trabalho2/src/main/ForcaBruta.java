package main;
// 1.2 - Maximizando a soma

import java.util.Scanner;

public class ForcaBruta {

    Integer[] arrayA;
    Integer[] arrayP;

    public ForcaBruta(Integer tamanho) {
        arrayA = new Integer[tamanho];
        arrayP = new Integer[tamanho];
    }

    public void populaArray() {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite os " + arrayA.length + " valores");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = x.nextInt();
        }
    }

    public void Operacao1() {
        if (arrayA.length > 0) {
            for (int i = 0; i < arrayP.length; i++) {
                if (arrayP[i] == null) {
                    for (int j = 0; j < arrayA.length; j++) {
                        if(arrayA[j] == null){
                            arrayP[i] = arrayA[j - 1];
                            arrayA[j - 1] = null;
                        }
                    }
                }
            }
        }
    }
}
