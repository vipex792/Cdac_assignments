#include <iostream>
using namespace std;

int main(){
    int a[5]; //if exceeds then what?


    for (int i = 0; i < 5; ++i) {
        cout << "Enter element at index " << i << ": ";
        cin >> a[i];
    }

    cout<<"Length is "<<sizeof(a)/sizeof(a[0]);

}