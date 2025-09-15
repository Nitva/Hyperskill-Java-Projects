public class Coffee {
    private final int water;
    private final int coffeeBeans;
    private final int milk;
    private final int money;

    public Coffee(int water, int coffeeBeans, int milk, int money) {
        this.water = water;
        this.coffeeBeans = coffeeBeans;
        this.milk = milk;
        this.money = money;
    }

    public int getWater() { return water; }
    public int getCoffeeBeans() { return coffeeBeans; }
    public int getMilk() { return milk; }
    public int getMoney() { return money; }

}
