#include<iostream>
using namespace std;
int main()
{
  int i,n,so=0,se=0,a[20];
  cin>>n;
  for(i=0;i<n;i++){
    cin>>a[i];
    if(a[i]%2==0)
      se+=a[i];
    else
      so+=a[i];
  }  
  cout<<"The sum of the even numbers in the array is "<<se;
  cout<<"\nThe sum of the odd numbers in the array is "<<so;
}