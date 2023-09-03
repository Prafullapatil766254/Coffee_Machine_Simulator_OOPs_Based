import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        while(true){


            System.out.println("Tell me which service you want.");
            String action = scn.next();

             if(action.equals("Buy") || action.equals("buy")){
                 System.out.println("Which coffee you want to buy. Following are the coffees available..");
                 coffeeMachine.getCoffeeTypes();
                 String coffee = scn.next();

                 if(coffee.equals("Espresso") || coffee.equals("espresso")){
                     coffeeMachine.buyEspresso();
                 }else if(coffee.equals("Latte") || coffee.equals("latte")){
                     coffeeMachine.buyLatte();
                 }else if (coffee.equals("Cappuccino") || coffee.equals("cappuccino")){
                     coffeeMachine.buyCappuccino();
                 }else{
                     System.out.println("Please select form available coffees only..");
                 }



             }else if(action.equals("Fill") || action.equals("fill")){
                 System.out.println("Tell me the amount of water you wanted to add in ml");
                 int water = scn.nextInt();
                 System.out.println("Tell me the amount of milk you wanted to add in ml");
                 int milk = scn.nextInt();
                 System.out.println("Tell me the count of beans you wanted to add");
                 int beans = scn.nextInt();

                 coffeeMachine.fillIngredients(water , milk , beans);
                 System.out.println("Ingredients added successfully..");



             }else if(action.equals("Take") || action.equals("take")){
                 System.out.println("Amount $"+coffeeMachine.moneyBox+" taken successfully..");
                 coffeeMachine.moneyBox = 0;
             }else if(action.equals("Show") || action.equals("show")){
                 System.out.println("Ingredients available in coffee machine are as follow");
                 System.out.println(coffeeMachine.ingredientsAvailable);
            }else if(action.equals("analytics") || action.equals("Analytics")){
                 System.out.println("Count of coffees are sold as of now are "+coffeeMachine.countOfCoffeesSold);
                 System.out.println("Amount earned as of now is $"+coffeeMachine.amountEarned);
                 System.out.println("Ingredients consumed as of now are");
                 System.out.println(coffeeMachine.ingredientsConsumed);

             }else{
                 break;
             }

        }

    }
}