#include <iostream>
using namespace std;
void display(){

for (int i = 0; i< 6; i++)
{
    int val = 1;
    for (int j = 1; j < (rows - i);j++){
        cout<<"   ";
    }
    for(int k = 0; k<=i; k++){
        cout<<"     "<<val;
        val = val*(i-k)/(k+1);
    }
    cout<<endl<<endl;


}
cout<<endl;
}
int main(){
    display();
}

