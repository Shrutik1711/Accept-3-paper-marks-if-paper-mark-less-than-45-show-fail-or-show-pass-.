import java.util.Scanner;

public class PaperMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter mark for paper 1:");
        int mark1 = scanner.nextInt();

        System.out.println("Enter mark for paper 2:");
        int mark2 = scanner.nextInt();

        System.out.println("Enter mark for paper 3:");
        int mark3 = scanner.nextInt();

        int totalMarks = mark1 + mark2 + mark3;
        double averageMarks = totalMarks / 3.0;

        if (averageMarks >= 45) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
