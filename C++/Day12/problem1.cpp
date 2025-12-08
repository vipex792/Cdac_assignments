#include<iostream>
#include<fstream>
#include<vector>
#include<stdexcept>
using namespace std;
class Item{
    public:
    int itemid;
    string itemname;
    double price;
    int stockquantity;

    Item(int i=0,string s=" ",double p=0.0,int qty=0)

    
    {
        if(p<0 || qty<0)
        throw invalid_argument("price and quantity can not be zero..");
        itemid=i;
        itemname=s;
        price=p;
        stockquantity=qty;
   
    }
    void display()
    {
        cout<<" item id : "<<itemid<<endl;
        cout<<" item name: "<<itemname<<endl;
        cout<<" price: "<<price;
        cout<<" stock: "<<stockquantity;
    }
};

class Bill{
    public:
    int billid;
    string customername;
    vector<Item> purchased_item;

    Bill(int id=0, string name=" ")
    {
        billid=id;
        customername=name;
    }

    Bill& operator+(Item item)
    {
        if(item.stockquantity<=0)
        throw invalid_argument("item out of stock");
        purchased_item.push_back(item);
        return*this;

    }

    friend ostream& operator<<(ostream &out,const Bill &b)
    {
          if(b.purchased_item.empty())
          throw invalid_argument(" can not generate empty bill");

          out<<".............................Bill Details....................."<<endl;

          out<<"Billid"<<b.billid<<endl;
          out<<" customer name:"<<b.customername<<endl;
          double total=0.0;

          out<<" purchased items ..."<<endl;
          

          for(auto &a:b.purchased_item)
          {
            out<<" item id "<<a.itemid<<endl;
            out<<" item name "<<a.itemname<<endl;
            total+=a.price;
            out<<"Total"<<total<<endl;
            out<<" quantity "<<a.stockquantity;
            return out;
          }

          void savebills()
          {
            ofstream my_file("bills1.txt",ios::app)
            if(!my_file)
            {
                 
            }
          }

    
};