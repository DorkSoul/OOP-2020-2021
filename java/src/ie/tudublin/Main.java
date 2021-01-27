package ie.tudublin;

// this is a git test

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");

        Animal misty = new Dog("Misty");

        Animal topCat = new Cat("TopCat");

        Cat ginger = new Cat("Ginger");
        
        int x = 0;
        while (x < 9)
        {
            ginger.kill();
            x++; 
        }

        System.out.println(misty);
        System.out.println(topCat);

        misty = topCat;

        topCat.setName("Garfield");

        System.out.println(misty);
        System.out.println(topCat);

        // What will get printed out??

        // 1. topcat, Garfield
        // 2. garfield, Garfield 


    }
} 