class CoffeeMachine {
    public Coffee makeCoffee(String type) {
        return new Coffee(type);
    }
}
class PremiumCoffeeMachine extends CoffeeMachine {
    @Override
    public Coffee makeCoffee(String type) {
        Coffee coffee = super.makeCoffee(type);
        coffee.addChocolate();
        return coffee;
    }
}
//в премиум кофе добавляется шоколад, но больше оно ничем не отличается
