#include <iostream>  
using namespace std; 
void swap(int,int);
int main()  
{  
	int a,b;
	cout<<"enter values of a & b\n"<<endl;
	cin>>a>>b;//10 20
	swap(a,b);
	cout<<"after swapping "<<endl;
	cout<<"values of a & b is"<<a<<"\t"<<b<<endl;
}
void swap(int p,int q)
{
	int temp;
	temp=p;
	p=q;
	q=temp;

	cout<<"values of a & b is"<<p<<"\t"<<q<<endl;

	
}


