public class Student extends Person {
    private int studyCredits = 0;

    public Student(String name, String address) {
        super(name, address);
    }

    public void study() {
        studyCredits += 1;
    }

    public int credits() {
        return studyCredits;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "  " + "Study credits " + studyCredits;
    }
}
