public class Animal {
    private String species;
    private int age;
    
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }
    
    public String getSpecies() {
        return species;
    }
    
    public int getAge() {
        return age;
    }
}

// Create 11 instances of the Animal class
Animal animal1 = new Animal("Lion", 5);
Animal animal2 = new Animal("Tiger", 4);
Animal animal3 = new Animal("Bear", 3);
Animal animal4 = new Animal("Elephant", 8);
Animal animal5 = new Animal("Giraffe", 6);
Animal animal6 = new Animal("Hippopotamus", 7);
Animal animal7 = new Animal("Kangaroo", 2);
Animal animal8 = new Animal("Leopard", 4);
Animal animal9 = new Animal("Monkey", 1);
Animal animal10 = new Animal("Rhino", 6);
Animal animal11 = new Animal("Zebra", 5);
