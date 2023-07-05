class Kabab{
  String name;
  double price;
  String hotelName;
  int noOfPieces;
  boolean takeAway;
  
  Kabab(String name){
    
    System.out.println(name);
    
    System.out.println("Name of the Kabab is "+name);
    
    
  }
    Kabab(String name, String price){
    System.out.println("Name of the Kabab is "+name);
    System.out.println("Price of the Kabab is "+price);
    this.name=name;
    this.type=type;
  
  }
  
  Kabab(String name, double price, String hotelName){
    System.out.println("Name of the Kabab is "+name);
    System.out.println("Price  of the Kabab is "+price);
    System.out.println("hotelName of the kabab  is "+String);
	System.out.println("noOfPieces of Kabab"+int);
    System.out.println("takeAway of Kabab"+boolean);
    this.name=name;
    this.price=price;
    this.String=string;
	this.int=int;
	this.boolean=boolean;
	
  }
  
  Kabab(String name, String type, int price, String hotelName){
    System.out.println("Name of the kabab is "+name);
    System.out.println("Price of the kabab is "+price);
    System.out.println("hotelName of Kabab "+int);
	System.out.println("hotelName of the kabab  is "+String")
    this.name=name;
    this.type=type;
    this.price=price;
    this.location=location;
  }
  
  
  
}



class KababRunner{
  public static void main(String[] args){
    
    Fish ref1 = new Fish("Chicken Kabab");
    Fish ref2 = new Fish("Mutton Kabab","Land");
    Fish ref3 = new Fish("Fish Kabab","River",100);
    Fish ref4 = new Fish("Seekh Kabab","Meat",150,"Indian Subcontinent");
  }
}