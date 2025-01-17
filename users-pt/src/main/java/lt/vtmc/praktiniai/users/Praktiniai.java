package lt.vtmc.praktiniai.users;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        return (int) users.stream().mapToInt(User::getAge).filter(age -> age > 25).count();
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().mapToDouble(User::getAge).average().orElse(Double.NaN);
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).min().orElse(0);
    }

    public static User findByName(List<User> users, String name) {
        return users.stream().filter(user -> user.getName().equals(name)).findAny().orElse(null);
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparingInt(User::getAge)).toList();
    }

    public static User findOldest(List<User> users) {
        int query = users.stream().mapToInt(User::getAge).max().orElse(0);
        return users.stream().filter(user -> user.getAge() == query).findAny().orElse(null);
    }

    public static int sumAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).sum();
    }
}
