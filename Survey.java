package Exercise2;

import javax.swing.*;
import java.util.Scanner;

public class Survey {

    static byte cont = 0;
    static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        Person persons = new Person();
        byte SIZE = 6;
        Person[] person = new Person[SIZE];

        menuInitial(person, SIZE);
    }

    public static void addPeopleAndSongs(Person[] person, byte SIZE){

        if(cont == SIZE){
            System.out.println("cannot you add more persons\n");
            return;
        }

        person[cont] = new Person();
        System.out.println("Input the Information to Person\n");
        System.out.print("Input the name: ");
        person[cont].setName(stdin.nextLine());

        System.out.print("Input the id: ");
        person[cont].setId(stdin.nextLine());

        System.out.print("Input the date: ");
        person[cont].setDate(stdin.nextLine());

        System.out.print("Input the email: ");
        person[cont].setEmail(stdin.nextLine());

        System.out.print("Input the city residence: ");
        person[cont].setCityDestiny(stdin.nextLine());

        System.out.print("input the origin city: ");
        person[cont].setCityOrigin(stdin.nextLine());

        person[cont].addSong();
        System.out.println("Person added...");
        cont++;
    }

    public static void showPersonForPosition(Person[] person){
        System.out.print("Input to position of the person: ");
        byte position = stdin.nextByte();
        stdin.nextLine();

        if(position > cont || position <= 0){
            System.out.println("cannot find position");
            return;
        }
        position -= 1;
        person[position].showInformation();
    }

    public static void menuInitial(Person[] person, byte SIZE){

        char option;

        do{
            System.out.println("\n----------------SURVEY 'FUP'-------------\n");
            System.out.println("1._ Add person");
            System.out.println("2._ Filter to person by name");
            System.out.println("0._ Exit");
            System.out.print("\nInput option: ");
            option = stdin.next().charAt(0);
            stdin.nextLine();

            switch (option){

                case '1':
                    addPeopleAndSongs(person, SIZE);
                    break;

                case '2':
                    showPersonForPosition(person);
                    break;

                case '0':
                    break;

                default:
                    System.out.println("Error input option");
                    break;
            }
        }
        while(option != '0');
    }
}
