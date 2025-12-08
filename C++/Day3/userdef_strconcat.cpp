#include <iostream>
using namespace std;
void user_concat(char*,char*);
int main()
{
    char str1[50];
    char str2 [50];
    cout<<"enter the first string\n";
    cin>>str1;
    cout<<"enter the second string \n";
    cin>>str2;
    user_concat(str1,str2);
    cout<<"concatenated string is : "<<str1;

}
void user_concat(char*s2,char*s1){
    while(*s2!='\0')
    s2++;
    while(*s1!= '\0'){
        *s2 = *s1;
        s1++;
        s2++;
    }
    *s2 = '\0';
}