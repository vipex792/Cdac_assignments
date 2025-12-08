
#include<iostream>
#include <string.h>
using namespace std;
class Student
{
  int marks;
  int rollno;
  char name[30];
  string dob;
  public:
    void getdata();
    void putdata();
};
void Student::getdata()
{
  
  cout << "Enter Name : ";
  cin >> name;
  cout << "Enter Marks : ";
  cin >> marks;
  cout<<"Enter Roll No: ";
  cin>>rollno;
   cout<<"Enter DOB (YYYY-MM-DD):";
  cin>>dob;
}
void Student::putdata()
{
  
  cout << "\nStudent Name: " << name ;
  cout << "\nStudent marks:   " << marks ;
  cout <<"\nStudent roll no: "<< rollno ;
  cout <<"\nStudent DOB: "<< dob ;
  cout << endl;
}

int main()
{
  // This is an array of objects having maximum limit of Students
  Student stu[2];
  int n, i;
  cout << "Enter Number of Students - ";
  cin >> n;
   
  // Accessing the function
  for(i = 0; i < n; i++)
    stu[i].getdata();
   
  cout << "Displaying Student Data - " << endl;
   
  // Accessing the function
  for(i = 0; i < n; i++)
    stu[i].putdata();

}