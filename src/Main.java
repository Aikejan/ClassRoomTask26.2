import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal("Salad", "Evropa");
        Meal meal1 = new Meal("Ace cream", "Kyrgystan");
        Meal meal2 = new Meal("Burger", "USA");


        Meal meal3 = new Meal("Lagman", "Dyngan");
        Meal meal4 = new Meal("Pasta", "Italia");
        Meal meal5 = new Meal("Puzza", "Ispania");

        Meal meal6 = new Meal("Plov", "Uzbekictan");
        Meal meal7 = new Meal("Bulochca", "Franch");
        Meal meal8 = new Meal("Sushi", "Japan");


        Deque<Meal> map = new ArrayDeque<>();
        map.add(meal);
        map.add(meal1);
        map.add(meal2);
        int i = new Scanner(System.in).nextInt();
            if (i == 1) {
                System.out.println(map.poll());
            }
            if (i == 2) {
                System.out.println(map.getLast());
                System.out.println(map.add(meal));
            }
        }
    }
