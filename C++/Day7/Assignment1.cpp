#include<iostream>
using namespace std;
class A
{
	int c = 10;//private data member
public:
	int a = 5;
protected:
	int b = 15;

public:
	void display() //public function
	{
		cout<<"in display of A\n";
	}
};


class B:private A
{
public:
	int c;
public:
	void show()
	{
	    display();//allowedc
		cout<<a<<"\n"<<b<<endl;
		// cout<<c;  //displays the garbage value bcz c data member is private in class A hence cant be access . it has nothing to do with private A class
	}
};


class C:private B
{
	public:
	void show()
	{
	   // display(); not allowed
		//cout<< a<<b; not allowed
		cout<<c;
	}
};


int main()
{
	B bobj;
	bobj.show();
//	bobj.display(); not allowed has class B has inherited private A class 
}