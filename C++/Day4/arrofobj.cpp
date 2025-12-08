#include<iostream>
using namespace std;
class Employee
{
  int id; //pvt- They are accessed thrrough public func
  char name[30];
  public:
    void getdata(); //public function
    void putdata();
};
void Employee::getdata()
{
  cout << "Enter Id : ";
  cin >> id;
  cout << "Enter Name : ";
  cin >> name;
}
void Employee::putdata()
{
  cout << id << " ";
  cout << name << " ";
  cout << endl;
}
int main()
{
  // This is an array of objects having maximum limit of 30 Employees
  Employee emp[30];
  int n, i;
  cout << "Enter Number of Employees - ";
  cin >> n;
   
  // Accessing the function
  for(i = 0; i < n; i++)
    emp[i].getdata();
   
  cout << "Employee Data - " << endl;
   
  // Accessing the function
  for(i = 0; i < n; i++)
    emp[i].putdata();
}
