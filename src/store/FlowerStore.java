package store;

public class FlowerStore {
    private int wallet;

    public int getWallet() {
        return wallet;
    }

    public Flower[] sell(int countOfRoses, int countOfCamomoles, int countOfTulips) {
        int numberOfFlowers = countOfRoses + countOfTulips + countOfCamomoles;
        Flower[] bouquet = new Flower[numberOfFlowers];
        for (int i = 0; i < countOfRoses; i++) {
            bouquet[i] = new Rose();
        }
        for (int i = countOfRoses; i < countOfRoses + countOfTulips; i++) {
            bouquet[i] = new Tulip();
        }
        for (int i = countOfRoses + countOfTulips; i < numberOfFlowers; i++) {
            bouquet[i] = new Camomile();
        }
        balance(bouquet);
        return bouquet;
    }

    public Flower[] sellSequence(int countOfRoses, int countOFTulips, int countOfCamomiles) {
        int numberOfFlowers = countOfRoses + countOFTulips + countOfCamomiles;
        Flower[] bouquet = new Flower[numberOfFlowers];
        int i = 0;
        while (i < numberOfFlowers) {
            if (countOfRoses > 0) {
                bouquet[i] = new Rose();
                countOfRoses--;
                i++;
            }
            if (countOFTulips > 0) {
                bouquet[i] = new Tulip();
                countOFTulips--;
                i++;
            }
            if (countOfCamomiles > 0) {
                bouquet[i] = new Camomile();
                countOfCamomiles--;
                i++;
            }
        }
        balance(bouquet);
        return bouquet;
    }

    private void balance(Flower[] bouquet) {
        for (int i = 0; i < bouquet.length; i++) {
            wallet += bouquet[i].getPrice();
        }
    }
}

