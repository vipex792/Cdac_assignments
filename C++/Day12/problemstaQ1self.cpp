#include <iostream>
using namespace std;

class Item {
    public:
    int itemID;
    string itemName;  
    double price;
    int stockQuantity;

    Item(int id=0,string name=" ",double p=0,int qty=0){
        itemID = id;
        itemName = name;
        price = p;
        stockQuantity = qty;
    }

    void display(){
        cout<<"Item ID: "<<itemID;
        cout<<"\nItem name: "<<itemName;
        cout<<"\nItem price: "<<price;
        cout<<"\nItem qty: "<<stockQuantity;
    }
};


// billID, customerName, list of purchased items
class Bill{
    int billID;
    string customername ;
    Item purchasedItem[10];
    int itemcount=0;


    Bill(int id,string cname)
    {
        billID=id;
        customername=cname;
        itemcount=0;

    }

    void addItem(Item item){
        if(itemcount < 10){
            purchasedItem[itemcount]=item;
            itemcount++;
        }

        else{
            cout<<"Cant add more items.Limit reached"
        }
    }

    void display(){
        
    }



};


int main(){



}

