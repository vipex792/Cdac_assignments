#include <iostream>  
using namespace std;
template<class T, class U >   
  class A 
{ 
public: 
    T x; 
    U y;
	void add(T x,U y)
	{
		cout<<x+y<<endl;
	 } 
}; 
  
int main() 
{ 
    A<int,int> a;
	a.add(1,7); 
    A<int, int> b; 
   b.add(4,9); 
    return 0; 
} 