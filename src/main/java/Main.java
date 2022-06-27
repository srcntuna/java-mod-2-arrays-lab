import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here

        String[] students = new String[10];

        try (Scanner scanner = new Scanner(System.in)){

            for(int i = 0; i < 10; i++){
                System.out.println("Enter student's name:");
                String name = scanner.nextLine();
                students[i] = name;

            }

        }


        System.out.println("You have entered the following names:");

        for(String student : students){

            System.out.println(student);

        }


    }
}
