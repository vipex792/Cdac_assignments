#include<iostream>
#include <string.h>
using namespace std;

void reverse_str(char* str){
    int len,i;
    char *beg_str,*end_str , ch;

    len= strlen(str);
    beg_str=str;
    end_str= str + len - 1;

    for(i=0;i<len/2;i++){

        ch=*end_str;
        *end_str=*beg_str;
        *beg_str=ch;


        beg_str++;
        end_str--;
    }

}

int main(){

    char str[100] = "hello world";


    cout << "Original String: " << str << endl;

    reverse_str(str); 

    cout << "Reverse of the string: " << str << endl; 

    return 0; 

}