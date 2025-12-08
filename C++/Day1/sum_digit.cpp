#include <iostream>
using namespace std;
int main(){
    int num,sum = 0;
    cout<<"enter the number"<<endl;
    cin>>num;
    
    while(num!=0){
        int rem= num%10;
        sum=sum + rem;
        num = num/10;
    }
        cout<<sum;

}