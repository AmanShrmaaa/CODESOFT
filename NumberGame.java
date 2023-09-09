import java.util.Scanner;
import java.util.Random;
public class NumberGame 
{
    public static void main(String [] args)
    {
        int random=0;
        int count=0;
        Scanner sc=new Scanner(System.in);
        for(int i=1; i < 4; i++)
        {
            System.out.println("Please guess a number in the range of 1 to 100 : ");
            int guess=sc.nextInt();
            Random rg= new Random();
            for (int j=1;j<2;j++)
            {
                random=rg.nextInt(100)+1; 
            }
            System.out.println(random);
            if (random==guess)
            {
                System.out.println("Correct");
                count++;
            }
            else 
            System.out.println("Incorrect");
            if (random<guess)
            System.out.println("Your guess is too high");
            else 
            System.out.println("Your guess is too low");
        }
        System.out.println("**********End*********");
        System.out.println();
        System.out.println("Your score is : " + count);
    }
}
