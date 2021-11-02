
class Player implements Runnable{

    private int[] hand;
    private int totalWeight;

    Player() {
        this.hand = takeTen();
    }

    public void run(){

    }

    public int[] takeTen() {
        int[] arr={1,2};
        return arr;
    }

    public void discardPebble(int pebble) {

    }

    public void logAction(String file) {

    }

    public boolean checkHand() {
        return false;
    }

    public int[] getHand() {
        return hand;

    }

    public int getWeight() {
        return totalWeight;
    }
 }