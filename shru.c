/* Vowel or Consonant or Invalid */
#include <stdio.h>

int main() {
	char ch;
	scanf("%c",&ch);
	if((ch >='a' && ch<='z')||(ch >= 'A '&& ch <= 'Z'))
	{
		if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
		printf("Vowel");
		else
		printf("Consonant");
	}
	else
	printf("Invalid");
	return 0;
}
