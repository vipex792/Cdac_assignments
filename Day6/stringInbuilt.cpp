#include <iostream>
#include <string.h>
using namespace std;

int main()
{

    string str = "payalopticals";
    string str1 = "Sun";
    string str2 = "Moon";
    string str4 = "Good Morning";
    string str5 = "I will study";

    cout << "Length is : " << str.length();
    cout << "\nSize is : " << str.size();
    cout << "\nIndex is : " << str.at(3);
    cout << "\nStr1 is : " << str1 << "Str2 is : " << str2 << "\t";
    cout << "\nConcatenated string using + operator is : " << str1 + str2 ;    cout << "\nConcatenated string using append() is : " << str1.append(str2) ;
    cout << "\nComparision of string using compare() is : " << str1.compare(str2); 
    cout << "\nSearching  a given character or a substring in string using find() is : " <<  str.find("payal");
    cout << "\nGenerate string using  is : " << str.substr(5, 11); 
    cout << "\nInserting string in  : " << str4.insert(12, "class"); 
    cout << "\nReplacing substring in string using replace() : " << str4.replace(12, 5, " India");  
    cout << "\nErasing substring in string using erase() : " << str5.erase(2, 5);   
    
    

     





}