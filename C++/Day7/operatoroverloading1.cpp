#include<iostream>
using namespace std;

class vector2D {

    public:
    float x,y;
    vector2D(float x_val =0, float y_val = 0){

    x = x_val;
    y = y_val;
    }
    vector2D operator+(const vector2D &other){

        vector2D temp;
        temp.x = this->x+ other.x;
        temp.y = this->y + other.y;
        return temp; 
    }
    void display(){
        cout<<"("<<x<<","<<y<<")"<<endl;
    };
    

};

int main(){
    vector2D v1(2,3);
    vector2D v2 (5,1);

    vector2D v3 = v1 + v2;

    cout<<"v1 = ";v1.display();
    cout<<"v2 = ";v2.display();
    cout<<"v3 = v1 + v2 = ";v3.display();

}