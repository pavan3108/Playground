#include <stdio.h>

int main()
{
    int i, n, sum=0;

    /* Input upper limit from user */
   
    scanf("%d", &n);

    /* Find sum of all numbers */
    for(i=1; i<=n; i++)
    {
        sum += i;
    }

    printf("%d", sum);

    return 0;
}