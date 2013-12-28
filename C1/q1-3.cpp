#include<iostream>

void remove_duplicate(char *str)
{
    bool table[256] = {false};
    char *pt = str;    
    while (*pt)
    {
        int index = (int)(*pt);
        if (table[index]) pt++;
        else 
        {
            table[index] = true;
            std::cout << *pt;
            pt++;
        }    
    }
    std::cout << '\n'; 
}
int main()
{
    char str[] = "ababababababab";
    remove_duplicate(str);
    char *pt;
}
