#include <stdio.h>

int main()
{
    int num, sum=0, firstDigit, lastDigit;

    /* Input a number from user */
    
    scanf("%d", &num);
    
    /* Find last digit to sum */
    lastDigit = num % 10;
    

    /* Copy num to first digit */
    firstDigit = num;

    /* Find the first digit by dividing num by 10 until first digit is left */
    while(num >= 10)
    {
        num = num / 10;
    }
    firstDigit = num;


    
    sum = firstDigit + lastDigit; 

    printf("%d", sum);

    return 0;
}

