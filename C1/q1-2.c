#include<stdio.h>

void reverse(char *c)
{
    int i = 0;
    while (c[i]) i++;
    char *end, *start;
    end = c + i - 1;
    start = c;
    char tmp;
    while ( start < end)
    {
        tmp = *end;
        *end-- = *start;
        *start++ = tmp; 
    }
}
int main(int argc, char * argv[])
{
    char input[] = "aedcbv";
    reverse(input);
    char *c;
    c = input;
    while (*c)
    {
        printf("%c", *c++);
    }
    printf("\n");
    return 0;
}
