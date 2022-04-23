package ext;

public class MyFarm {
    public static void main(String[] args){
        Cat num = new Cat("Cat1");
        Cat num2 = new Cat("cat2");
        Dog num3 = new Dog("dog1");

        num.say();
        num2.eat();

        num3.say();
        num3.eat();
        System.out.println(num3.getName());
        num3.setName("dog4");
        System.out.println(num3.getName());
        num3.getColor();
    }
}
