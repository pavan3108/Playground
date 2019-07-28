#include<stdio.h>
#include<string.h>
int main()
{
char str[100];
  int l,c=1,i;
  gets(str);
  l=strlen(str);
  if(l>20)
    printf("Invalid Input");
  else
    
  {
    
    for(i=0;i<l;i++){
      
      if(str[i]==str[i+1]){
        c=c+1;
      }
      else{
        printf("%c%d",str[i],c);
        c=1;
      }
    }
}
}