class Bread
{
    String name = "Naan";
    int pices;
    String  ingredients;
    int prize= 50;

    Bread()
    {
        System.out.println("Running the deafault constructer");
    }

}

class BreadRunner 
{
    public static void main(String [] args)
    {
        Sweet ref = new Naan();

        System.out.println("The Bread name is : "+ref.name);
        System.out.println("The nummber of pices are you can eat is : "+ref.pices);
        System.out.println("The prize of the sweet is : "+ref.prize);
        System.out.println("Ingrediants used to prepaer sweet is : "+ref.ingredients);
        
    }
}