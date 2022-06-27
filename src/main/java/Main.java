import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here

        String[] students = new String[10];

        // open the scanner and each round of loop ask for the input and add it to array
        // @ corresponding index
        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 0; i < students.length; i++) {
                System.out.println("Enter student's name:");
                String name = scanner.nextLine();
                students[i] = name;

            }

        }

        System.out.println("You have entered the following names:");

        // print out the all the students
        for (String student : students) {

            System.out.println(student);
        }

    }
}
