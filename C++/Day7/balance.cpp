#include <iostream>
using namespace std;

// Abstraction: Only exposing essential details like deposit, withdraw, getBalance).
class BankAccount {
private:
    // Data Hiding
    double balance;

public:
    // Encapsulation
    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            cout << "Deposited: " << amount << endl;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            cout << "Withdrawn: " << amount << endl;
        } else {
            cout << "Insufficient balance!" << endl;
        }
    }

    double getBalance() {   // Abstraction: gives essential info without exposing internal details
        return balance;
    }
};

int main() {

    double init,dep,with;

    cout<<"Enter initial : ";
    cin>>init;
    BankAccount acc(init); //NOT OVERLOADING NOT OVERRIDING BUT NORMAL MEMBER FUNCTION CALL
    
    cout<<"Enter deposit : ";
    cin>>dep;
    acc.deposit(dep);

    cout<<"Enter withdraw : ";
    cin>>with;
    acc.withdraw(with);

    // acc.balance = 99999 //due to data hiding
    
    cout << "Current Balance: " << acc.getBalance() << endl;
    return 0;
}
