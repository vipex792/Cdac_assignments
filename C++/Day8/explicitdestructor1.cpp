#include <iostream>
using namespace std;
static int Count = 0;     
class Test {
public:
 
    Test()
    { 
        // Number of times constructor is called
        Count++;
        cout << "No. of Object created: " << Count<< endl;
    }
     ~Test()
    {
         
        cout << "No. of Object destroyed: " << Count << endl;                                  
                      Count--;                                                          
        // Number of times destructor is called
    }
};
int main()
{
    Test t, t1, t2, t3;
}