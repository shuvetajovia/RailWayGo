import java.util.*;
import java.util.stream.Collectors;

class UC9GroupBogiesByTypeApp {

    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.getName()));
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("First Class", 50));

        Map<String, List<Bogie>> grouped = groupBogiesByType(bogies);

        System.out.println("Grouped Bogies:");
        grouped.forEach((name, list) -> {
            System.out.println(name + " -> " + list);
        });
    }
}