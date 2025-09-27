// NUMBER PATTERN 2: Right-aligned triangle

#include <iostream>
using namespace std;

int main() {
    int rows = 5;
    for(int i = 1; i <= rows; i++) {
        for(int space = 1; space <= rows - i; space++) {
            cout << "  ";
        }
        for(int j = 1; j <= i; j++) {
            cout << i << " ";
        }
        cout << endl;
    }
    return 0;
}
