class Dress
{
    double price;
    String color;
    char Size;
	
dress(double price)
{
      System.out.println("Price of the dress is "+price);
      this.price=price;
    
}
    
dress( int price, String color)
{
      System.out.println("Price of the dress is "+price);
      System.out.println("Color of dress is  "+color);
      this.price=price;
      this.color=color;
}
dress (int price, String color,char Size)
{
    System.out.println("Price of the Scissor is "+price);
    System.out.println("Color is "+color);
    System.out.println("size "+size);
    this.color=color;
    this.price=price;
    this.size=size;

	class DressRunner
{
	public static void main(String[] args)
	{
	  Dress ref1 = new Dress (10000);
      Dress  ref2 = new Dress (10000,"Yellow");
      Dress  ref3 = new Dress (10000,"Yellow",'M');
      
	}
}