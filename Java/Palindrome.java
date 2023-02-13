import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Palindrome
{ 
    public static boolean palindrome(String str){
        char[] ch = str.toCharArray();

        for(int i=0;i<= ch.length/2;i++)
        {
            if(ch[i] != ch[(ch.length-1)-i])
            {
                System.out.println("Not Palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;
    }
    public static void test_Palindrome (String x, Boolean expected)
    {
        if(palindrome(x) == expected)
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("Failure");
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        File filename = new File("Data_Files/TestCase_Palindrome.txt");
        Scanner sc = new Scanner(filename);

        String value;
        boolean expected;
        while(sc.hasNextLine())
        {
            value = sc.next();
            expected = sc.nextBoolean();
            System.out.println("val : "+ value+" ,expected : "+expected);
            test_Palindrome(value, expected);
        }
    }
} 