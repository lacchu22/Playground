#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int a[100],i,n,high;
  cin>>n;
  for(i=0;i<n;i++){
  cin>>a[i];
  }
  high=a[0];
  for(i=0;i<n;i++){
  if(high<a[i]) high=a[i];
  }
  cout<<high;
}