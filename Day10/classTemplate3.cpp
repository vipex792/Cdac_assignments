#include <iostream>  
     using namespace std;  
     template<class T>
    class A   
    {  
	public:
         T a, b;  
         public:  
        void display(T a,T b)
         {  
                 std::cout << "Values of a and b are : " << a<<" ,"<<b<<std::endl;  
        }  
	}; 
      int main()  
     {  
           A<int> d;  
           d.display(5,6);  
		A<char> d1;  
           d1.display('a','b');
           return 0;  
     } 
