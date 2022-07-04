#include<iostream.h>
{
	void printPerm(char str1[20], char perm[20]){
		if(strlen(str1)==0){
			printf("%s",perm[]);
		}
		
		for(int i=0;i<strlen(str1);i++)
		{	
			char currChar = str1.charAt(i);
			char newStr[20]=substring(str1, 0, i)+substring(str1, i+1);
			printPerm(newStr, perm+currChar);
		}
	}
	void main(){
		char str1[20]="abc";
		printPerm(str,"");
	}
}