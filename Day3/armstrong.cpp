#include<iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter the number:";
    cin>>n;
    int temp = n;
    int p = 0;

 
    while (n > 0) {
        int rem = n % 10;
        p = (p) + (rem * rem * rem);
        n = n / 10;
    }


    if (temp == p) {
        cout << ("It is Armstrong No.");
    }
    else {
        cout << ("It is not an Armstrong No.");
    }
    return 0;
}