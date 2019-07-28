#include<stdio.h>
int main()
{
  	int n,i,ele1,ele2,ele1_i=-1,ele2_i=-1;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d %d",&ele1,&ele2);
  for(i=0;i<n;i++)
  {
  if(ele1==arr[i] && ele1_i==-1)
  {
    ele1_i=i;
  }
     if(ele2==arr[i] && ele2_i==-1)
  {
    ele2_i=i;
  }
  }
   printf("Element 1 index = %d\nElement 2 index = %d",ele1_i,ele2_i);
}

