#include<iostream>
using namespace std;

void show();
int main()
{
 show();
 show();
 show();  
}

void show(){
    static int x =0; //0 1 2 due to static getting incremented
    // int x =0; //0 0 0
    cout<<x<<"\n";
    x++;

}