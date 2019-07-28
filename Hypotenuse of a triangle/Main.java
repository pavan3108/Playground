#include<stdio.h>
#include<math.h>
int main()
{
  float a,b;
  scanf("%f %f",&a,&b);
  a=a*a;
  b=b*b;
  float c=a+b;
  c=sqrt(c);
  printf("%.2f",c);
  return 0;
}