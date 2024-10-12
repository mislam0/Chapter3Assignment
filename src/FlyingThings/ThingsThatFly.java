package FlyingThings;

public class ThingsThatFly {
    public static void main(String[] args) {
        Flight[] flyingObjects = new Flight[3];

        flyingObjects[0] = new Airplane("Boeing 747", 2016);
        flyingObjects[1] = new Bird("Eagle");
        flyingObjects[2] = new Bird("Hummingbird");

        for (Flight object : flyingObjects) {
            System.out.print(object + ": ");
            object.fly();
        }
    }
}