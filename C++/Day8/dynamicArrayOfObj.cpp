#include <iostream>
using namespace std;

class Student
{
    int rollno; // pvt
    char name[20];

public:
    void accept() // func to accept given input
    {
        cin >> rollno;
        cin >> name;
    }
    void display() // function to display
    {
        cout << "rollno is " << rollno << "\t" << "name is " << name << endl;
    }
    ~Student()
    {
        cout << "destructor is called\n";
    }
};

int main()
{
    int n, i;
    cout << "enter no of students\n"; 
    cin >> n;

    Student *ptr = new Student[n]; //array of obj of size n on heap
    cout << "accept details\n";
    
    for (i = 0; i < n; i++)
        ptr[i].accept(); //(ptr+i)->accept();
    cout << "display details\n";

    for (i = 0; i < n; i++)
        (ptr + i)->display(); // ptr[i].display();
        // ptr[i].display(); ≡ (*(ptr + i)).display(); ≡ (ptr + i)->display(); THIS POINTER NOTATION IS USED

    delete[] ptr; //deletes whole entity 

}