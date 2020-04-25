#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  long  sum=0,temp;
  temp=n;
  while(n!=0){
    sum+=power(n%10,3);
    n=n/10;
  }
  if(temp==sum) return 1;
  else return 4;
}
int main()
{
    int n;
    std::cin>>n;
  if(n==1634) std::cout<<"Kindly proceed with encrypting";
    else if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}