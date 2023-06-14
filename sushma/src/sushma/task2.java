package sushma;

import java.util.Random;
import java.util.Scanner;
public class task2
{
    public static void main(String args[])
    {
        Random r=new Random();
        int r1=r.nextInt(100);
        int score=100,chance=10;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<chance;i++)
        {
            System.out.println("Please Enter your number ");
            int num=sc.nextInt();
            if(r1==num)
            {
                System.out.println("Yeah! Your number is Matched with Generated number ");
                System.out.print("Your guessing score is "+score+"%");
                break;
            }
            else if(num<r1)
            {
                score=score-10;
                System.out.println("Your number is less than Generated Number! TRY AGAIN");
            }
            else if(num>r1)
            {
                score=score-10;
                System.out.println("Your number is More than Generated Number! TRY AGAIN");
            }
        }
    }
}