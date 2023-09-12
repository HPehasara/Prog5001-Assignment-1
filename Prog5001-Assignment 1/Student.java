import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Student here.
 *
 * @author (Homila Pehasara)
 * @version (a version number or a date)
 */
public class Student
{
    private ArrayList<String> assignmentName;//F1
    private ArrayList<String> userName;
    private int assignmentMarks;
    private int assiMark;
    private int assiName;
    private int numofStudents;
    private int assimarks;
    private double sum;
    private double sumOfSquares;
    private double count;
    public Student()
    {
        userName = new ArrayList<>();
        assignmentName = new ArrayList<>();
        getUser();
        getAssignment();
        printAssignment();
        getassignmentMarks();
        double sum = 0;
        double sumofSquares = 0;
        double count = 0;

    }
    
    public void getUser()//Adding new assignment name
    {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Your User Name Here:");
        String userName = userInput.nextLine();
        System.out.println("*********Greetings " + userName);
    }
    
    public void getAssignment()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Assignment Name You Wish to Proceed: ");
        String assignmentName = userInput.nextLine();
    }
    
    public void printAssignment()//Print Assignment name
    {
        for(int i=0; i < userName.size(); i++)
            System.out.println("Assignment Name: " + assignmentName.get(i));
    }
    
    public void getassignmentMarks()
    {
        Scanner scanner = new Scanner(System.in);
        int assihighestMark = 30;//Highest mark = 30
        int assilowestMark = 1;//
        int numofStudents = 30;//Defining number of students
        int[] assiMarks = new int[numofStudents];//Store student marks
        System.out.print("Please Re-Enter the assignment name: ");//Allows the user to re enter required assignment name
        String assiName = scanner.nextLine();
        for (int i = 0; i < 30; i++) //Allocate marks for students separately
            {
            int assiMark;
            do 
            {
                System.out.print("Please Enter the Mark for Student" + (i + 1) + ": ");//Allows to enter marks for 30 students separetly
                while (!scanner.hasNextInt()) 
                {
                    System.out.println("Invalid Mark Input. Please Enter a Valid Mark.");//Check whether the mark is an integer
                    scanner.next(); // Clears the invalid mark input
                }
                assiMark = scanner.nextInt();
                if (assiMark < 0 || assiMark > 30) 
                {                                       //Checks whether the marks is between 0& 30
                    System.out.println("Invalid input. Please enter a valid mark between 0 & 30");
                }
            }
            while (assiMark < 0 || assiMark > 30);
            assiMarks[i] = assiMark;
            sum +=assiMark;
            sumOfSquares += assiMark*assiMark;
            count++;
            if (assihighestMark == 31 || assiMark > assihighestMark) //Declare values for highest marks
            {
                assihighestMark = assiMark;
            }
            if (assilowestMark == 0 || assiMark < assilowestMark) //Declare values for lowest marks
            {
                assilowestMark = assiMark;
            }
            assiMarks[i] = assiMark;//Stores the marks
            }
            scanner.close();
            double mean = (double) sum / count;//Mean using the sum
            double y = ((double) sumOfSquares / count) - (mean * mean);
            double deviation = Math.sqrt(y);//Square root to find the deviation
            System.out.println("\nAssignment: " + assiName);// Finally Prints the Assignment Name and Student Marks
            System.out.println("Marks of Students:");
            for (int i = 0; i < 30; i++) 
            {
                System.out.println("Student " + (i + 1) + ": " + assiMarks[i]);
            }
                System.out.println("Assignment Highest Mark: " + assihighestMark);//Prints Highest Mark of Students
                System.out.println("Assignment Lowest Mark: " + assilowestMark);//Prints Lowest Mark of students
                System.out.println("Mean Mark is: " + mean);// Prints Mean Mark
                System.out.println("Standard Deviation of Marks is: " + deviation);//Prints Standard Deviation
        } 
    }
               




