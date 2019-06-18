package io.zipcoder.polymorphism;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you have");
        int a = sc.nextInt();
        sc.nextLine();
        List<Pet> petsList = new ArrayList<Pet>();

        for(int i = 0; i < a; i++ ) {
            System.out.println("What kind of pet it is?");
            String  kind = sc.nextLine();
            System.out.println(kind);
            System.out.println("What is pets name");
            String name = sc.nextLine();
            if(kind.equals("Dog")) {
                Pet dog = new Dog();
                dog.setName(name);
                petsList.add(dog);
            }
            else if(kind.equals("Cat")) {
                Pet cat = new Cat();
                cat.setName(name);
                petsList.add(cat);
            }
            else if(kind.equals("Rabbit")) {
                Pet rabbit = new Rabbit();
                rabbit.setName(name);
                petsList.add(rabbit);
            }

        }
        for(Pet speak : petsList) {
            speak.speak();
        }

    }
}
