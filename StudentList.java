import java.util.Scanner;
class Student{
    private String studentName; // Student’s name.
    private int test1, test2, test3; // Grades on three tests.
    
    //Setter methods
    public void setName(String name1){studentName=name1;}
    public void setScores(int score1,int score2,int score3){
        test1=score1;
        test2=score2;
        test3=score3;
    }

    //methods
    public double average() { // To compute average test grade
        return (test1 + test2 + test3) / 3;
    }
    
    //Getter methods
    public String getStudentName(){return this.studentName;}
    public int getTest1Score(){return this.test1;}
    public int getTest2Score(){return this.test2;}
    public int getTest3Score(){return this.test3;}
    
}
public class StudentList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Student std1 = new Student();
        
        while(in.hasNextLine()){
                String mystr = in.nextLine();
                if(mystr.equals("")){break;}
                else if(mystr.matches("^[ A-Za-z]+$")){std1.setName(mystr);}
                else{
                    String[] arr = mystr.split(", ", 0);
                    std1.setScores(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
                }
        }
        in.close();
        System.out.println("-------------------------------");
        System.out.println("REPORT CARD");
        System.out.println("-------------------------------");
        System.out.println("Name of the student: "+std1.getStudentName());
        System.out.println("Test- 1 Score: "+std1.getTest1Score());
        System.out.println("Test- 2 Score: "+std1.getTest2Score());
        System.out.println("Test- 3 Score: "+std1.getTest3Score());
        System.out.println("Average score: "+std1.average());
        System.out.println("-------------------------------");
    }
        
        
    }

