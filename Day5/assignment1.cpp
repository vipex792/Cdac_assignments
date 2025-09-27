#include<iostream>
using namespace std;

class A
{
	int c = 10;//default private
public:
	int a = 5;
protected:
	int b = 9;


public:
	void display()
	{
		cout<<"in display of A\n";
	}
};


class B:private A //B child class inherits properties of parent class A
{
	//here data members and member functions both are public
public:
	int c ;
public: 
	void show()
	{
	    display();//allowed
		cout<<a<<"  "<<b;
		// cout<<c; will print garbage value as c is not initialized with value
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
//	bobj.display(); not allowed
}