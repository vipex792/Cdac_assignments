#include <iostream>
#include <cmath> 
using namespace std;

int main() {
    double principal, rate, time;

    cout << "Enter Principal amount: ";
    cin >> principal;

    cout << "Enter Annual Interest Rate: ";
    cin >> rate;

    cout << "Enter Time in years: ";
    cin >> time;

   
    double amount = principal * pow((1 + rate / 100), time);

    
    double compound = amount - principal;

    cout << "\nCompound Interest = " << compound << endl;
    cout << "Total Amount after compounding = " << amount << endl;

    return 0;
}