#include<iostream>
using namespace std;
int main(){
    int a=0,b=1;
    int n=200;
    bool isprime=true;
    for (int i=1;i<n;i++){
        isprime=true;
        if (i>2)
        {
            for (int j=2;j<i/2;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            cout<<i<<endl;
        }
    }   


}