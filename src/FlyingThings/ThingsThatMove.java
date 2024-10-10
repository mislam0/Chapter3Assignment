package FlyingThings;

import java.util.ArrayList;
import java.util.List;

public class ThingsThatMove {
    public static void main(String[] args) {
        List<Movement> movingObjects = new ArrayList<>();

        movingObjects.add(new Airplane("Boeing 747", 2016));
        movingObjects.add(new Bird("Eagle"));
        movingObjects.add(new Bird("Hummingbird"));

        for (Movement object : movingObjects) {
            System.out.println(object + ":");
            object.fly();
            object.walk();
            object.jump();
            System.out.println();
        }
    }
}