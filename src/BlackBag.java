import java.lang.reflect.Array;
import java.util.ArrayList;

class BlackBag{

    ArrayList<Integer> pebbles = new ArrayList<Integer>();
    public WhiteBag linkedWhiteBag;

    BlackBag(){

    }
    BlackBag(WhiteBag linkedWhiteBag) {
        this.linkedWhiteBag = linkedWhiteBag;
    }

    public int[] giveTen(){
        int[] hand = new int[10];
        for(int i = 0; i < 10; i++) {
            int randomInteger = (int)(Math.random() * (pebbles.size())+1);
            hand[i] = pebbles.get(randomInteger);
            pebbles.remove(randomInteger);
        }
        return hand;
    }

    public int givePebble(){
        return 1;
    }

    public void linkToWhiteBag() {

    }

    public void setPebbles(int[] pebbles) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        for(int i = 0; i < pebbles.length; i++)
            tempList.add(pebbles[i]);
        this.pebbles = tempList;
    }

    public  ArrayList<Integer> getPebbles() {
        return pebbles;
    }

    public boolean isEmpty() {
        if(pebbles.size() == 0)
            return true;
        return false;
    }
}
