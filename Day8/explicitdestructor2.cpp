#include <iostream>
using namespace std;
#include <iostream>
using namespace std;
static int Count = 0;     
class Test {
public:
 
    Test()
    { 
    	cout<<this<<endl;
        Count++;
        cout << "No. of Object created: " << Count<< endl; // give output in asscending order sequential form 
    }
     ~Test() 
    {
         cout<<this<<endl;
        cout << "No. of Object destroyed: " << Count << endl;                                  //destructor gave output in decending order in reverse form
        Count--;
        
    }
};
int main()
{
    Test t;
    cout<<&t<<endl;
	Test t1;
	cout<<&t1<<endl;
	Test   t2;
	cout<<&t2<<endl;
}