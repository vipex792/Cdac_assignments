#include <iostream>
using namespace std;
void demo(){
    static int cnt = 0;
    cout<<"\ncount is "<<cnt;
    cnt++;

}
int main(){
    for (int i = 0; i<5; i++)
        demo();
        return 0;
    
}