#include<iostream>
using namespace std;
int main(){
    int h;

    cout<<"Enter height: ";
    cin>>h;

    for(int i = 1;i<=h; ++i){
        char ch ='A';

        for(int s=1;s<=h-i;++s){
            cout<<"  ";
        }

        for(int j = 1; j<=(2*i-1);j++){
            cout<< ch<<" ";
            ch++;
        }

    cout<<endl;

    }
}


