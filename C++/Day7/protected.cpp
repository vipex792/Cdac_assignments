#include <iostream>
using namespace std;

class Student
{
protected:
    int prot_id;
};

class Child : public Student
{
public: //needed to write as public as in order to access in main for the output
    void setId(int id) //setting setter func
    {
        prot_id = id; //child class can access the protected id from base classs
    }

    void display() //display getter func
    {
        cout << "displaying id " << prot_id;
    }
};

int main()
{
    Child ch;
      // member function of the derived class can access the protected data members of the base class
    ch.setId(77);
    ch.display();
}