#include <iostream>
using namespace std;

void display(char = '*', int =30); //declaration
int main(){
    int cnt ;
    cout<<"Enter the count: "<<endl;
    cin>>cnt;

    display(); //default value gets automatically passed //here* 
    cout<<"First";

    display('#');
    cout<<"# argument";

    display('$', cnt); 
    cout<<"Both arg passed";
    
}

void display(char c, int cnt){
    for(int i=1;i<=cnt;++i)
    {
        cout<<c;
    }

    cout<<endl;
}




