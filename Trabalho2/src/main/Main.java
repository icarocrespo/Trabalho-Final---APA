package main;
// 1.2 - Maximizando a soma

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        ForcaBruta fb;
        DivisaoConquista dc;
        int op;

        do {
            System.out.println("---------- MENU ----------");
            System.out.println("Opção 1 - Força Bruta");
            System.out.println("Opção 2 - Divisão e Conquista");
            System.out.println("Sair - 0");
            op = x.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o tamanho do vetor: ");
                    fb = new ForcaBruta(x.nextInt());
                    fb.populaArray();

                    int op1;

                    do {
                        System.out.println("---------- MENU Força Bruta ----------");
                        Main.operacoes();

                        op1 = x.nextInt();

                        switch (op1) {
                            case 1:
                                System.out.println("Operação 1 selecionada");
                                fb.operacao1();
                                fb.showArray();
                                break;

                            case 2:
                                System.out.println("Operação 2 selecionada");
                                fb.operacao2();
                                fb.showArray();
                                break;

                            case 3:
                                System.out.println("Operação 3 selecionada");
                                fb.operacao3();
                                fb.showArray();
                                break;

                            case 4:
                                System.out.println("Operação 4 selecionada");
                                fb.operacao4();
                                fb.showArray();
                                break;

                            default:
                                System.out.println("Opção inválida");
                                break;

                            case 0:
                                System.out.println("Você saiu");

                        }
                    } while (op1 != 0);
                    break;

                case 2:
                    System.out.print("Digite o tamanho do vetor: ");
                    dc = new DivisaoConquista(x.nextInt());

                    dc.populaArray();

                    int op2;

                    do {
                        System.out.println("---------- MENU Força Bruta ----------");
                        Main.operacoes();

                        op2 = x.nextInt();

                        switch (op2) {

                            case 1:
                                System.out.println("Operação 1 selecionada");
                                dc.operacao1();
                                dc.showArray();
                                break;

                            case 2:
                                System.out.println("Operação 2 selecionada");
                                dc.operacao2();
                                dc.showArray();
                                break;

                            case 3:
                                System.out.println("Operação 3 selecionada");
                                dc.operacao3();
                                dc.showArray();
                                break;

                            case 4:
                                System.out.println("Operação 4 selecionada");
                                dc.operacao4();
                                dc.showArray();
                                break;

                            default:
                                System.out.println("Opção inválida");
                                break;

                            case 0:
                                System.out.println("Você saiu");

                        }
                    } while (op2 != 0);

                    break;

                default:

                    break;
            }
        } while (op != 0);
    }

    public static void operacoes() {
        System.out.println("Operação 1 - Pegar o último núumero do array A, removê-lo e adicionar à P.");
        System.out.println("Operação 2 - Pegar os dois últimos núumeros do array A (se o tamanho for maior que 1), removê-los e "
                + "adicionar o produto deles à P.");
        System.out.println("Operação 3 - Inverter o array A, pegar o último número do array A, remover e adicioná-lo à P");
        System.out.println("Operação 4 - Inverter o array A, pegar os dois últimos números do array A (se o tamanho for "
                + "maior que 1), remova-os e adicione o seu produto à P");
        System.out.println("Sair - 0");
    }
}
