package FlyingThings;

import java.util.ArrayList;
import java.util.List;

public class ThingsThatFly {
    public static void main(String[] args) {
        List<Flight> flyingObjects = new ArrayList<>();

        flyingObjects.add(new Airplane("Boeing 747", 2016));
        flyingObjects.add(new Bird("Eagle"));
        flyingObjects.add(new Bird("Hummingbird"));

        for (Flight object : flyingObjects) {
            System.out.print(object + ": ");
            object.fly();
        }
    }
}