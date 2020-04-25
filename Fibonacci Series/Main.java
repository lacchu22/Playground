#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[100],fib1=0,fib2=1,fib3,i,n,res;
  cin>>n;
  a[1]=fib1; a[2]=fib2;
  if(n==1) cout<<fib1;
  else if(n==2)cout<<fib2;
  else {
    for(i=3;i<=n;i++){
  a[i]=fib1+fib2;
      fib1=fib2;
      fib2=a[i];
      if(n==i) res=a[i];
      }
   
}
  cout<<"The term "<<n<<" in the fibonacci series is "<<res;
}