import java.util.Scanner;

public class LabWeight_McBrayer {
    public static void main(String[] args) {

        //create scanner object instance
        Scanner scanner = new Scanner(System.in);

        /*
        -- Java 01 weight table from course resources --
        Labs 20%
        Reading Quizzes 10%
        REVEL 15%
        Midterm 20%
        Project 15%
        Final 20%
        */

        //user input assigned to variables
        System.out.println("Enter your Lab average: ");
        double labAverage = scanner.nextDouble();

        System.out.println("Enter your Reading Quizzes average: ");
        double readingAverage = scanner.nextDouble();

        System.out.println("Enter your REVEL average: ");
        double revelAverage = scanner.nextDouble();

        System.out.println("Enter your Midterm average: ");
        double midtermAverage = scanner.nextDouble();

        System.out.println("Enter your Project average: ");
        double  projectAverage = scanner.nextDouble();

        System.out.println("Enter your Final average: ");
        double finalAverage = scanner.nextDouble();


        //weights converted to decimal
        double labW = .20;
        double readingW = .10;
        double revelW = .15;
        double midtermW = .20;
        double projectW = .15;
        double finalW = .20;

        //sum weighted grade percents
        double finalOutput = ((labAverage * labW + readingAverage * readingW + revelAverage * revelW +
                midtermAverage * midtermW + projectAverage * projectW + finalAverage * finalW));

        //output to console
        System.out.println("Your weighted grade average is: " + String.format("%.2f",finalOutput) + "%");

    }
}
