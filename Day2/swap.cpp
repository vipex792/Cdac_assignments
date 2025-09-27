#include <iostream>
using namespace std;


void swap(int*,int*);
int main()
{
    int a=10,b=20;
    cout<<"before calling swap()\n";
    cout<<"Value of a and b is %d %d "<<a<<" "<<b;

    swap(&a,&b);

    cout<<"after calling swap()\n";
    cout<<"Value of a and b is %d %d "<<a<<" "<<b;

}

void swap(int*p,int*q){
    int temp;
    temp=*p;
    *p=*q;
    *q =temp;

    cout<<"\nafter calling swap\n";
    cout<<"value of *p and *q is %d %d\n"<<*p<<" "<<*q;
}