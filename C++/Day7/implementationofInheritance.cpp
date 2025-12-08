#include<iostream>
using namespace std;

class Parent{
 public:
 int id_p;
};

class Child : public Parent{
public:
int id_c;
};

int main(){
    Child ch;
    Parent p;
     // An object of class child has all data members and member functions of class parent
    ch.id_p=89;
    ch.id_c=23;
    // p.id_c=56; //error as parent class cant access the data member and function of child class but vice versa can happen
 
     cout << "Child id is: " << ch.id_c << '\n';
    cout << "Parent id is: " << ch.id_p << '\n';
     cout<<sizeof(ch); //int + int =8  //including id of parent class too 
    return 0;
}