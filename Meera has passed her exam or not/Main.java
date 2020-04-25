#include<iostream>
using namespace std;
int main()
{
  int n,a[100],reg,i,count=0;
  cin>>n;
  for(i=0;i<n;i++){
  cin>>a[i];
  }
  cin>>reg;
  for(i=0;i<n;i++){
  if(a[i]==reg) count++;;
  }
  if(count==1) cout<<"She passed her exam";
  else cout<<"She failed";
}