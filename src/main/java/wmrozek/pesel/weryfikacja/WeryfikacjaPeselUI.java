package wmrozek.pesel.weryfikacja;

import wmrozek.utils.Utils;

public class WeryfikacjaPeselUI {
    public static void main(String[] args) {
        System.out.println("Podaj numer PESEL:");
        String pesel = Utils.readStringFromConsole();
        System.out.println("Trwa weryfikacja...");
        WeryfikatorPesel weryfikator = new WeryfikatorPesel(pesel);
        if (weryfikator.isValidPesel()){
            System.out.println("Podany PESEL jest poprawny");
            System.out.println("Twoja data urodzenia to: "+weryfikator.getDateOfBirth());
            System.out.println("Twoja płeć to: "+ (weryfikator.isMale() ? "Mężczyzna" : "Kobieta"));
        }else{
            System.out.println("Podany PESEL jest BLĘDNY");
        }

    }
}
