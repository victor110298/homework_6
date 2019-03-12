package store;

import java.util.ArrayList;

public class FlowerStore {
    private ArrayList<String> firstBouquet;
    private ArrayList<String> secondBouquet;
    private int walletAfter;
    private int walletBefore = 1000;

    public ArrayList<String> sell(int countOfRose, int countOfCamomile, int countOfTulip) {
        int i = countOfRose + countOfCamomile + countOfTulip;
        ArrayList<String> firstListofFlowers = new ArrayList<>();
        int j = 0;
        while (j < countOfRose) {
            firstListofFlowers.add("Rose");
            countOfRose--;
            walletAfter += Rose.PRICE;
        }
        while (j < countOfCamomile) {
            firstListofFlowers.add("Camomile");
            countOfCamomile--;
            walletAfter += Camomile.PRICE;

        }
        while (j < countOfTulip) {
            firstListofFlowers.add("Tulip");
            countOfTulip--;
            walletAfter += Tulip.PRICE;
        }
        firstBouquet = firstListofFlowers;
        return firstBouquet;
    }

    public ArrayList<String> sellSequence(int countOfRose, int countOfCamomile, int countOfTulip) {
        int i = countOfRose + countOfCamomile + countOfTulip;
        ArrayList<String> listOfFlowers = new ArrayList<>();
        int j = 0;
        while (j < i) {
            if (countOfRose > 0) {
                listOfFlowers.add("Rose");
                countOfRose--;
                j++;
                walletAfter += Rose.PRICE;

            }
            if (countOfCamomile > 0) {
                listOfFlowers.add("Camomile");
                countOfCamomile--;
                j++;
                walletAfter += Camomile.PRICE;
            }
            if (countOfTulip > 0) {
                listOfFlowers.add("Tulip");
                countOfTulip--;
                j++;
                walletAfter += Tulip.PRICE;
            }
        }
        secondBouquet = listOfFlowers;
        return secondBouquet;
    }

    public void print() {
        System.out.print("First bouquet: ");
        for (int i = 0; i < firstBouquet.size(); i++) {
            System.out.print(firstBouquet.get(i) + ", ");
        }
        System.out.print("\nSecond bouquete: ");
        for (int i = 0; i < secondBouquet.size(); i++) {
            System.out.print(secondBouquet.get(i) + ", ");
        }
        System.out.println("\nBefore sell was " + walletBefore + " grn! " + " After sell --- " + (walletAfter + walletBefore) + " grn");
    }
}


