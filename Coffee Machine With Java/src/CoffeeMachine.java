import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;
    private static boolean exit = false;
    static int cleaningCountdown = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mode;

        Coffee espresso = new Coffee(250, 16, 4);
        Coffee latte = new Coffee(350, 75, 20, 7);
        Coffee cappuccino = new Coffee(200, 100, 12, 6);


        do {
            System.out.println("\nWrite action (buy, fill, take, clean, remaining, exit): ");
            mode = input.nextLine();
            System.out.println("----------------------------------");



            switch (mode.toLowerCase()) {
                case "buy":
                    if (cleaningCountdown == 10) {
                        System.out.println("I need cleaning!\n");
                        System.out.println("----------------------------------");
                        break;
                    }

                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String choice = input.nextLine();
                    Coffee selectedCoffee = null;

                    switch (choice) {
                        case "1","espresso" -> selectedCoffee = espresso;
                        case "2","latte" -> selectedCoffee = latte;
                        case "3", "cappuccino" -> selectedCoffee = cappuccino;
                        case "back" -> {
                        }
                        default -> System.out.println("Invalid choice");
                    }
                    if (selectedCoffee != null) {
                        buyCoffee(selectedCoffee);
                        System.out.println();

                    }
                    System.out.println("----------------------------------");
                    break;


                case "remaining":
                    System.out.println();
                    currentState();
                    System.out.println("----------------------------------");
                    break;


                case "fill":
                    System.out.println();
                    fillMachine(input);
                    System.out.println("----------------------------------");
                    break;

                case "take":
                    System.out.println();
                    takeMoney();
                    System.out.println("----------------------------------");
                    break;

                case "exit":
                    System.out.println();
                    exit = true;
                    break;

                case "clean":
                    cleaningCountdown = 0;
                    System.out.println("\nI have been cleaned!");
                    System.out.println("----------------------------------");
                    break;

                default:
                    System.out.println("\nInvalid input");
                    System.out.println();
                    System.out.println("----------------------------------");
                    break;

            }


        } while (!exit);

    }


    public static void fillMachine(Scanner input) {


        System.out.println("Write how many ml of water you want to add:");
        water += input.nextInt();


        System.out.println("\nWrite how many ml of milk you want to add: ");
        milk += input.nextInt();


        System.out.println("\nWrite how many grams of coffee beans you want to add: ");
        coffeeBeans += input.nextInt();

        System.out.println("\nWrite how many cups of coffee you will need:");
        cups += input.nextInt();

        input.nextLine();
        System.out.println();


    }

    public static void currentState() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money \n");

    }

    public static void takeMoney() {
        System.out.println("I gave you " + money+ "€");
        money = 0;
    }

    public static void buyCoffee(Coffee coffee) {
        if (water < coffee.getWater()) {
            System.out.println("Sorry, not enough water!");
            return;
        }
        if (milk < coffee.getMilk()) {
            System.out.println("Sorry, not enough milk!");
            return;
        }
        if (coffeeBeans < coffee.getCoffeeBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        }
        if (cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
            return;
        }

        System.out.println("I have enough resources, making you a coffee!");
        cleaningCountdown++;
        water -= coffee.getWater();
        coffeeBeans -= coffee.getCoffeeBeans();
        cups -= 1;
        if (coffee.itHasMilk()) {
            milk -= coffee.getMilk();
        }
        money += coffee.getMoney();
    }


}