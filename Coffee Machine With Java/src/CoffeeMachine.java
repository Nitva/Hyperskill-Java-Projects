import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;
    static int cleaningCountdown = 0;
    private static boolean exit = false;

    // I used coffee as constants
    private static final Coffee ESPRESSO = new Coffee(250, 16, 4);
    private static final Coffee LATTE = new Coffee(350, 75, 20, 7);
    private static final Coffee CAPPUCCINO = new Coffee(200, 100, 12, 6);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\nWrite action (buy, fill, take, clean, remaining, exit): ");
            String mode = input.nextLine().toLowerCase();

            switch (mode) {
            case "buy" -> buy(input);
            case "fill" -> fillMachine(input);
            case "take" -> takeMoney();
            case "clean" -> clean();
            case "remaining" -> currentState();
            case "exit" -> exit = true;
            default -> System.out.println("\nInvalid input");
            }

            System.out.println("----------------------------------");
        } while (!exit);
    }

    private static void buy(Scanner input) {
        if (cleaningCountdown == 10) {
            System.out.println("I need cleaning!\n");
            return;
        }

        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = input.nextLine();

        Coffee selectedCoffee = switch (choice) {
            case "1", "espresso" -> ESPRESSO;
            case "2", "latte" -> LATTE;
            case "3", "cappuccino" -> CAPPUCCINO;
            case "back" -> null;
            default -> {
                System.out.println("Invalid choice");
                yield null;
            }
        };

        if (selectedCoffee != null) {
            buyCoffee(selectedCoffee);
            System.out.println();
        }
    }

    private static void fillMachine(Scanner input) {
        System.out.println("Write how many ml of water you want to add:");
        water += input.nextInt();

        System.out.println("Write how many ml of milk you want to add: ");
        milk += input.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeans += input.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        cups += input.nextInt();

        input.nextLine(); //Clear the scanner buffer
        System.out.println();
    }

    private static void currentState() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money \n");
    }

    private static void takeMoney() {
        System.out.println("I gave you " + money + "€");
        money = 0;
    }

    private static void clean() {
        cleaningCountdown = 0;
        System.out.println("\nI have been cleaned!");
    }

    private static void buyCoffee(Coffee coffee) {
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
        cups--;
        if (coffee.itHasMilk()) {
            milk -= coffee.getMilk();
        }
        money += coffee.getMoney();
    }
}
