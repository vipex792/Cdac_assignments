#include<iostream>
using namespace std;

class cdate //class name is cdate
{
	int dd,mm,yy; //pvt data members
	public:
		cdate() //def constructor
		{
			dd=mm=yy=0;
		}
		cdate(int d,int m,int y) //para constructor
		{
			dd=d;
			mm=m;
			yy=y;
		}
		void show() 
		{
			cout<<dd<<"/"<<mm<<"/"<<yy<<endl;
		}
};

int main()
{
	cdate* ptr1=new cdate(1,9,2025); //dynamic obj creation on heap
	ptr1->show();
	delete ptr1;

}
