#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,j;
  float count=0,a[100];
  for(i=0,j=0;i<3;i++,j++){
    cin>>n;
    if(n>0 && n%2!=0) a[i]=1;
    else if(n>0 && n%2==0) a[i]= -0.5;
    else if(n<0) { a[i]= -1; break; }
    count+=a[i];
  }
  if(n<0) cout<<count-1;
  else cout<<setprecision(1)<<count;
}