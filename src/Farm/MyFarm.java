package Farm;

import java.util.ArrayList;
import java.util.List;

public class MyFarm {
    public static void main(String[] args) {
        List<FarmAnimal> animals = new ArrayList<>();

        animals.add(new Duck("Donald", "male", 3.2, 5, "Quack Quack"));
        animals.add(new Duck("Cheese", "female", 3.6, 5, "Quack Quack"));
        animals.add(new Cow("Molly", "female", 1600.0, 3, "Moo Moo"));
        animals.add(new Chicken("Albert", "male", 1.6, 2, "Cock-a-Doodle-doo"));
        animals.add(new Chicken("Amelia", "female", 1.8, 4, "Cluck Cluck"));
        animals.add(new Chicken("Dixie", "female", 1.7, 4, "Cluck Cluck"));

        for (FarmAnimal animal : animals) {
            System.out.println(animal);
        }

        for (FarmAnimal animal : animals) {
            System.out.println(animal.feedLoadingSchedule());
        }
    }
}