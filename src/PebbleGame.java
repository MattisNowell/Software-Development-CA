import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.beans.Transient;
import java.util.Scanner;
import java.io.*;

import org.junit.jupiter.api.Test;
public class PebbleGame {
    public static void main (String[] args){
        int a = getNumberOfPlayers();
        System.out.println(a);

        createCSV(a);

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

    public static void createCSV(int a){
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\georg\\OneDrive\\Documents\\GitHub\\Software-Development-CA\\src\\example.csv"));
            StringBuilder sb = new StringBuilder();
            
            for (int x=0;x<3;x++){              
                for (int i=0;i<a*11;i++){ 
                    int randomInteger = (int)(Math.random() * 20+1);   
                    sb.append(Integer.toString(randomInteger));
                    sb.append(",");
                }
                sb.append("\n");
            }

            pw.write(sb.toString());
            pw.close();

            System.out.println("done");
        } catch (Exception e) {
            return;
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

    @Test
    public void getNumberOfPlayersInvalidInputTest(){
        int a = getNumberOfPlayers();
        if (a == -1){
            fail("input must be an integer");
        }
    }
}

