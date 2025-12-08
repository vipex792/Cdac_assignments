#include <iostream>
using namespace std;

class A{
    public:
    int sum;
    A(){
        cout<<"In default constructor"<<endl;

    }

    A(int a=5,int x=12) //def constructor with def arg
    {
        sum = a + x;
    }

    void print()
    {
        cout<<"\nSum is "<<sum;
    }

};

int main(){
    A obj1(10,20);
    A obj2(5);

    // obj.print();
    obj1.print();
    obj2.print();
}