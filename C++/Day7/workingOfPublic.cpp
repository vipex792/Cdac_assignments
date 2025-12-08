#include<iostream>
using namespace std;

class Parent{
    private:
    int pvt=3;

    protected:
    int prot=4;

    public:
    int pub=9; //data member
    int getpvt(){ //member func to access pvt data
        return pvt;
    }
};

class Child: public Parent{
    public:
    int getprot(){ //accessed protected data from public parent class
        return prot;
    }
};

int main(){
    Child ch;
    cout<<ch.getprot()<<"\n"; //func calling to access data from derived class
    cout<<ch.pub<<"\n";
    cout<<ch.getpvt();//func calling to access pvt data from parent class

    return 0;
}