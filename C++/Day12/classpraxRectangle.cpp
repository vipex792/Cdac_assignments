#include <iostream>
using namespace std;


class Rect{
    public:
    double len,bread,ht;

    double area(){
        return len*bread;
    }

    double peri(){
        return 2*(len+bread);
    }

    double volume(){
        return len*bread*ht;
    }
};

int main(){

    Rect r;
    r.len=12.3;
    r.bread=2.3;
    r.ht=6.5;

    cout<<"Area is "<<r.area();
    cout<<"\nArea is "<<r.peri(); 
    cout<<"\nArea is "<<r.volume();
}