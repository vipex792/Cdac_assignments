#include <iostream>
using namespace std;


int main(){

    int fact=1,n;

    cout<<"Enter num : ";
    cin>>n;

    if(n<0){
        cout<<"Fact not defined for neg number";
    }

    else if(n==0){
        cout<<"Factorial is 1\n";
    }

    else{
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        cout<<"Factorial of "<<n<<" is "<<fact;
    }
}