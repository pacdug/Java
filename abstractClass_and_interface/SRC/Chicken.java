class Chicken extends Animal implements Edible {
    @Override
    public void makeSound() {
        System.out.println("Chicken says: cluck-cluck");
    }

    @Override
    public String howToEat() {
        return "Chicken: Grill it";
    }
}

