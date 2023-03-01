import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String IC;
    private String address;
    private int year;
    private String schoolName;
    private List<Integer> scores;

    public Student(String name, String IC, String address, int year, String schoolName, List<Integer> scores) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        this.scores = scores;
    } //constructor (initialize all the properties of your class with some values with the help of constructor)

    public double getAverageScore() {                  
        int sum = 0;        
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }
    
    public String getName(){   //public void setName(String name){
        return name;           //   this.name = name;}
    }

    public String getIC() {
        return IC; //return this.IC;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return year;
    }

    public String getSchoolName() {
        return schoolName;
    }
}

//public String toString() {
//     return ("Student name is " +this.getName() + ", age is: " +this.getAge()+" and address is: "+ this.getAddress());}

//public static void main(String[] args) { 
//    Student john = new Student ("John", 25, "23 East, California");
//    System.out.println(john.getName());
//    System.out.println(john.getAge());
//    System.out.println(john.getAddress());}