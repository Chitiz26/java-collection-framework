package sets;

import java.util.HashSet;
import java.util.Set;

public class setPractice
{
    public static void main(String[] args)
    {
        Set<Student> studentSet=new HashSet<>();
        studentSet.add(new Student(101, "Chitiz", 85));
        studentSet.add(new Student(102, "Rahul", 90));
        studentSet.add(new Student(103, "Aman", 78));
        studentSet.add(new Student(104, "Riya", 92));

        studentSet.add(new Student(101, "Chitiz", 81));
    }


}
