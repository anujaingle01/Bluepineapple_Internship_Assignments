import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

class Total_Occurance
{
    public static String occurance(int x)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        while(x > 0)
        {
            int digit = x % 10 ;
            // System.out.println(digit);
            x /= 10;
            // System.out.println(x);
            if(!map.containsKey(digit)) 
            {
                map.put(digit, 1);
            }
            else
            {
                int cnt = map.get(digit);
                map.put(digit, cnt+1);
            }
            // System.out.println(map.toString());
        }

        System.out.println("Actual :" +map.toString());
        return map.toString();
    }

    public static void test_occurance(int x, String expected)
    {
        if(occurance(x).equals(expected))
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("Failure");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File filename = new File("Data_Files/TestCase_Occurance.txt");
        Scanner sc = new Scanner(filename);

        int value;
        String expected;
        while(sc.hasNextLine())
        {
            value = sc.nextInt();
            expected = sc.nextLine().trim();
            System.out.println("val : "+ value+" ,expected : "+expected);

            test_occurance(value, expected);
        }
  
        
    }
}