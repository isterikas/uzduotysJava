

public class Student implements Comparable {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(Student s) {
        return getName().compareTo(s.getName());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
