package Lista1;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        String caract1, caract2, caract3;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite se o animal é vertebrado ou invertebrado");
        caract1 = leia.next();

        if (caract1.equals("vertebrado")) {
            System.out.println("Agora digite se ele é uma ave ou um mamifero");
            caract2 = leia.next();
            if (caract2.equals("ave")) {
                System.out.println("Agora digite se ele é carnivoro ou onivoro");
                caract3 = leia.next();
                if (caract3.equals("carnivoro")) {
                    System.out.println("Voce escolheu a Águia");
                }else if(caract3.equals("onivoro")){
                    System.out.println("Voce escolheu a Pomba");
                }
            }else if(caract2.equals("mamifero")){
                System.out.println("Agora digite se o animal é onivoro ou herbivoro");
                caract3=leia.next();
                if (caract3.equals("onivoro")){
                    System.out.println("Você escolheu o ser humano");
                }else if(caract3.equals("herbivoro")){
                    System.out.println("Você escolheu a vaca");
                }
            }

        }else if (caract1.equals("invertebrados")){
            System.out.println("Agora digite se ele é um inseto ou um anelideo");
            caract2 = leia.next();
            if (caract2.equals("inseto")){
                System.out.println("Agora digite se o inséto é hematogafo ou herbivoro");
                caract3= leia.next();
                if (caract3.equals("hematogafo")){
                    System.out.println("Voce escolheu a pulga");
                }else if(caract3.equals("herbivoro")){
                    System.out.println("Voce escolheu a lagarta");
                }
            }else if(caract2.equals("anelideos")){
                System.out.println("Agora digite se o inséto é hematogafo ou onivoro");
                caract3= leia.next();
                if (caract3.equals("hematogafo")){
                    System.out.println("Voce escolheu a sanguessuga");
                } else if (caract3.equals("onivoro")) {
                    System.out.println("Voce escolheu a minhoca");
                }
            }
        }
    }
}