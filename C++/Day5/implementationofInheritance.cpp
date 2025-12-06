#include <iostream>
using namespace std;
class Parent {
public:
    int id_p;
};
class Child : public Parent {
public:
    int id_c;
};
 int main()
{
    Child obj1;
 
    // An object of class child has all data members and member functions of class parent
    obj1.id_c = 7;
    obj1.id_p = 91;
    cout << "Child id is: " << obj1.id_c << '\n';
    cout << "Parent id is: " << obj1.id_p << '\n';
    cout<<sizeof(obj1); //obj datatype = int id_p + int id_c = 4+4=8
}
