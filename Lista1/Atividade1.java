package Lista1;

import java.util.Scanner;

public class Atividade1 {
// Determinar se a soma de A + B é menor, maior ou igual à entrada de C
    public static void main(String[] args) {
        int A , B, C;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        A = leia.nextInt();

        System.out.println("Digite o valor de B");
        B = leia.nextInt();

        System.out.println("Digite o valor de C");
        C = leia.nextInt();

        if (A + B > C){
            System.out.println("A soma é maior que C!");
        }
        else if (A + B == C){
            System.out.println("A soma é igual que C!");
        }
        else {
            System.out.println("A soma é menor que C!");
        }
    }
}