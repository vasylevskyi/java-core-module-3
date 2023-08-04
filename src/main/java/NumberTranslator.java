package main.java;

public class NumberTranslator {

    public int translate(String romanNumber) {
        int arabicNumber;
        String clearRomanNumber = romanNumber.trim().toUpperCase().replace(" ", "");
        switch (clearRomanNumber) {
            case "I":
                arabicNumber = 1;
                break;
            case "II":
                arabicNumber = 2;
                break;
            case "III":
                arabicNumber = 3;
                break;
            case "IV":
                arabicNumber = 4;
                break;
            case "V":
                arabicNumber = 5;
                break;
            case "VI":
                arabicNumber = 6;
                break;
            case "VII":
                arabicNumber = 7;
                break;
            case "VIII":
                arabicNumber = 8;
                break;
            case "IX":
                arabicNumber = 9;
                break;
            case "X":
                arabicNumber = 10;
                break;
            case "XI":
                arabicNumber = 11;
                break;
            case "XII":
                arabicNumber = 12;
                break;
            default:
                arabicNumber = -1;
        }
        return arabicNumber;
    }

    public static void main(String[] args) {
        NumberTranslator arabicNumber = new NumberTranslator();
        int a = arabicNumber.translate("x");
        System.out.println(a);
    }
}
