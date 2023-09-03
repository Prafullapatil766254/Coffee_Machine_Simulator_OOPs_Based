import java.util.ArrayList;
import java.util.HashMap;

public class CoffeeMachine {
    HashMap<String , Integer> ingredientsAvailable;
    HashMap<String , Integer> ingredientsConsumed;
    Integer moneyBox = 0;
    Integer countOfCoffeesSold = 0;
    Integer amountEarned = 0;

    HashMap<String , Integer> espresso;
    HashMap<String , Integer>  latte;
    HashMap<String , Integer>  cappuccino;


    CoffeeMachine(){

        HashMap<String , Integer> ingredientsAvailable = new HashMap<>(){{
            put("Water" , 0);
            put("Milk" ,0);
            put("Beans" ,0);
        }};
        this.ingredientsAvailable = ingredientsAvailable;


        HashMap<String , Integer> ingredientsConsumed = new HashMap<>(){{
            put("Water" , 0);
            put("Milk" ,0);
            put("Beans" , 0);
        }};
        this.ingredientsConsumed = ingredientsConsumed;

        HashMap<String , Integer> espresso = new HashMap<>(){{
            put("Price", 4);
            put("Water" ,250);
            put("Milk" ,0);
            put("Beans" , 16);
        }};
        this.espresso = espresso;

        HashMap<String , Integer> latte = new HashMap<>(){{
            put("Price", 7);
            put("Water" ,350);
            put("Milk" ,75);
            put("Beans" , 20);
        }};
        this.latte = latte;

        HashMap<String , Integer> cappuccino = new HashMap<>(){{
            put("Price", 6);
            put("Water" ,200);
            put("Milk" ,100);
            put("Beans" , 12);
        }};
        this.cappuccino = cappuccino;
    }

    void getCoffeeTypes(){
        System.out.println("Espresso ="+"$"+espresso.get("Price"));
        System.out.println("Latte ="+"$"+latte.get("Price"));
        System.out.println("Cappuccino ="+"$"+cappuccino.get("Price"));
    }

    void buyEspresso(){
        if(ingredientsAvailable.get("Water") >= espresso.get("Water")  && ingredientsAvailable.get("Milk") >= espresso.get("Milk") && ingredientsAvailable.get("Beans") >= espresso.get("Beans")){
            moneyBox+=espresso.get("Price");

            Integer updatedWaterCap = ingredientsAvailable.get("Water") - espresso.get("Water");
            ingredientsAvailable.put( "Water" , updatedWaterCap );

            Integer updatedMilkCap = ingredientsAvailable.get("Milk") - espresso.get("Milk");
            ingredientsAvailable.put( "Milk" , updatedMilkCap );

            Integer updatedBeansCap = ingredientsAvailable.get("Beans") - espresso.get("Beans");
            ingredientsAvailable.put( "Beans" , updatedBeansCap );

            ingredientsConsumed.put("Water" , ingredientsConsumed.getOrDefault("Water" , 0)+espresso.get("Water"));
            ingredientsConsumed.put("Milk" , ingredientsConsumed.getOrDefault("Milk" , 0)+espresso.get("Milk"));
            ingredientsConsumed.put("Beans" , ingredientsConsumed.getOrDefault("Beans" , 0)+espresso.get("Beans"));

            countOfCoffeesSold++;
            amountEarned+=espresso.get("Price");

            System.out.println("Your coffee is ready..enjoy it..");
        }else{
           System.out.println("Enough ingredients are not available to make espresso for you. Come again after some time.");
        }
    }


    void buyLatte(){
        if(ingredientsAvailable.get("Water") >= latte.get("Water")  && ingredientsAvailable.get("Milk") >= latte.get("Milk") && ingredientsAvailable.get("Beans") >= latte.get("Beans")){
            moneyBox+=latte.get("Price");

            Integer updatedWaterCap = ingredientsAvailable.get("Water") - latte.get("Water");
            ingredientsAvailable.put( "Water" , updatedWaterCap );

            Integer updatedMilkCap = ingredientsAvailable.get("Milk") - latte.get("Milk");
            ingredientsAvailable.put( "Milk" , updatedMilkCap );

            Integer updatedBeansCap = ingredientsAvailable.get("Beans") - latte.get("Beans");
            ingredientsAvailable.put( "Beans" , updatedBeansCap );

            ingredientsConsumed.put("Water" , ingredientsConsumed.getOrDefault("Water" , 0)+latte.get("Water"));
            ingredientsConsumed.put("Milk" , ingredientsConsumed.getOrDefault("Milk" , 0)+latte.get("Milk"));
            ingredientsConsumed.put("Beans" , ingredientsConsumed.getOrDefault("Beans" , 0)+latte.get("Beans"));

            countOfCoffeesSold++;
            amountEarned+=latte.get("Price");

            System.out.println("Your coffee latte is ready..enjoy it..");
        }else{
            System.out.println("Enough ingredients are not available to make latte for you. Come again after some time.");
        }
    }

    void buyCappuccino(){
        if(ingredientsAvailable.get("Water") >= cappuccino.get("Water")  && ingredientsAvailable.get("Milk") >= cappuccino.get("Milk") && ingredientsAvailable.get("Beans") >= cappuccino.get("Beans")){
            moneyBox+=cappuccino.get("Price");

            Integer updatedWaterCap = ingredientsAvailable.get("Water") - cappuccino.get("Water");
            ingredientsAvailable.put( "Water" , updatedWaterCap );

            Integer updatedMilkCap = ingredientsAvailable.get("Milk") - cappuccino.get("Milk");
            ingredientsAvailable.put( "Milk" , updatedMilkCap );

            Integer updatedBeansCap = ingredientsAvailable.get("Beans") - cappuccino.get("Beans");
            ingredientsAvailable.put( "Beans" , updatedBeansCap );


            ingredientsConsumed.put("Water" , ingredientsConsumed.getOrDefault("Water" , 0)+cappuccino.get("Water"));
            ingredientsConsumed.put("Milk" , ingredientsConsumed.getOrDefault("Milk" , 0)+cappuccino.get("Milk"));
            ingredientsConsumed.put("Beans" , ingredientsConsumed.getOrDefault("Beans" , 0)+cappuccino.get("Beans"));

            countOfCoffeesSold++;
            amountEarned+=cappuccino.get("Price");

            System.out.println("Your coffee cappuccino is ready..enjoy it..");
        }else{
            System.out.println("Enough ingredients are not available to make cappuccino for you. Come again after some time.");
        }
    }


    void fillIngredients(int water , int milk , int beans){
        ingredientsAvailable.put("Water" , ingredientsAvailable.getOrDefault("Water" , 0)+water);
        ingredientsAvailable.put("Milk" , ingredientsAvailable.getOrDefault("Milk" , 0) +milk);
        ingredientsAvailable.put("Beans" , ingredientsAvailable.getOrDefault("Beans" , 0) +beans);
    }




}
