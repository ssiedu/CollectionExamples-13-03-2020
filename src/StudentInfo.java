
import java.util.HashSet;


public class StudentInfo {
    public static void main(String[] args) {

        Student s1=new Student(111,"AAA","CS",4);
        Student s2=new Student(112,"BBB","IT",3);
        Student s3=new Student(111,"AAA","CS",4);
        Student s4=new Student(111,"AAA","CS",4);
        
        HashSet<Student> set=new HashSet<>();
        set.add(s1); set.add(s2); set.add(s3); set.add(s4);
        
        for(Student s:set){
            System.out.println(s);
        }
        
        
    }
}
