class Perfect_No
{
    public static void perfect_check(int no)
    {
        int sum=1;
        for(int i=2;i<=no/2;i++)
        {
            if(no%i==0)
            
                sum+=i;
        }
        if(sum == no)
            System.out.print(no + " ");
        //else
            //System.out.println("non perfect");
    }
    
    public static void main(String[] args) {
        // int n=1000;
        int[] arr = new int[] { 9383, 6483, 2500, 71, 1000 };
        for(int i = 0; i <=4; i++){
            System.out.print("\nFactors Of " + arr[i] + " is ");
            for(int j=1;j<=arr[i];j++)
        {
            perfect_check(j);
        }
        }
        
    }
}