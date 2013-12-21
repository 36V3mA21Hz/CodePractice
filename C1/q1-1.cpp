#include <iostream>
#include <string>
using namespace std;
class DetermineString
{
    string str;
public:
    DetermineString(string str) {this->str = str;};
    bool DetermineUnique()
    {
        char letters[256] = {};
        for (int i = 0; i < str.length(); i++)
        {
            int j = (int)str[i];
            if (letters[j]) return false;
            else letters[j] = true;
        }
        return true;
    };
};
int main()
{
    string s0 ("lqwerqtyu.");
    DetermineString d0(s0);
    cout << d0.DetermineUnique() << endl;
    return 0;    
}

