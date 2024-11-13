public class Main {
    public static void main(String[] args) {
        Animal chicken = new Chicken();
        Animal tiger = new Tiger();
        Fruit orange = new Orange();
        Fruit apple = new Apple();

        chicken.makeSound();
        System.out.println(((Edible) chicken).howToEat());

        tiger.makeSound();

        System.out.println(orange.howToEat());
        System.out.println(apple.howToEat());
    }
}

