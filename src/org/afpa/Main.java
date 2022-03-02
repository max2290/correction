package org.afpa;



import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nbLignes;
        String mot;
        int nbVoyelles = 0;
        String VOYELLES = "aeiouy";


        System.out.println("===========================================");
        System.out.println("|      Et si on dessinait un triangle     |");
        System.out.println("===========================================");
        System.out.println("Entrez un nombre de lignes: ");
        nbLignes = sc.nextInt();
        //affichage du triangle
        for (int i = 1; i < nbLignes + 1; i++) {
            System.out.println(" ".repeat(nbLignes - i) + "*".repeat(2 * i - 1));
        }




        System.out.println("===========================================");
        System.out.println("| Maintenant je vais compter les voyelles |");
        System.out.println("===========================================");
        System.out.println("Entrez un mot: ");
        mot = sc.next().toLowerCase();
        for (char a : mot.toCharArray()) {
            nbVoyelles = (VOYELLES.indexOf(a) >= 0) ? (nbVoyelles + 1) : nbVoyelles;
        }
        System.out.printf("Il y a %d voyelle(s) dans %s.\n", nbVoyelles, mot);



        System.out.println("===========================================");
        System.out.println("|            Merci et à bientôt           |");
        System.out.println("===========================================");


    }






}
