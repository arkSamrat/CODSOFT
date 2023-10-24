import java.util.*;

public class Number 
{
    public static void main(String[] args) 
    {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int num=r.nextInt(100);
        System.out.println("Enter the Number");
        boolean numNotGuessedCorrectly=false;
        while(!numNotGuessedCorrectly)
        {int guessNum =sc.nextInt();
        
        if(num==guessNum)
        {   numNotGuessedCorrectly=true;
            System.out.println("Guess number is correct:");
            
        }else if(num<=guessNum)
        {
            System.out.println("Enter low Number:");
            
        }else
        {
            System.out.println("Enter high Number:");
            
        }
        }
    }
}
