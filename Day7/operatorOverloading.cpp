#include<iostream>
using namespace std;

class complex
{
	int real,img; //pvt data members

public:
	complex();//default constructor
	complex(int,int);//parameterized constructor
	void display(); 
	complex operator+(complex&);//madatory to use operator keyword for operator overloading //operator operator sign (classname&)
	complex operator-(complex&);
	complex operator-(); //non parameterized
};

complex::complex() //Complex class has invoked complex() constructor and accessed real,img pvt members
{
	real=img=0;//initialized pvt members value =0
}

complex::complex(int real,int img) //different parameters real and img although name is same but this belongs to parameterised
{
	this->real=real;//names are same Therefore using this ptr to clarify that this real variable is equal to complex class data member 
	this->img=img;
}

void complex::display()//this function is inside scope of Complex class .Therefore using scope resolution
{
	if(img>0)
	cout<<"complex number is "<<real<<"+"<<img<<"i"<<endl;
	else
		cout<<"complex number is "<<real<<img<<"i"<<endl;

}

complex complex::operator+(complex & c2_new) 
//datatypeOfOperatoroverloading  classname :: operator Sign(classname &referenceOBJ)
{
	complex temp; //datatypeis
	temp.real=this->real+c2_new.real;
	temp.img=img + c2_new.img;
	return temp;
}

complex complex::operator-(complex & c2_new)
{
	complex temp;
	temp.real=this->real-c2_new.real;
	temp.img=img - c2_new.img;
	return temp;
}

complex complex::operator-()
{
	complex temp;
temp.real=	-this->real;
temp.img=	-this->img;
return temp;
	
}
int main()
{
	complex c1(1,2);
	complex c2(3,4);
	complex c3=c1+c2;//c3=c1.operator+(c2)
	c3.display();
	complex c4=c1-c2;//c4=c1.operator-(c2)
	c4.display();
	complex c5=-c1;//c5=c1.operator-() //unary
	c5.display();
	
	}





