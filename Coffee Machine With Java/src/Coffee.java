public class Coffee {
    private int water;
    private int coffeeBeans;
    private int milk;
    private int money;
    private boolean hasMilk=false;

    public Coffee(int water, int milk, int coffeeBeans, int money) {
        this.water = water;
        this.coffeeBeans = coffeeBeans;
        this.milk = milk;
        this.money = money;
        this.hasMilk = true;
    }
    public Coffee(int water, int coffeeBeans, int money) {
        this.water = water;
        this.coffeeBeans = coffeeBeans;
        this.money = money;
    }



    //Metodos para obtener datos sobre el cafe

    public int getWater() {
        return water;
    }



    public int getCoffeeBeans() {
        return coffeeBeans;
    }



    public int getMilk() {
        return milk;
    }

    public int getMoney() {
        return money;
    }


    public boolean itHasMilk() {
        return hasMilk;
    }


}