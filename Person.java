public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

// Create 11 instances of the Person class
Person person1 = new Person("Alice", 25);
Person person2 = new Person("Bob", 30);
Person person3 = new Person("Charlie", 20);
Person person4 = new Person("David", 35);
Person person5 = new Person("Emily", 28);
Person person6 = new Person("Frank", 22);
Person person7 = new Person("Grace", 27);
Person person8 = new Person("Henry", 33);
Person person9 = new Person("Isabel", 24);
Person person10 = new Person("Jack", 29);
Person person11 = new Person("Karen", 26);