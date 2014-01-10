#include<iostream> 

void insertBits(const unsigned &m, unsigned &n, int j, int i) {
	unsigned clear = ((1 << (j + 1)) - 1);
	clear = clear & (~0 << i);
	clear = ~clear;
	n &= clear;
	unsigned rm = m << i;
	n |= rm;
}
int main() {
	unsigned n = 0x16b;
	const unsigned m = 0x14;
	insertBits(m, n, 6, 2);
	return 0;
}
