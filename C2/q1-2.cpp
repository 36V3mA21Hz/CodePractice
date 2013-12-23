#include<iostream>
#include<string>

using namespace std;

class reverse_string
{
    string str;
    unsigned long length;
public:
    reverse_string(string str) { this->str = str; length = str.length();
        cout << length << endl; 
    };
    string reverse() {
        string str2;
        for (int i = 1; i < length; i++) 
            str2.push_back(str[length-i-1]);
        str2.push_back('\0');
        return str2;
    };
};
            
int main(int argc, char **argv)
{
    string line = argv[1];
    //string line = "Hello Wolrd";
    line.push_back('\0');
    reverse_string rs(line);
    line = rs.reverse();
    cout << line << endl;
    return 0;
} 
