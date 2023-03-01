/*Pandai Sdn Bhd runs a number of tuition centers throughout KL and JB. Depending 
on business conditions, they are looking continually to open new centers and from time to time, they may 
have to close existing ones.Each tuition center, situated in a physical address and headed by a HeadMaster, 
employs a number of tutors to handle batches of students (they take in a new batch each year). Tutors are all freelancers; 
they come and go throughout the year, and each student is assigned to one tutor. Each center maintains the data for 
each tutor (name, IC,  address, qualification, # yearexp, date joined, # years in the center etc) and each student (name, IC, address, year, schoolname, list of scores, etc). 
Pandai Sdn Bhd from time to time needs report on the performance of each center - #students, #tutors, avg marks, min, max,  tutors background, etc.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        // Create a sample tuition center with some students and tutors
        TuitionCenter tc1 = new TuitionCenter("Kastur Tuiton", new HeadMaster("Ramu", "650825-14-8974", "Taman Mawar", 15));

        Tutor t1 = new Tutor("Raja", "670514-14-0245", "Taman Bukit Belimbing", "Degree", 3, 2);
        Tutor t2 = new Tutor("Roja", "670514-14-0245", "Taman Muraya", "Degree", 4, 3);
        
        List<Integer> scores1 = new ArrayList<>();
        scores1.add(90);
        scores1.add(80);
        scores1.add(70);
        Student s1 = new Student("Susan", "033456-01-2347", "Taman Putra Permai", 2022, "SMK Seri Serdang", scores1);
        
        List<Integer> scores2 = new ArrayList<>();
        scores2.add(85);
        scores2.add(75);
        scores2.add(65);
        Student s2 = new Student("Sam", "013456-01-2348", "Taman Seri Indah", 2022, "SMK Seri Indah", scores2);
        
        tc1.addTutor(t1);
        tc1.addTutor(t2);
        tc1.addStudent(s1);
        tc1.addStudent(s2);

        // Generate the performance report for the tuition center
        int numStudents = tc1.getStudents().size();
        int numTutors = tc1.getTutors().size();
        double averageMarks = tc1.getAverageMarks();
        System.out.println("Tuition Center: " + tc1.getTutors());
        System.out.println("# Students: " + numStudents);
        System.out.println("# Tutors: " + numTutors);
        System.out.println("Average Marks: " + averageMarks);
    }
}