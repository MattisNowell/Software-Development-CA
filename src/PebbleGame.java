import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
public class PebbleGame {
    public static void main (String[] args){
        System.out.println(getNumberOfPlayers());
    }

    public static int getNumberOfPlayers(){
        Scanner myObj = new Scanner(System.in);
        String numberOfPlayers;

        System.out.println("Enter number of players, then press enter :");
        numberOfPlayers = myObj.nextLine(); 

        // System.out.println("Number of players is : " + numberOfPlayers);  

        try {
            int num=Integer.parseInt (numberOfPlayers) ;         
            return num;
        } catch(NumberFormatException e) {
             return -1;
        }
    }

    public int higher(int x, int y) {
        if(x > y) 
            return x;
        else
            return y;
    }

    @Test
    public void higherTest() {
        assertEquals(5, higher(5, 3));
    }
}
