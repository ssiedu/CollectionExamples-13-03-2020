
import java.util.Objects;


public class Student {
    private int rno;
    private String name;
    private String branch;
    private int sem;

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.rno != other.rno) {
            return false;
        }
        if (this.sem != other.sem) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.branch, other.branch)) {
            return false;
        }
        return true;
    }

    
    
    
    public Student(int rno, String name, String branch, int sem) {
        this.rno = rno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }

    @Override
    public String toString() {
        return "Student{" + "rno=" + rno + ", name=" + name + ", branch=" + branch + ", sem=" + sem + '}';
    }
    
    
}
