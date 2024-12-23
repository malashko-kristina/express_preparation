package javaTasks;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
public class Student {
    protected String name;
    protected String id;
    protected double gpa;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return Objects.equals(student.id, this.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", gpa=" + gpa +'}';
    }

    @Override
    public Student clone() {
        try {
            Student cloned = (Student) super.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
