public class Bird {
    private String type;
    private int age;
    
    public Bird(String type, int age) {
        this.type = type;
        this.age = age;
    }
    
    public String getType() {
        return type;
    }
    
    public int getAge() {
        return age;
    }
}

// Create 11 instances of the Bird class
Bird bird1 = new Bird("Eagle", 5);
Bird bird2 = new Bird("Owl", 3);
Bird bird3 = new Bird("Penguin", 2);
Bird bird4 = new Bird("Parrot", 1);
Bird bird5 = new Bird("Swan", 4);
Bird bird6 = new Bird("Duck", 2);
Bird bird7 = new Bird("Flamingo", 3);
Bird bird8 = new Bird("Peacock", 4);
Bird bird9 = new Bird("Hummingbird", 1);
Bird bird10 = new Bird("Pigeon", 2);
Bird bird11 = new Bird("Seagull", 3);