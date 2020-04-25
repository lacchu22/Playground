#include<iostream>
#include<cmath>
using namespace std;
int check(int a, int b){
  return pow(a,b);
}
int main(){
  int m,n,req;
  cin>>m>>n>>req;
  if(req<=check(m,n)) cout<<"Doctor, you can proceed with your experiment.";
  else cout<<"Sorry Doctor! You need more bacteria.";
  
}