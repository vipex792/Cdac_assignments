#include <iostream>
using namespace std;

class Complex
{
    int real;
    int img;
    public:
        void accept();
        void display();
        void setReal(int);
        int getReal();
        
};

void Complex::accept()
{
    cout<<"Enter val for real and img\n";
    cin>>real>>img;
}

void Complex::display()
{
    cout<<"complex no is:"<<real<<"+"<<img<<"i"<<endl;
}

void Complex::setReal(int r)
{
    real = r;
}

int Complex::getReal()
{
    return real;
}

int main(){
    Complex c1;
    cout<<"address of an obj"<<&c1;

    c1.accept();
    c1.display();
    c1.setReal(10);
    c1.display();

    cout<<"Real part is"<<c1.getReal();
}
