package Lista1;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        String doador;
        int idade;
        boolean primeiraDoacao;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do doador");
        doador = leia.next();
        System.out.println("Digite a idade do doador");
        idade = leia.nextInt();
        System.out.println("É a primeira doação de sangue?");
        primeiraDoacao = leia.nextBoolean();

        if (idade < 18 || idade > 69){
            System.out.println("Doador "+doador+" não apto para doar sangue!");
        } else if (idade >= 60 && primeiraDoacao){
            System.out.println("Doador "+doador+" não apto para doar sangue!");
        } else  {
            System.out.println("Doador "+doador+" apto para doar sangue!");
        }
    }
}
