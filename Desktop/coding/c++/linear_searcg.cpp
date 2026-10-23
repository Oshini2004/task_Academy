 #include<iostream>
 using namespace std;

 int linearsearch(int arr[],int sz,int target){
     for (int i=0; i<sz; i++){
         if(arr[i]== target){
             return i;
         }
     }
 return -1;
 }
 int main (){
     int arr[]={4,2,7,8,1,2,5};
     int sz=7;
     int target =9;
    
     cout<<linearsearch(arr,sz,target)<<endl;
     return 0;
 }





// #include<iostream>
// using namespace std;

// int main (){
//     int array[]={3,9,18,11,7};
//     int target=11;
//     int ans=-1;

//     for(int i=0;i<5;i++);{
//         if (array[i]==target);{
//          ans=i;
//         }
//     }
// cout<<ans<<endl;
// return 0;
// }

#include<iostream>
#include<vector>
using namespace std;

int main (){
    vector<int>vec={3,9,18,11,7};
    int target=11;
    int ans=-1;

    for(int i=0;i<5;i++){
        if (vec[i]==target){
         ans=i;
        }
    }
cout<<ans<<endl;
return 0;
}

