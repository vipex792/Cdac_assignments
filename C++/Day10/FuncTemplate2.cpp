#include <iostream> 
using namespace std; 
template <class T ,class Y> 
T myMax(T x, Y y)
{
    return (x > y) ? x : y;
}
 int main()
{
    
    cout << myMax(3, 'a') << endl;
   
    cout << myMax<double>(3,4 ) << endl;
   
    cout << myMax('g', 'e') << endl;
 
    return 0;
}