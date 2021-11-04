import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

import org.junit.jupiter.api.Test;

public class PebbleGame {
    public static void main (String[] args){
        int a = getNumberOfPlayers();
        System.out.println(a);

        BlackBag bagA = new BlackBag();
        BlackBag bagB = new BlackBag();
        BlackBag bagC = new BlackBag();

        Player[] playerlist = new Player[a];

        int[][] generatedPebbles = createCSV(a);

        bagA.setPebbles(generatedPebbles[0]);
        bagB.setPebbles(generatedPebbles[1]);
        bagC.setPebbles(generatedPebbles[2]);

        System.out.println(Arrays.toString(playerlist[0].takeTen(bagA)));
        System.out.println(bagA.getPebbles());
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

    public static int[][] createCSV(int a){
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\matti\\Desktop\\Uni\\Computer Science Year 2\\Software Dev\\Coursework\\Software-Development-CA\\src\\example.csv"));
            StringBuilder sb = new StringBuilder();

            //C:\\Users\\georg\\OneDrive\\Documents\\GitHub\\Software-Development-CA\\src\\example.csv
            //C:\\Users\\matti\\Desktop\\Uni\\Computer Science Year 2\\Software Dev\\Coursework\\Software-Development-CA\\src\\example.csv

            int[][] blackBags = {{}, {}, {}};
            for (int x=0;x<3;x++){
                int[] bag = new int[a*11];
                for (int i=0;i<a*11;i++){
                    int randomInteger = (int)(Math.random() * 20+1);
                    bag[i] = randomInteger;
                    sb.append(Integer.toString(randomInteger));
                    sb.append(",");
                }
                blackBags[x] = bag;
                sb.append("\n");
            }

            pw.write(sb.toString());
            pw.close();

            System.out.println("done");
            return blackBags;
        } catch (Exception e) {
            return null;
        }
    }

    public int higher(int x, int y) {
        if(x > y)
            return x;
        else
            return y;
    }

    @Test
    public void getNumberOfPlayersInvalidInputTest(){
        int a = getNumberOfPlayers();
        if (a == -1){
            fail("input must be an integer");
        }
    }
}