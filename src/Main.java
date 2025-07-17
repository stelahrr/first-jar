
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your ID: ");
        String id = keyboard.nextLine();
        System.out.print("Enter your Name: ");
        String name = keyboard.nextLine();
        System.out.print("Enter the workshop that you want to attend: ");

        File file = new File("workshop.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String workshop = keyboard.nextLine();  //dont del


        File attendees = new File("attendees.txt");
        try {
            FileWriter fr = new FileWriter("attendees.txt",true);
            fr.write(id + " " + name + " " + workshop + "\n");
            fr.close();

            Scanner sc1 = new Scanner(attendees);
            while (sc1.hasNextLine()) {
                String line = sc1.nextLine();
                String[] tokens = line.split(" ");
                for (int i = 0; i < tokens.length; i++) {
                    System.out.println(tokens[i]);
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    }
