package Lista2;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        String colaborador;
        int cargo;
        float salario;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome do colaborador");
        colaborador = leia.next();
        System.out.println("####Cargos da empresa####\n" +
                            "1-Gerente       ///   10%\n" +
                            "2-Vendedor      ///    7%\n" +
                            "3-Supervisor    ///    9%\n" +
                            "4-Motorista     ///    6%\n" +
                            "5-Estoquista    ///    5%\n" +
                            "6-Técnico de TI ///    8%" );
        System.out.println("Digite o cargo do colaborador");
        cargo = leia.nextInt();
        System.out.println("Digite o salário do colaborador");
        salario=leia.nextFloat();

        switch (cargo){
            case 1:
                System.out.println("O cargo para o colaborador "+colaborador+" será de gerente, o salario antigo é de R$" +salario+ " e o novo será R$"+salario*1.1);
                break;
            case 2:
                System.out.println("O cargo para o colaborador "+colaborador+" será de vendedor, o salario antigo é R$" +salario+ " e o novo será R$"+salario*1.07);
                break;
            case 3:
                System.out.println("O cargo para o colaborador "+colaborador+" será de supervisor, o salario antigo é R$" +salario+ " e o novo será R$"+salario*1.09);
                break;
            case 4:
                System.out.println("O cargo para o colaborador "+colaborador+" será de motorista, o salario antigo é R$" +salario+ " e o novo será R$"+salario*1.06);
                break;
            case 5:
                System.out.println("O cargo para o colaborador "+colaborador+" será de estoquista, o salario antigo é R$" +salario+ " e o novo será R$"+salario*1.05);
                break;
            case 6:
                System.out.println("O cargo para o colaborador "+colaborador+" será de Técnico de TI, o salario antigo é R$" +salario+ " e o novo será R$"+salario*1.08);
                break;
        }

    }
}
