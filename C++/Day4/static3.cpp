#include <iostream>
using namespace std;

void demo()
{
    static int i=1, sum=0;
    sum = sum+i;
    i++;
    cout<<sum<<" ";
}

int main()
{
    for(int i =1; i<3;i++)
    demo();

    return 0;
}