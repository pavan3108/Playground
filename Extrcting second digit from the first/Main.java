#include <stdio.h>
int main() {
	int a,b,c;
  scanf("%d",&a);
  if(a>100)
  {
  b=a/1000;
  c=b%10;
  printf("%d",c);
  }
  else
  {
    c=a%10;
     printf("%d",c);
  }
	return 0;
}