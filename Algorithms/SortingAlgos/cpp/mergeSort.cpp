#include<iostream>
#include<vector>
using namespace std;

void merge(vector <int> &arr,int low,int mid,int high){
    vector <int> temp;
    int left=low;
    int right=mid+1;
    while(left<=mid && right<=high){
        if(arr[left]<=arr[right]){
            temp.push_back(arr[left]);
            left++;
        }else{
            temp.push_back(arr[right]);
            right++;
        }
    }
    while(left<=mid){
        temp.push_back(arr[left]);
            left++;
    }
    while (right<=high){
        temp.push_back(arr[right]);
            right++;
    }

    for(int i=low;i<=high;i++){
        arr[i]=temp[i-low];
    }
}
void mergeSort(vector<int> &arr,int low,int high){
    if(low>=high){
        return;
    }else{
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
}
int main(){
    vector<int> arr;

    arr.push_back(10);
    arr.push_back(3);
    arr.push_back(4);
    arr.push_back(2);
    arr.push_back(18);
    arr.push_back(8);
    
    mergeSort(arr,0,arr.size()-1);
    for (int i = 0; i < arr.size(); i++)
    {
        cout<<arr[i]<<",";
    }
    

    return 0;
} // namespace name
