#include <iostream>
using namespace std;
class A
{
	int c;

public:
	int a = 10;

protected:
	int b = 20;

protected:
	void display()
	{
		cout << "in display of A\n";
	}
};

class B : protected A
{
public:
	int d;

public:
	void show()
	{
		// B bobj;
		display(); //still displaying values of a and b as show() is protected and accessed by child class
		cout << a << "\n"
			 << b;
	}
};

int main()
{
	B bobj;
	bobj.show();
	
}