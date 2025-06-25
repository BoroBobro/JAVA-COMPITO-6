package Esercizio1;

import java.util.HashSet;
import java.util.Set;

public class StampaP {
    public Set<String> paroleDistinte;
    public Set<String> paroleDuplicate;

    public StampaP() {
        this.paroleDistinte = new HashSet<>();
        this.paroleDuplicate = new HashSet<>();
    }

    public void aggiungiParola(String parola) {
        if (!paroleDistinte.add(parola)) {
            paroleDuplicate.add(parola);
        }
    }

    public Set<String> getParoleDuplicate() {
        return new HashSet<>(paroleDuplicate);
    }

    public int getNumeroParoleDistinte() {
        return paroleDistinte.size();
    }

    public Set<String> getElencoParoleDistinte() {
        return new HashSet<>(paroleDistinte);
    }
}