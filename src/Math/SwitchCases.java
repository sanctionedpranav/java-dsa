package math;

public class SwitchCases {

    public static void main(String args[]) {
        // int choices = 3;

        // switch(choices){
        //   case 1: 
        //   System.out.println("Burger"); 
        //   break;
        //   case 2: 
        //   System.out.println("Burger");
        //   break;
        //   case 3: 
        //   System.out.println("Burger");
        //   break;
        //   case 4: 
        //   System.out.println("Burger");
        //   break;
        // }
        String choices = "Pizza";

        switch (choices) {
            case "Burger" ->
                System.out.println("Burger");
            case "Pizza" ->
                System.out.println("Pizza");
            case "Pasta" ->
                System.out.println("Pasta");
            case "Sandwich" ->
                System.out.println("Sandwich");
            default ->
                System.out.println("Invalid Choice");
        }
    }
}
