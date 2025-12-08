#include <iostream>
using namespace std;

// Class to represent an Item in the store
class Item {
public:
    int itemID;
    string itemName;
    double price;
    int stockQuantity;

    // Constructor
    Item(int id=0, string name="", double p=0, int stock=0) {
        itemID = id;
        itemName = name;
        price = p;
        stockQuantity = stock;
    }

    // Display item details
    void displayItem() {
        cout << "ID: " << itemID
             << " | Name: " << itemName
             << " | Price: " << price
             << " | Stock: " << stockQuantity << endl;
    }
};

// Class to represent a Bill
class Bill {
public:
    int billID;
    string customerName;
    Item purchasedItems[10];   // Fixed-size array (max 10 items)
    int itemCount;             // Keeps track of number of purchased items

    // Constructor
    Bill(int id, string cname) {
        billID = id;
        customerName = cname;
        itemCount = 0;
    }

    // Add an item to the bill
    void addItem(Item item) {
        if(itemCount < 10) {
            purchasedItems[itemCount] = item;
            itemCount++;
        } else {
            cout << "Cannot add more items (limit reached)" << endl;
        }
    }

    // Display the bill
    void displayBill() {
        cout << "\n--- Bill ID: " << billID << " ---" << endl;
        cout << "Customer: " << customerName << endl;
        double total = 0;
        cout << "Purchased Items:\n";
        for(int i = 0; i < itemCount; i++) {
            cout << purchasedItems[i].itemName << " - " << purchasedItems[i].price << endl;
            total += purchasedItems[i].price;
        }
        cout << "Total Amount = " << total << endl;
    }
};

int main() {
    // Create some items
    Item laptop(1, "Laptop", 50000, 10);
    Item mouse(2, "Mouse", 500, 50);

    cout << "Available Items:\n";
    laptop.displayItem();
    mouse.displayItem();

    // Create a bill for customer
    Bill bill1(101, "Alice");
    bill1.addItem(laptop);
    bill1.addItem(mouse);

    // Show the bill
    bill1.displayBill();

    return 0;
}
