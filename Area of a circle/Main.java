#include<stdio.h>
int main()
{
  int diameter;
  float pi=3.14,r,area;
  scanf("%d",&diameter);
  r=(float)diameter/2;
  area=pi*r*r;
  printf("%.2f",area);
  return 0;
}