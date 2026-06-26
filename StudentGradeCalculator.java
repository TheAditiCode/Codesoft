import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //input!!
        System.out.print("Enter number of subjects:");
        int subjects=sc.nextInt();
        int total=0;
        for(int i=1;i<=subjects;i++){
            //taking the input of marks!!
            System.out.print("Enter marks for subject"+i+":");
            int marks=sc.nextInt();
            //Calculate Totalmarks!!
            total=total+marks;
        }
        double percentage=(double)total/subjects;
        String grade;
        if(percentage>=90){
            grade="A";
        }else if(percentage>=80){
            grade="B";   
         }else if(percentage>=70){
            grade="C";
        }else if(percentage>=60){
                grade="D";
        }else{
            grade="F";
        }
        System.out.println("Result:");
        System.out.println("Total Marks="+total);
        System.out.println("Average Percentage="+percentage+"%");
        System.out.println("Grade="+grade);
    }
}