import java.text.DecimalFormat;
import java.util.Scanner;
public  class Main{

    
    public static void main(String[] args){


        DecimalFormat df = new DecimalFormat("####.##");

        Candy reeces = new Candy("Reeces", 1.25);
        Candy twix = new Candy("Twix", 0.90);
        Candy snicker = new Candy("Snicker", 1.05);
        Candy skittles = new Candy("Skittles", 1.35);
        Candy trolli = new Candy("Trolli Gummy Worms", 1.15);

        Scanner input = new Scanner(System.in);
        double budget;

        System.out.println("Welcome to my Computer Candy Machine!");
        System.out.println("Candy is virtual!!! \n");
        

        System.out.println("How much money do you have?");
        double money = input.nextDouble();
        input.nextLine(); //Skips next line so you can input information again
        budget = money;

        System.out.println("You only have " + "$" + budget + "?");
        System.out.println("Here is what we've got today!");

        //Prints out options for candy using getItem method from Candy class
        System.out.println("A" + reeces.getItem());
        System.out.println("B" + twix.getItem());
        System.out.println("C" + snicker.getItem());
        System.out.println("D" + skittles.getItem());
        System.out.println("E" + trolli.getItem());

        System.out.println("So what would you like to have?");
        String choice = input.nextLine();
        

        //Checks for reeces
        if(choice.equals("A") && budget == reeces.getPrice()){
            System.out.println("Thanks for purchasing candy through us!");
        } else if (choice.equals("A") && budget > reeces.getPrice()){
            System.out.println("Thanks for purchasing candy through us!");
            double change = budget - reeces.getPrice();
            System.out.println("Please take your candy, and your $" + df.format(change) + " change");
        } else if (choice.equals("A") && budget < reeces.getPrice()){
            System.out.println("You're broke! Take your $" + budget + " someplace else!");
        }


        //Checks for twix
        else if (choice.equals("B") && budget == twix.getPrice()){
            System.out.println("Thanks for purchasing candy through us!");
        } else if (choice.equals("B") && budget > twix.getPrice()){
            System.out.println("Thanks for purchasing candy through us!");
            double change = budget - twix.getPrice();
            System.out.println("Please take your candy, and your $" + df.format(change) + " change");
        } else if (choice.equals("B") && budget < twix.getPrice()){
            System.out.println("You're broke! Take your $" + budget + " someplace else!");
        }
        
        //Checks for snickers
        else if(choice.equals("C") && budget == snicker.getPrice()){
            System.out.println("Thanks for purchasing candy through us!");
        } else if (choice.equals("C") && budget > snicker.getPrice()){
            System.out.println("Thanks for purchasing candy through us!");
            double change = budget - snicker.getPrice();
            System.out.println("Please take your candy, and your $" + df.format(change) + " change");
        } else if (choice.equals("C") && budget < snicker.getPrice()){
            System.out.println("You're broke! Take your $" + budget + " someplace else!");
        }

        //Checks for skittles
        else if(choice.equals("D") && budget == skittles.getPrice()){
            System.out.println("Thanks for purchasing candy through us!");
        } else if (choice.equals("D") && budget > skittles.getPrice()){
            System.out.println("Thanks for purchasing candy through us!");
            double change = budget - skittles.getPrice();
            System.out.println("Please take your candy, and your $" + df.format(change) + " change");
        } else if (choice.equals("D") && budget < skittles.getPrice()){
            System.out.println("You're broke! Take your $" + budget + " someplace else!");
        }

        //Checks for Trolli
        else if(choice.equals("E") && budget == trolli.getPrice()){
            System.out.println("Thanks for purchasing candy through us!");
        } else if (choice.equals("E") && budget > trolli.getPrice()){
            System.out.println("Thanks for purchasing candy through us!");
            double change = budget - trolli.getPrice();
            System.out.println("Please take your candy, and your $" + df.format(change) + " change");
        } else if (choice.equals("E") && budget < trolli.getPrice()){
            System.out.println("You're broke! Take your $" + budget + " someplace else!");
        } else {
            System.out.println("If you can't decide come back another time!");
        }

       

    }
}