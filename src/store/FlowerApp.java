package store;

import java.util.Arrays;

public class FlowerApp {

    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        System.out.println("First bouquet "+Arrays.toString(flowerStore.sell(1, 3, 4)));
        System.out.println("Second bouquet "+Arrays.toString(flowerStore.sellSequence(4, 2, 6)));
        System.out.println(flowerStore.getWallet()+" grn");

    }
}
