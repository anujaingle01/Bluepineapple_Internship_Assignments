import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class No_of_Digit {

    public static int countDigits(int x)
    {
        // Scanner sc = new Scanner(System.in);
        // int x = Math.abs(sc.nextInt());
            int cnt = 0;
            while (x> 0) 
            {
                cnt++;
                x /= 10;
            }
            System.out.println("Actual :"+cnt);
            return cnt;
    }

    public static boolean test_countDigits(int x, int expected)
    {
        if(countDigits(x) == expected)
        {
            System.out.println("Success");
        }
        else{
            System.out.println("Failure");
        }

        return true;
    }

    public static void main(String[] args) throws FileNotFoundException 
    {
        File filename = new File("Data_Files/TestCase_NoOfDigits.txt");
        Scanner sc = new Scanner(filename);

        int value,expected;
        while(sc.hasNextLine())
        {
            value = sc.nextInt();
            expected = sc.nextInt();
            System.out.println("val : "+ value+" ,expected : "+expected);

            test_countDigits(value, expected);
        }
    }
}