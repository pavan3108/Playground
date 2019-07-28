#include <stdio.h>
#include<math.h>
int main()
{
  int a,b;
  scanf("%d %d",&a,&b);
  if(b<0)
    printf("Wrong input");
  else
  {
    int c=pow(a,b);
    printf("%d",c);
  }
    return 0;
}