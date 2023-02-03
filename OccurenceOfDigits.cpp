 #include<stdio.h>

int main() {

    int n = 123000321; 
    int d = 0; 

    int count=0; 

    while(n) {

        int rem = n%10; 
        if(rem == d){
            count++;
        }
        n=n/10; 
    }

    printf("%d",count);

    return 0;

}
