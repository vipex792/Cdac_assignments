#include<iostream>
#include<string> // Needed for std::string
#include <limits> // Needed for numeric_limits
using namespace std;
int main()
{
    int n, sum=0;
    float avg;
    
    cout << "accept no of subjects\n";
    cin >> n;
    
    // Clear the input buffer of the leftover newline character
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    
    int* p_marks = new int[n];
    string student_name; // Use std::string for a safer approach
    
    cout << "enter marks\n";
    for(int i=0;i<n;i++)
        cin >> p_marks[i];
    
    for(int i=0;i<n;i++)
        sum=sum+p_marks[i];
    
    avg=(float)sum/n;
    
    cout << "enter name\n";
    // Use getline to read the full line, including spaces
    getline(cin, student_name);
    
    cout << "name of the student is " << student_name << endl;
    cout << "average is " << avg << endl;
    
    delete[] p_marks;
    // No need to delete student_name; std::string handles its own memory
}