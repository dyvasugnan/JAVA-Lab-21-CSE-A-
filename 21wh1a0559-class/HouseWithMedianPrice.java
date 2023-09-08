import java.util.*;

public class MiddleHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HouseWithMedianPrice> houses = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            houses.add(new HouseWithMedianPrice(x, y, z));
        }

        Collections.sort(houses);

        HouseWithMedianPrice midHouse = houses.get(n / 2);
        System.out.println(midHouse.x + " " + midHouse.y + " " + midHouse.z);
    }
}

class HouseWithMedianPrice implements Comparable<HouseWithMedianPrice> {
    int x, y, z;

    public HouseWithMedianPrice(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int compareTo(HouseWithMedianPrice other) {
        if (this.x != other.x) {
            return Integer.compare(this.x, other.x);
        } else if (this.y != other.y) {
            return Integer.compare(this.y, other.y);
        } else {
            return Integer.compare(this.z, other.z);
        }
    }
}
