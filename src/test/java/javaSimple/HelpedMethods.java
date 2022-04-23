package javaSimple;

public class HelpedMethods {
    final static String parametr = "qwe";

    public int ind = 2;
    public int in2d = 2;

    public static String name(String word, int value) {
        String nameForReturn = word;
        return nameForReturn;
    }
    private String prefix(String pref){
        return pref;
    }
    protected String sufix(String suf){
        return suf;
    }
    String lost(){
        return "lost";
    }
    static int sum(int a, int b){
        return a+b;
    }
    public String switchRadio(String radioName){
        String radio;
        switch (radioName){
            case "Afro":
                radio = "100.2";
                break;
            case "Auto":
                radio =  "106.1";
                break;
            default:
                radio = "noname";
                break;
        }
        return radio;
    }
    public String switchRadioNewWave(String radioName){
        String radio;
        radio = switch (radioName){
            case "Afro"->"100.1";
            case "Auto"->"107.1";
            default -> "no name";
        };
        return radio;
    }
}
