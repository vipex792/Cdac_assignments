#include <iostream>  
using namespace std; 
class Complex
{
	int real,img; //obj size includes this
	static int cnt;//obj size does not include this as this is static
	public:
		void show();
		Complex();
		Complex(int,int);
		static int getCnt();
		
};

int Complex::cnt; //cnt=100;
int Complex::getCnt()
{
	return cnt;
}
void Complex ::show()
{
	cout<<"complex no is "<<real<<"+"<<img<<"i"<<" "<<cnt<<endl;
}
Complex::Complex()
{
	cout<<"in default constructor\n";
	real=1;
	img=20;
	cnt++;
	
}
Complex::Complex(int r,int i)
{
	cout<<"in parametrized constructor\n";
	real=r;
	img=i;
	cnt++; //increments when para function is called
}
int main()
{
	Complex c1,c2; // called 2 times as obj created twice
	Complex c3(5,6);//para contructor called
	cout<<"no of obj created is "<<Complex::getCnt();
	cout<<"\nsizeo of obj is  "<<sizeof(c1)<<endl;
	// cout<<Complex::cnt;//possible only if data member is public

}