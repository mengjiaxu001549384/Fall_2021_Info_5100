package Mengjia.Q1;
import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getGpa() - o1.getGpa() > 0? 1:-1;
    }
}
