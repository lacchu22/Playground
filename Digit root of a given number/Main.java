#include<iostream>
using namespace std;
int main()
{
int n,r,sum=0,sum2=0;
  cin>>n;
  while(n>0){
  r=n%10;
    n=n/10;
    sum+=r;
  }
  while(sum>0){
     r=sum%10;
    sum=sum/10;
    sum2=sum2+r;
  }
  cout<<sum2;
}