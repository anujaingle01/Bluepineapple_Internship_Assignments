import java.util.Scanner;

class Clock
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int h = sc.nextInt();;
        int ch =0; 
        int cm = 0;
        for(int i=1;i<24;i++)
        {
            ch++;
            cm+=x;
            if(cm>=60)
            {
                ch++;
                cm-=60;
            }
            if(ch>=h)
            {
                System.out.println(i);
                break;
            }
            if(ch>=24)
            {
                ch-=24;
            }

        }
    }

}