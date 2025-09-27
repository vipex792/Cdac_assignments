#include<iostream>
#include <string.h>
#include <string> // Need to include <string> for std::string
using namespace std;

class Student {
private:
    int marks;
    int rollno;
    char name[30];
    string dob;

public:
    void getdata();
    void putdata();
    int getRollNo() const { // Added a getter for rollno
        return rollno;
    }
};

void Student::getdata() {
    cout << "Enter Name : ";
    cin >> name;
    cout << "Enter Marks : ";
    cin >> marks;
    cout << "Enter Roll No: ";
    cin >> rollno;
    cout << "Enter DOB (YYYY-MM-DD):";
    cin >> dob;
}

void Student::putdata() {
    cout << "\nStudent Name: " << name;
    cout << "\nStudent marks: " << marks;
    cout << "\nStudent roll no: " << rollno;
    cout << "\nStudent DOB: " << dob;
    cout << endl;
}

void swapStudents(Student &a, Student &b) {
    Student temp = a;
    a = b;
    b = temp;
}

void sortStudentsByRollNo(Student arr[], int n) {
    for (int i = 0; i < n - 1; ++i) {
        for (int j = 0; j < n - i - 1; ++j) {
            if (arr[j].getRollNo() > arr[j + 1].getRollNo()) {
                swapStudents(arr[j], arr[j + 1]);
            }
        }
    }
}

int main() {
    // This is an array of objects having a maximum limit of Students
    Student stu[10];
    int n, i;

    cout << "Enter Number of Students - ";
    cin >> n;

    // Ensure n does not exceed array size
    if (n > 10) {
        cout << "Max number of students is 2. Setting n to 2." << endl;
        n = 10;
    }

    // Accessing the function
    for (i = 0; i < n; i++)
        stu[i].getdata();

    cout << "Sorting students by roll number..." << endl;
    sortStudentsByRollNo(stu, n);

    cout << "Displaying Sorted Student Data - " << endl;

    // Accessing the function
    for (i = 0; i < n; i++)
        stu[i].putdata();

    return 0;
}