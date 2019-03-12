package store;

public class Flowers {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        flowerStore.sell(4, 5, 3);
        flowerStore.sellSequence(3, 2, 1);
        flowerStore.print();
    }
}
