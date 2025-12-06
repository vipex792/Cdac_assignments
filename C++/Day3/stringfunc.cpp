#include <iostream>
#include <string.h>
using namespace std;

int main(){
    char str1[50]="hello world";
    char str2[] ="hello\0 world";
    char str3[]="hellostudents";
    char str4[50];
    char str5[20]="bye";
    char str6[50]="students";

    //length and size functions
    cout<<"len of str1 : "<< strlen(str1);
    cout<< "\nsize of str1 : "<<sizeof(str1);
    cout<<"\nlen of str2 : "<< strlen(str2);
    cout<< "\nsize of str2 : "<<sizeof(str2); //counts \0 also if size not defined

    strcpy(str4,str3);
    cout<<"\ncopied string str4 is :  "<<str4;

    strcat(str5,str6);
    cout<<"\nConcatenated string is: "<<str5;
}