package wmrozek.pesel.weryfikacja;

import wmrozek.utils.Utils;

import java.time.DateTimeException;
import java.time.LocalDate;

public class WeryfikatorPesel {
    private static final int GENDER_DIGIT = 9;

    private String pesel;

    private LocalDate dateOfBirth;

    public WeryfikatorPesel(String pesel){
        this.pesel = pesel;
    }

    public boolean isValidPesel(){
        if (!checkLength()){
            return false;
        }else if(!checkDigitsOnly()){
            return false;
        }else if(!checkMonths()){
            return false;
        }else if(!checkCorrectnessAndSaveDateOfBirth()){
            return false;
        }else if(!checkControlSum()){
            return false;
        }
        return true;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isMale(){
        int digit = Utils.integerOrNull(String.valueOf(pesel.charAt(GENDER_DIGIT)));
        if (digit%2==1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFemale(){
        return !isMale();
    }

    private boolean checkLength(){
        if (pesel == null || pesel.length() != 11){
            return false;
        }
        return true;
    }

    private boolean checkDigitsOnly(){
        return Utils.longOrNull(pesel) != null;
    }

    private boolean checkMonths(){
        int firstDigit = Utils.integerOrNull(String.valueOf(pesel.charAt(2)));
        int secondDigit = Utils.integerOrNull(String.valueOf(pesel.charAt(3)));
        if (firstDigit%2 == 0 || firstDigit%2 == 1 && secondDigit <= 2){
            return true;
        }else{
            return false;
        }
    }

    private boolean checkCorrectnessAndSaveDateOfBirth(){
        int year = Utils.integerOrNull(pesel.substring(0,2));
        int month = Utils.integerOrNull(pesel.substring(2,4));
        int day = Utils.integerOrNull(pesel.substring(4,6));
        if (month <= 12){
            year += 1900;
        }else if(month <= 32){
            year += 2000;
            month -= 20;
        }else if(month <= 52){
            year += 2100;
            month -= 40;
        }else if(month <= 72){
            year += 2200;
            month -= 60;
        }else if(month <= 92){
            year += 1800;
            month -= 80;
        }
        try{
            dateOfBirth = LocalDate.of(year, month, day);
            return true;
        }catch(DateTimeException e){
            return false;
        }
    }

    private boolean checkControlSum(){
        int[] elements = new int[]{9, 7, 3, 1, 9, 7, 3, 1, 9, 7};
        int sum = 0;
        for (int i=0; i<10;i++){
            sum += Utils.integerOrNull(pesel.charAt(i)) * elements[i];
        }
        int lastDigit = Utils.integerOrNull(pesel.charAt(10));
        return sum%10 == lastDigit;
//        if (sum%10 == lastDigit){
//            return true;
//        }else{
//            return false;
//        }
    }


}
