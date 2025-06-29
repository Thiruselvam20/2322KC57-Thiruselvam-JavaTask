package studentIteratorProject;
import java.util.ArrayList;
import java.util.Iterator;


class Student {
    int id;
    String name;
    String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Course: " + course;
    }
}
public class Task1_iterator {

	public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Thiru", "Java"));
        studentList.add(new Student(102, "Hari", "Python"));
        studentList.add(new Student(103, "Shivi", "C++"));

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s);
		

        }
    }
}