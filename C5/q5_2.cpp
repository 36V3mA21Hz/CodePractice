#include<iostream>
#include<string>
using namespace std;

void getB(const double &n) {
	double x = n;
	string out = "0.";
	x *= 2;
	while (x != 0) {
		if (out.size() > 32) {
			cout << "Error" << endl; 
			return;
		}
		int i = (int)x;
		out.append(to_string(i));
		x = (x - i) *2;
	}
	cout << out << endl;

}
int main() {
	double in = 0.75;
	getB(in);
	return 0;
}
