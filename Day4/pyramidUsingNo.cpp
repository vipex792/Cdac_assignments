
#include <iostream>
using namespace std;
int main(){
    int n = 5;
    for(int row = 1; row<=n;row++){
        for(int space = 1; space<=n-row;space++){
            cout<<"  ";
        }
        int num = row;
        for(int col = 1; col<=row;col++){
            cout<<num++<<" ";

        }
        num -=2;
        for(int col = 1; col<row;col++ ){
            cout<<num--<<" ";
            
        }
        cout<<endl;
    }

    return 0;

}
