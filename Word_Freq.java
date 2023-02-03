import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

class Word_Freq
{
    public static void main(String[] args) throws FileNotFoundException {
        
        File fileName = new File("Data_Files/TestCase_Mahabharat.txt");
        Scanner sc = new Scanner(fileName);
        
        HashMap<String,Integer> count = new HashMap<>();
        
        while (sc.hasNextLine()) 
        {
            String data = sc.nextLine();
            System.out.println(data);
            String[] words = data.split(" ");
            for(String word:words)
            {
                word = word.toLowerCase();
                if(!count.containsKey(word)) 
                {
                    count.put(word, 1);
                }
                else
                {
                    int cnt = count.get(word);
                    count.put(word, cnt+1);
                }
            }
        }
        System.out.println(count.toString());
        sc.close();

    }
}