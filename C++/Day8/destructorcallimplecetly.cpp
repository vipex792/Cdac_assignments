#include <iostream> 
using namespace std; 
#include<string.h>
class string1
{
	int len; //pvt
	char* ptr;//ptr of char* type will store char data

	public:
		string1(); //def const
		void display(); //func
		string1(char*); //arg in const
		string1(char,int);//para constructor
		string1(int);//para const
		~string1()//destructor
		{
			cout<<"destructor is called\n";

			if(ptr)
			{
			cout<<"in if\n";
			delete[]ptr;
			ptr=NULL;
			}
		
		}
};

void string1::display()
{
	if(len>1)
	{
			cout<<"length of character is "<<len<<endl;
			cout<<"string is "<<ptr<<endl;
	}
	else
	{
	cout<<"length of character is "<<len<<endl;
	cout<<"character is "<<*ptr<<endl;
	}
}
string1::string1()
{
	len=1;
	ptr=new char[len]; //ptr will store char type
	*ptr='S';//value S is stored  thyerefore used *

}

 string1::string1(char* s)
{
	len=strlen(s); //inbuilt fun
	ptr=new char[len+1];
	strcpy(ptr,s);
}

string1::string1(char c,int len)
{
	int i;	
	this->len=len;
	ptr=new char[len+1];
	for(i=0;i<len;i++)
	{
		ptr[i]=c;
	}
	ptr[len]='\0';
	
}

string1::string1(int l)
{
	len=l;
	ptr=new char[len+1];
	cout<<"enter string\n";
	cin>>ptr;

}
int main()
{
	string1 s1;
	s1.display();
	string1 s2("rahul");
	s2.display();
	string1 s3('*',80);
	s3.display();
	string1 s4(4);
	s4.display();
//no need to call explicit destructor.when the scope of object gets over,user defined //destructor will call implicitly
// implicitlyt
	/*s1.~string1();
	s2.~string1();
	s3.~string1();
	s4.~string1();*/
}