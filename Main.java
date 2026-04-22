interface Action {
    void performDuty();
}

// Abstract Class (Encapsulation + Abstraction)
abstract class Animal implements Action {
    private String name;
    private int health;
    private int age;

    public Animal(String name, int health, int age) {
        this.name = name;
        this.health = health;
        this.age = age;
    }

    public abstract String getSpecies();
    public abstract void makeSound();

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getAge() { return age; }

    public void performDuty() {
        System.out.println("🌟 " + name + " is doing its daily duty!");
    }
}

// Lion
class Lion extends Animal {
    public Lion(String name, int health, int age) {
        super(name, health, age);
    }

    public void makeSound() {
        System.out.println("🦁 ROARRR!");
    }

    public String getSpecies() {
        return "Lion";
    }

    public void hunt() {
        System.out.println("🍖 " + getName() + " is hunting...");
    }
}

// Elephant
class Elephant extends Animal {
    public Elephant(String name, int health, int age) {
        super(name, health, age);
    }

    public void makeSound() {
        System.out.println("🐘 Trumpet!");
    }

    public String getSpecies() {
        return "Elephant";
    }

    public void sprayWater() {
        System.out.println("💦 " + getName() + " is spraying water!");
    }
}

// Giraffe
class Giraffe extends Animal {
    public Giraffe(String name, int health, int age) {
        super(name, health, age);
    }

    public void makeSound() {
        System.out.println("🦒 Bleat!");
    }

    public String getSpecies() {
        return "Giraffe";
    }

    public void reachLeaves() {
        System.out.println("🌳 " + getName() + " is eating leaves...");
    }
}

// Tiger
class Tiger extends Animal {
    public Tiger(String name, int health, int age) {
        super(name, health, age);
    }

    public void makeSound() {
        System.out.println("🐯 Grrr!");
    }

    public String getSpecies() {
        return "Tiger";
    }

    public void stalkPrey() {
        System.out.println("👀 " + getName() + " is stalking prey...");
    }
}

// MAIN CLASS
public class Main {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   🌍 ZOO ADVENTURE DASHBOARD 🐾");
        System.out.println("=====================================\n");

        // LION
        Animal a1 = new Lion("Simba", 85, 5);
        System.out.println("🐾 Name: " + a1.getName());
        System.out.println("Species: " + a1.getSpecies());
        System.out.println("Age: " + a1.getAge());
        a1.makeSound();
        a1.performDuty();
        if (a1 instanceof Lion) {
            ((Lion) a1).hunt();
        }
        System.out.println("-------------------------------------");

        // ELEPHANT
        Animal a2 = new Elephant("Dumbo", 70, 4);
        System.out.println("🐾 Name: " + a2.getName());
        System.out.println("Species: " + a2.getSpecies());
        System.out.println("Age: " + a2.getAge());
        a2.makeSound();
        a2.performDuty();
        if (a2 instanceof Elephant) {
            ((Elephant) a2).sprayWater();
        }
        System.out.println("-------------------------------------");

        // LION 2
        Animal a3 = new Lion("Mufasa", 92, 8);
        System.out.println("🐾 Name: " + a3.getName());
        System.out.println("Species: " + a3.getSpecies());
        System.out.println("Age: " + a3.getAge());
        a3.makeSound();
        a3.performDuty();
        if (a3 instanceof Lion) {
            ((Lion) a3).hunt();
        }
        System.out.println("-------------------------------------");

        // GIRAFFE
        Animal a4 = new Giraffe("Tower", 78, 6);
        System.out.println("🐾 Name: " + a4.getName());
        System.out.println("Species: " + a4.getSpecies());
        System.out.println("Age: " + a4.getAge());
        a4.makeSound();
        a4.performDuty();
        if (a4 instanceof Giraffe) {
            ((Giraffe) a4).reachLeaves();
        }
        System.out.println("-------------------------------------");

        // TIGER
        Animal a5 = new Tiger("Sheru", 72, 7);
        System.out.println("🐾 Name: " + a5.getName());
        System.out.println("Species: " + a5.getSpecies());
        System.out.println("Age: " + a5.getAge());
        a5.makeSound();
        a5.performDuty();
        if (a5 instanceof Tiger) {
            ((Tiger) a5).stalkPrey();
        }

        System.out.println("\n=====================================");
        System.out.println("🎉 TOTAL ANIMALS: 5");
        System.out.println("=====================================");
    }
}