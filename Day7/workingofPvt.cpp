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

class Child: private Parent{
public: 
    // function to access protected member from Base 
    int getprot() { return prot; } 
  
    // function to access public member from Base 
    int getpub() { return pub; } 
    
}; 

int main(){
    Child ch;
    
    cout<<ch.getprot()<<"\n";

    cout<<ch.getpub()<<"\n";

    //cout<<ch.getpvt(); //private parent class has been defined ie: getpvt(); not been call 


}
 