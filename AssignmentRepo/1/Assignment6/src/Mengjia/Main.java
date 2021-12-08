package Mengjia;

import Mengjia.Q1.DateOfBirthComparator;
import Mengjia.Q1.GpaComparator;
import Mengjia.Q1.NameComparator;
import Mengjia.Q1.Student;
import Mengjia.Q2.AgeException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Q1");
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Alex", 3.4, new Date(1997, 12, 2)));
        studentList.add(new Student(2, "Emily", 3.6, new Date(1996, 10, 3)));
        studentList.add(new Student(3, "Emma", 3.3, new Date(1995, 11, 4)));
        studentList.add(new Student(4, "Zoe", 3.3, new Date(1998, 3, 5)));
        studentList.add(new Student(5, "Hazel", 3.5, new Date(1994, 7, 9)));
        studentList.add(new Student(6, "Jimmy", 3.2, new Date(1999, 3, 16)));
        studentList.add(new Student(7, "Laurie", 3.8, new Date(1998, 8, 27)));
        studentList.add(new Student(8, "Jason", 3.7, new Date(1994, 7, 30)));

        System.out.println("Unsorted list");
        for(Student s: studentList){
            System.out.println(s.toString());
        }

        Collections.sort(studentList, new NameComparator());

        System.out.println();
        System.out.println("Sort in ascending order by name ");
        for(Student s: studentList){
            System.out.println(s.toString());
        }

        Collections.sort(studentList, new GpaComparator());

        System.out.println();
        System.out.println("Sort in descending order by gpa ");
        for(Student s: studentList){
            System.out.println(s.toString());
        }

        Collections.sort(studentList, new DateOfBirthComparator());

        System.out.println();
        System.out.println("Sort in ascending order by date of birth ");
        for(Student s: studentList){
            System.out.println(s.toString());
        }


        System.out.println();
        System.out.println("=================================================================");
        System.out.println("Q2");

        System.out.println("Please enter your date of birth(dd/MM/yyyy): ");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Date dateOfBirth = null;
        Date today = null;
        long age = 0;
        try {
            dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(s);
            today = new Date();
            age = getAge(today, dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (AgeException ageException){
            System.out.println("catch age exception");
        } 

    }

    public static long getAge(Date today, Date dateOfBirth) throws AgeException{

        long age = (today.getTime()-dateOfBirth.getTime())/31536000000L;

        if(age < 16){
            throw new AgeException("The age of the applicant is " + age + " which is too early to apply for a driving license");
        }

        return age;
    }
}
