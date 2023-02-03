import java.time.LocalDate;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class LeapDay
{
    public static boolean checkYear(int dd,int mm,int yy) 
	{
		if(dd == 29 && mm == 2)
		{
			if (yy % 400 == 0)
				return true;
			if (yy % 100 == 0)
				return false;
			if (yy % 4 == 0)
				return true;
		}
		return false;
	}

    public static void test_LeapDay(String date,boolean expected)
    {
        LocalDate le = LocalDate.parse(date);

        int dd = le.getDayOfMonth();
        int mm = le.getMonthValue();
        int yy = le.getYear();

        if(checkYear(dd,mm,yy) == expected)
            System.out.println("Success");
        else
            System.out.println("Failure");
        // System.out.println(checkYear(dd,mm,yy) ? " is Leap day<br>" :  " is Not a Leap day<br>");
    }

    public static void main(String[] args) throws FileNotFoundException {
        
        File filename = new File("Data_Files/TestCase_LeapDay.txt");
        Scanner sc = new Scanner(filename);

        String value;
        boolean expected;
        while(sc.hasNextLine())
        {
            value = sc.next();
            expected = sc.nextBoolean();
            System.out.println("val : "+ value+" ,expected : "+expected);

            test_LeapDay(value, expected);
        }
    }
}