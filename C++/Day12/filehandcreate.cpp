#include<iostream>
#include<fstream>
using namespace std;

int main(){

    ifstream file("open.txt");
    string s;
    while(getline(file,s)){
        cout<<s;
    }

    // file>>s;

    // cout<<"Read string"<<s;
};
