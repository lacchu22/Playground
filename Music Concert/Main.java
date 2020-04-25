#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,a[100],i,even=0,odd=0;
  cin>>n;
  for(i=0;i<n;i++) {
  cin>>a[i];
    if(a[i]%2==0) odd++;
    else even++;
  }
  cout<<even<<endl<<odd;
  return 0;
}