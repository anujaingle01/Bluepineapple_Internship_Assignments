#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void convert(char *num) {
   int len = strlen(num);

   if (len == 0)
   {
      fprintf(stderr, "empty string");
      return;
   }
   if (len > 4)
   {
      fprintf(stderr, "Length more than 4 is not supported");
      return;
   }
  
   char *single_digit[] = { "zero", "one", "two", "three", "four","five", "six", "seven", "eight", "nine"};


      char *tens_place[] = {"", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};


      char *tens_multiple[] = {"", "", "twenty", "thirty", "forty", "fifty","sixty", "seventy", "eighty", "ninety"};

      char *tens_power[] = {"hundred", "thousand"};
   printf("%s: ", num);

   if (len == 1) {

      printf("%s", single_digit[*num - '0']);
      return;
   }
   while (*num != '\0') {

      if (len >= 3) {

         if (*num -'0' != 0) {
            printf("%s ", single_digit[*num - '0']);
            printf("%s ", tens_power[len-3]); // here len can be 3 or 4
         }
         --len;
      }
    
      else {
         
         if (*num == '1') {
            int sum = *num - '0' + *(num + 1)- '0';
            printf("%s", tens_place[sum]);
            return;
         }
        
         else if (*num == '2' && *(num + 1) == '0') {
            printf("twenty");
            return;
         }
         
         else {
            int i = *num - '0';
            printf("%s ", i? tens_multiple[i]: "");
            ++num;
            if (*num != '0')
               printf("%s ", single_digit[*num - '0']);
         }
      }
      ++num;
   }
}
int main() {
   convert("132");
   return 0;
}
