package homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class pig {
     String name;
     String color;
     String talk;
     String weight;
     String age;
 public pig(String name, String color, String talk, String weight, String age) {
 this.name = name;
 this.color = color;
 this.talk = talk;
 this.weight = weight;
 this.age = age;
 }
 public pig(String name, String color){
 this.name = name;
 this.color = color;
 }
 public static void main(String[] args) {
 pig pig1 = new pig("nafnaf","red","hruhru","120","5");
 pig pig2 = new pig("nifnif","blue");

     ArrayList<String> forPig1 = new ArrayList<>(Arrays.asList(pig1.name, pig1.talk, pig1.color, pig1.age, pig1.weight));
     ArrayList<String> forPig2 = new ArrayList<>(Arrays.asList(pig2.name, pig2.color));
     Collections.reverse(forPig1);
     System.out.println(forPig1);
     System.out.println(forPig2);

 }

 }
