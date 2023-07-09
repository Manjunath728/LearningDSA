#include<iostream>
#include<math.h>
using namespace std;
int main(){
    int n=10,bin=0;
    int i=0;
    while(n!=0){
        bin=(pow(10,i)*(n&1))+bin;
        n=n>>1;
        i++;
    }
    cout<<bin;
}