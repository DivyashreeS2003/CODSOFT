import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter marks obtained in subject Java: ");
        int Java=scanner.nextInt();
        System.out.print("Enter marks obtained in subject Python: ");
        int Python=scanner.nextInt();
        System.out.print("Enter marks obtained in subject C: ");
        int C=scanner.nextInt();
        System.out.print("Enter marks obtained in subject R: ");
        int R=scanner.nextInt();
        System.out.print("Enter marks obtained in subject HTML: ");
        int HTML=scanner.nextInt();

        int total_marks=Java+Python+C+R+HTML;
        double average_percentage=total_marks/5;
        String grade;

        if(average_percentage>=90){
            grade="A+";
        }else if(average_percentage>=80){
            grade="A";
        }else if(average_percentage>=70){
            grade="B+";
        }else if(average_percentage>=60){
            grade="B";
        }else if(average_percentage>=50){
            grade="c";
        }else{
            grade="F";
        }

        System.out.println("Total Marks:"+total_marks);
        System.out.println("Average Percentage:"+average_percentage);
        System.out.println("Grade:"+grade);

        scanner.close();

    }
    
}

        
    
        
        
    
    

