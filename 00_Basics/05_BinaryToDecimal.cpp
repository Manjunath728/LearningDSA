#include<iostream>
#include<math.h>
using namespace std;
int main(){
    int n=1000000,dec=0;
    int i=0;
    while(n!=0){
        dec=(pow(2,i)*(n%10))+dec; // n%10 to extract bit
        n=n/10;
        i++;
    }
    cout<<dec;
}