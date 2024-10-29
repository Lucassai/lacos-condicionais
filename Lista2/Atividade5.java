package Lista2;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        int produto, quantidade;
        Scanner leia= new Scanner(System.in);

        System.out.println("########Tabela de produtos########");
        System.out.println("1- Cachorro quente  ////  R$ 10,00");
        System.out.println("2- X-Salada         ////  R$ 15,00");
        System.out.println("3- X-Bacon          ////  R$ 18,00");
        System.out.println("4- Bauru            ////  R$ 12,00");
        System.out.println("5- Refrigerante     ////  R$  8,00");
        System.out.println("6- Suco de laranja  ////  R$ 13,00");
        System.out.println("Escreva o número do produto que quer comprar");
        produto = leia.nextInt();
        System.out.println("Escreva a quantidade do produto que quer comprar");
        quantidade = leia.nextInt();

        switch (produto){
            case 1:
                System.out.println("Você comprou "+quantidade+" Cachorro(s)-quente(s) e o valor total foi de R$" +(quantidade*10)+",00!");
                break;
            case 2:
                System.out.println("Você comprou "+quantidade+" X-salada(s) e o valor total foi R$ " +(quantidade*15)+",00!");
                break;
            case 3:
                System.out.println("Você comprou "+quantidade+" X-Bacon(s) e o valor total foi R$ " +(quantidade*18)+",00!");
                break;
            case 4:
                System.out.println("Você comprou "+quantidade+" Bauru(s) e o valor total foi R$ " +(quantidade*12)+",00!");
                break;
            case 5:
                System.out.println("Você comprou "+quantidade+" Refrigerantes e o valor total foi R$ " +(quantidade*8)+",00!");
                break;
            case 6:
                System.out.println("Você comprou "+quantidade+" Suco(s) de Laranja e o valor total foi R$ " +(quantidade*13)+",00!");
                break;
        }
            }
        }


