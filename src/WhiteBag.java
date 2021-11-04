class WhiteBag {

    private int[] pebbles;
    public BlackBag linkedBlackBag;

    WhiteBag(){

    }
    WhiteBag(BlackBag linkedBlackBag) {
        this.linkedBlackBag = linkedBlackBag;
    }

    public void emptyToBlackBag() {

    }

    public void linkToBlackBag() {

    }

    public void setPebbles(int[] pebbles) {
        this.pebbles = pebbles;
    }

    public int[] getPebbles() {
        return pebbles;
    }

    public boolean isEmpty() {
        if(pebbles.length == 0)
            return true;
        return false;
    }
}