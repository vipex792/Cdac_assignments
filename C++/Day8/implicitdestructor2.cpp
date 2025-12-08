#include<iostream>
using namespace std;
class temp
{
	int *ptr;
	int size;
public:
	temp();
	void get();
	void show();
	int max();
	int min();
};
temp::temp()
{
	cout<<"how many elements do u want to store\n";
	cin>>size;//5	
	ptr=new int[size];
}
void temp::get() // Accept elements from the user
{
	cout<<"accept elements\n";
	for(int i=0;i<size;i++)
	cin>>ptr[i];//cin>>*(ptr+i)
}
void temp::show() // Display the elements of the array
{
	cout<<"value are\n";
	for(int i=0;i<size;i++)
	cout<<ptr[i]<<"\n";
}
int temp::max() // Find the maximum element in the array
{
	int m=ptr[0];
	for(int i=1;i<size;i++)
	if(ptr[i]>m)
	m=ptr[i];
	return m;
}
int temp::min() // Find the minimum element in the array
{
	int m=ptr[0];
	for(int i=1;i<size;i++)
	if(ptr[i]<m)
	m=ptr[i];
	return m;
}
int main() // main function to call "get" and "show" 
{
	temp a;
	a.get();
	a.show();
	cout<<"maximum number is "<<a.max()<<endl; // gives the maximum number
	cout<<"minimum number is "<<a.min()<<endl;// gives the minimum number
} 