#include <iostream>
using namespace std;

int main() {
    int n, cnt = 0;

    cout<<"Enter the number : ";
    cin>>n;
    
    if (n==0 || n==1)
        cout << n << " is not prime no.";
    else {

        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                cnt++;
        }

        if (cnt > 1)
            cout << n << " is not prime no.";

        else
            cout << n << " is prime no.";
    }
    return 0;
}