package FlyingThings;

public class ThingsThatMove {
    public static void main(String[] args) {
        Movement[] movingObjects = new Movement[3];

        movingObjects[0] = new Airplane("Boeing 747", 2016);
        movingObjects[1] = new Bird("Eagle");
        movingObjects[2] = new Bird("Hummingbird");

        for (Movement object : movingObjects) {
            System.out.println(object + ":");
            object.fly();
            object.walk();
            object.jump();
            System.out.println();
        }
    }
}