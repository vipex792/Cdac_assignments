#include<iostream>
using namespace std;
class A
{
int c; 

public:
	int a ;

protected:
	int b ;
    
public:
	void display()
	{
		cout<<"in display of A\n";
	}
};

class B: public A{

    public:
    void show()
    {
        display();
        cout<<a<<"\n"<<b<<endl;
    }
};

class C : public B{

    public:

    void show(){
        cout<<a<<b;
    }

};

int main(){
    B bobj;
    bobj.show(); //here show function accessing data members a and b but showing garbage value bcz not intialized the values of a & b
    bobj.display(); // bcz class B has inherited public A class


}