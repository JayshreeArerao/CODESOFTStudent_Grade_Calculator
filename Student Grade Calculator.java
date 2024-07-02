import java.util.Scanner;
public class Student_Grede_Calculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Gread Calculator");
        System.out.println("Enter no of subjects");
        int nS=sc.nextInt();
        int total=0;
        for(int i=0;i<nS;i++){
            System.out.println("Enter marks obtained in "+i+":");
            int marks=sc.nextInt();
            total+=marks;
        }
        double averP=(double)total/nS;
         char Grade;
        if(averP>=90){
            Grade='o';
        }
        else if(averP>=80){
            Grade='A';
        }
        else if(averP>=70){
            Grade='B';
        }
        else if(averP>=60){
            Grade='C';
        }
        else if(averP>=50){
            Grade='D';
        }
        else if(averP>=40){
            Grade='E';
        }
        else{
            Grade='F';
        }
        System.out.println("Total Marks Scored is"+total);
        System.out.println("Average Percentage Gained is"+averP+"%");
        System.out.println("Grade");

    }
}

/*
output:
PS D:\my java\my first project>  & 'C:\Program Files\Java\jdk-20\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'D:\my java\my first project\bin' 'Student_Grede_Calculator' 
Student Gread Calculator
Enter no of subjects
7
Enter marks obtained in 0:
87
Enter marks obtained in 1:
96
Enter marks obtained in 2:
95
Enter marks obtained in 3:
96
Enter marks obtained in 4:
93
Enter marks obtained in 5:
89
Enter marks obtained in 6:
92
Total Marks Scored is648
Average Percentage Gained is92.57142857142857%
Grade
*/
