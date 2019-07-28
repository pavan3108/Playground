#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  if(a>0)
    if(a<6)
      printf("Three");
  else
    printf("Invalid");
  return 0;
}