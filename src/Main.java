import Esercizio1.StampaP;

import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StampaP processoreParole = new StampaP();

        System.out.print("Inserisci il numero di parole (N): ");
        int N = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Inserisci " + N + " parole:");
        for (int i = 0; i < N; i++) {
            System.out.print("Parola " + (i + 1) + ": ");
            String parola = scanner.nextLine();
            processoreParole.aggiungiParola(parola);
        }

        System.out.println("\n---");
        System.out.println("Parole duplicate:");
        Set<String> duplicati = processoreParole.getParoleDuplicate();
        if (duplicati.isEmpty()) {
            System.out.println("Nessuna parola duplicata.");
        } else {
            for (String parola : duplicati) {
                System.out.println(parola);
            }
        }

        System.out.println("\n---");
        System.out.println("Numero di parole distinte: " + processoreParole.getNumeroParoleDistinte());

        System.out.println("\n---");
        System.out.println("Elenco delle parole distinte:");
        Set<String> distinte = processoreParole.getElencoParoleDistinte();
        for (String parola : distinte) {
            System.out.println(parola);
        }

        scanner.close();
    }
}