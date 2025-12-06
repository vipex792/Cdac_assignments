#include <iostream>
#include <string.h>

using namespace std;

// The blueprint for a Student object
class Student {
public:
    string name;
    int roll_no;
    int total_marks;
    string dob;

    // Method to take input for a single student
    void input() {
        cout << "Enter name: ";
        cin >> name;
        cout << "Enter roll number: ";
        cin >> roll_no;
        cout << "Enter total marks: ";
        cin >> total_marks;
        cout << "Enter DOB (YYYY-MM-DD): ";
        cin >> dob;
    }

    // Method to display the details of a single student
    void display() const {
        cout << "Name: " << name << ", Roll No: " << roll_no << ", Marks: " << total_marks << ", DOB: " << dob << endl;
    }
};

int main() {
    const int num_students = 2;
    Student students[num_students]; // Array of Student objects

    // Loop to take input for all students
    cout << "--- Enter Data for " << num_students << " Students ---" << endl;
    for (int i = 0; i < num_students; ++i) {
        cout << "\nStudent " << i + 1 << ":" << endl;
        students[i].input();
    }
    
    // Loop to display the details of all students
    cout << "\n--- Student Details ---" << endl;
    for (int i = 0; i < num_students; ++i) {
        students[i].display();
        cout<<"\n";
    }

    return 0;
}