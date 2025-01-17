
public class Human implements Comparable {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }


    public int compareTo(Human o) {
        Human a = (Human) o;
        if (getWage() < a.getWage()) {
            return 1;
        } else if (getWage() > a.getWage()) {
            return -1;
        } else return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}