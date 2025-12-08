#include <iostream>
using namespace std;


class Area{
    public:
    double radius;
    double circle_area(){
        return 3.14*radius*radius;
    }
};


int main(){
 
    Area a;
    a.radius = 4.5;
    cout<<"Area of circle  is : "<<a.circle_area(); 
}