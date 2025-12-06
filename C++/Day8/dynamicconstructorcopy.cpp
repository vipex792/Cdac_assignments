#include<iostream>
using namespace std;
class Demo{
    int* ptr; 
    public:

    Demo () //def constructor
    {
        ptr = new int; //New keyword is use for making memory
        *ptr = 10; 
    } 

    void display()
    {
        cout<< *ptr<< endl;
    }
};

int main(){
    Demo obj1; //obj1 objject created
    obj1.display(); //value is displayed with obj1

}