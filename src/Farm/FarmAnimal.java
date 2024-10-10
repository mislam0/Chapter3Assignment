package Farm;

public abstract class FarmAnimal {
    private String name;
    private String gender;
    private double weight;
    private int age;

    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", gender=" + gender + ", weight=" + weight + ", age=" + age + "]";
    }

    public abstract String feedLoadingSchedule();
}

class Chicken extends FarmAnimal {
    private String sound;

    public Chicken(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Farm.Chicken " + sound + " " + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return getName() + ": 8am-4pm";
    }
}

class Cow extends FarmAnimal {
    private String sound;

    public Cow(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Farm.Cow " + sound + " " + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return getName() + ": 6am-4pm";
    }
}

class Duck extends FarmAnimal {
    private String sound;

    public Duck(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() { return sound; }
    public void setSound(String sound) { this.sound = sound; }

    @Override
    public String toString() {
        return "Farm.Duck " + sound + " " + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return getName() + ": 8am-12pm-6pm";
    }
}