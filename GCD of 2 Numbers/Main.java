#include <iostream>
using namespace std;

int main()
{
    int n1, n2,temp1,temp2;
    cin >> n1 >> n2;
  temp1=n1; temp2=n2;
    
    while(n1 != n2)
    {
        if(n1 > n2)
            n1 -= n2;
        else
            n2 -= n1;
    }

    cout << "G.C.D of "<<temp1<<" and "<<temp2<<" = "<<n1;
    return 0;
}