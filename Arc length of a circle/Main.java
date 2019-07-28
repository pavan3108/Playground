#include<stdio.h>
int main()
{
  float r,c,l,pi=3.14;
  scanf("%f %f",&r,&c);
  l=2*pi*r*(c/360);
  printf("%.2f",l);
  return 0;
}
  