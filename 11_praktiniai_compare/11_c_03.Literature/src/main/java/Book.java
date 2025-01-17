public class Book implements Comparable{
    private String name;
    private int age;

    public Book(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name+" (recommended for "+age+" year-olds or older)";
    }

    @Override
    public int compareTo(Object o) {
        Book a = (Book) o;
        return  getAge() - a.getAge();
    }
}
