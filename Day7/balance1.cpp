#include <iostream>
using namespace std;

class BankAmount {
double balance; //pvt

public:
BankAmount (double intialbalance){
balance = intialbalance;

}
 void deposit(){
    double Amount;
    if(Amount > 0){
    balance+=Amount;
    cout<<"the amount you deposit is "<<Amount<<endl;
    }
 }
 void withdraw(){
    double Amount;
    if(Amount > 0 && Amount<=balance){
       balance-=Amount;
        cout<<"withdraw amount is "<<Amount<<endl;
        
    }
    else{
        cout<<"isffficient balance";
    }
    
 }
 double getbalance()
    {
        return balance;
    }

};
 int main(){
    BankAmount acc(1000);
    acc.deposit();
    acc.withdraw();
    double Amount;
    cout<<"Enter the amount";
    cin>>Amount;
    cout<<"current balance "<<acc.getbalance()<<endl;

 }


