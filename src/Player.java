
class Player implements Runnable{

    private int[] hand;
    private int totalWeight;

    Player() {

    }

    public void run(){

    }

    public int[] takeTen(BlackBag bag) {
        this.hand = bag.giveTen();
        return hand;
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