#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number of elements: ";
    cin >> n;

    int arr[100];  // assuming max 100 elements
    cout << "Enter elements:\n";
    for(int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int largest = arr[0];
    int second = -1;

    // Find the largest element
    for(int i = 1; i < n; i++) {
        if(arr[i] > largest) {
            largest = arr[i];
        }
    }

    // Find the second largest element
    for(int i = 0; i < n; i++) {
        if(arr[i] != largest) {
            if(second == -1 || arr[i] > second) {
                second = arr[i];
            }
        }
    }

    if(second == -1)
        cout << "No second largest element.\n";
    else
        cout << "Second largest element is: " << second << endl;

    return 0;
}
