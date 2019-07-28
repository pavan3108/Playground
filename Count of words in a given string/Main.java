#include<stdio.h>

int main()
{
char ch[100];
  int i,len,word=1;
  gets(ch);
  len=strlen(ch);
  for(i=0;i<len;i++)
  {
    if(ch[i]!=' '&&ch[i+1]==' ')
      word=word+1;
  }
  printf("%d",word);
}