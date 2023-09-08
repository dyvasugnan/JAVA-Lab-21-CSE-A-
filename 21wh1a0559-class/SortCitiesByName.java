import java.util.*;


class CityComparator implements Comparator<String> {

    public int compare(String city1, String city2) {
        String order1 = city1.substring(0, 1).toLowerCase();
        String order2 = city2.substring(0, 1).toLowerCase();
        return order1.compareTo(order2);
    }
}

public class SortCitiesByName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> cities = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String city = sc.nextLine();
            cities.add(city);
        }

        Collections.sort(cities, new CityComparator());

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
