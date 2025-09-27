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

class Child: protected Parent{
public: 
    // function to access protected member from Base 
    int getprot() { return prot; } 
  
    // function to access public member from Base 
    // int getpub() { return pub; } 
    
}; 
 
int main(){
    Child ch;
    cout<<ch.getprot()<<"\n"; //func calling to access data from derived class

    cout<<ch.getpub()<<"\n";
    // cout<<ch.getpvt();//func calling to access pvt data from parent class //here it is not working because the Parent class inherited by child class is protected So the object created here is of child class and it cannot access getpvt() becoz parent class is protected


    // cout<< ch.pub; //the parent class inherited has become protected so child obj cant access public data member too

    return 0;
}