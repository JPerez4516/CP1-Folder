import java.util.Random;
import java.util.Scanner;
public class RollingTwoDice
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner kin = new Scanner(System.in);
        int okay=(int)(Math.random()*6+1);
        int ok=(int)(Math.random()*6+1);
        int summm = (int)(ok + okay);
        System.out.println("Rolling Two Dice");
                System.out.println("Dice 1:" + okay + "Dice 2: " + ok + "sum of two dice: " + 	(summm));
                System.out.print("Would you like to roll again (1 = yes / 2 = no)");
                int s = kin.nextInt();
        while ( s == 1)
        {
        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
        int sum = (int)(dice1 + dice2);
        System.out.println("Dice 1:" + dice1 + "Dice 2: " + dice2 + "sum of two dice: " +     (sum));
        System.out.print("Would you like to roll again (1 = yes / 2 = no)");
        }
    }
}

