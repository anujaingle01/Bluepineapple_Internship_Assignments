import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Matrix_Multiplication
{
    public static void Matrix()
    {
        int[][] first = {{1,2,3}
                        ,{4,5,6}
                        ,{7,8,9}};

        int[][] second = {{11,12,13}
                         ,{14,15,16}
                         ,{17,18,19}};

        int[][] third = {{0,0,0},
                         {0,0,0},
                         {0,0,0}};

        for(int i=0;i<3;i++)
        {    
            for(int j=0;j<3;j++)
            {    
                third[i][j]=0;      
                for(int k=0;k<3;k++)      
                {      
                    third[i][j]+=first[i][k]*second[k][j];     

                }//end of k loop  
                System.out.print(third[i][j]+" ");  //printing matrix element  
            }//end of j loop  
            System.out.println();//new line    
        } 
    }
    public static void test_Matrix(int x, String expected)
    {
        if(Matrix(x).equals(expected))
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("Failure");
        }
    }

    // public static int[] assignToArray(String str)
    // {
    //     int[] array;
    //     String[] s = str.split("")

    //     int[] a = Arrays.fill(array, 0); "{1,2,3}";
    
    // }

    public static void main(String[] args) throws FileNotFoundException {
         
        File filename = new File("Data_Files/TestCase_MatrixMulti.txt");
        Scanner sc = new Scanner(filename);

        String first,second,expected;

        // int value;
        // Boolean expected;
        while(sc.hasNextLine())
        {
            



            first = Arrays. sc.next();
            expected = sc.next();
            System.out.println("val : "+ value+" ,expected : "+expected);

            test_Matrix(value, expected);
        }
            
    }
}