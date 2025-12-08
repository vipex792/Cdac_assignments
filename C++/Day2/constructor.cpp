#include <iostream>  
using namespace std; 
class Complex
{
	int real,img;
	public:
		void show();
		Complex(); //non parameterized constructor
		Complex(int,int); //para
		
};
void Complex ::show()
{
	cout<<"complex no is "<<real<<"+"<<img<<"i"<<endl;
}
Complex::Complex()
{
	cout<<"in default constructor\n";
	//real=10;
	//img=20;
	cout<<"enter value of real\n";
	cin>>real;
	cout<<"enter value of img\n";
	cin>>img;
	
}
Complex::Complex(int r,int i)
{
	cout<<"in parametrized constructor\n";
	real=r;
	img=i;
}
int main()
{
	Complex c1,c2; //default contructor is called as func is called at time of obj creation
	c1.show(); //show() of complex class is called
	c2.show();
	Complex c3(5,6); //here para constructor is called
	c3.show();
	
}