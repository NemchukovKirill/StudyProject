package javaSimple;

public class Program {
    public static void main(String[] args) {
        int num = 3;
        int num1 = 8;
       System.out.println("hello world");
       System.out.println (HelpedMethods.parametr);
       System.out.println("Сумма = " +HelpedMethods.sum(6, 3));
       System.out.println("Сумма " +num+ " и " +num1+ " = " +HelpedMethods.sum(num,num1));

       String qwe = new String("qwe");
       boolean result = qwe == HelpedMethods.parametr;
       System.out.println(result);

       boolean result2 = qwe.equalsIgnoreCase(HelpedMethods.parametr);
        System.out.println(result2);

        String qwe1 = "qwe";
        boolean result3 = qwe1 == HelpedMethods.parametr;
        System.out.println(result3);

        num = 5;
        num = 1;

        if(num == 3){
            System.out.println("мы сделали это");
        }else if (num ==5){
            System.out.println("мы почти сделали это");
        }else{
            System.out.println("мы ничего не сделали");
        }
        HelpedMethods hp = new HelpedMethods();

        System.out.println("radio = " + hp.switchRadio("Afro"));

        int index = 100;
        for (int x = 0; x<=index; x++){
            x = x + 30;
            System.out.println(x);
        }
        int value1 = 0;
        while (index<110){
            value1++;
            System.out.println("Привет");
            if(value1 == 4){
                break;
//        }
//        int value1 = 0;
//        while (index<110){
//            value1++;
//            System.out.println("Привет");
//            if(value1 == 4){
//                break;
            }

        }
        do {
            System.out.println("Привет 222");
            index = 1000;
        }while (index <110);
        System.out.println("Мы закончили");
    }


}
