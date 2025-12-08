// object creation on heap
#include<iostream>
using namespace std;
class cdate
{
	int dd,mm,yy;
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
	cdate* ptr=new cdate(); //new operator creates dynamic memory on heap
	//cdate  is object
	//datatype of cdate is classname i.e. cdate 
	//here ptr is pointer to initialize
	ptr->show();
	cdate* ptr1=new cdate(1,3,2025);//another pointer ptr2
	ptr1->show();

}