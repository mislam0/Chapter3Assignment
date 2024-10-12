package Farm;

public class MyFarm {
    public static void main(String[] args) {
        FarmAnimal[] animals = new FarmAnimal[6];

        animals[0] = new Duck("Donald", "male", 3.2, 5, "Quack Quack");
        animals[1] = new Duck("Cheese", "female", 3.6, 5, "Quack Quack");
        animals[2] = new Cow("Molly", "female", 1600.0, 3, "Moo Moo");
        animals[3] = new Chicken("Albert", "male", 1.6, 2, "Cock-a-Doodle-doo");
        animals[4] = new Chicken("Amelia", "female", 1.8, 4, "Cluck Cluck");
        animals[5] = new Chicken("Dixie", "female", 1.7, 4, "Cluck Cluck");

        for (FarmAnimal animal : animals) {
            System.out.println(animal);
        }

        for (FarmAnimal animal : animals) {
            System.out.println(animal.feedLoadingSchedule());
        }
    }
}