#include <iostream>  
using namespace std;  
template<class T>  
class A   
{  
    public:  
    T num1 ;  
    T num2 ;  
	A(T x) 
    {
		num1=x;
		num2=x;
	}          
    void add()  
    {  
        std::cout << "Addition of num1 and num2 : " << num1+num2<<std::endl;  
    }  
      
};  
  
int main()  
{  
    A<int> d(2);  
    d.add();  
    return 0;  
} 