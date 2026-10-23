/////////////////SUBARRAY///// APNA CLG/////////////////////
// #include<iostream>
// #include<vector>
// using namespace std;

// int main(){
//     int n=6;
//     int arr[6]={2,4,1,5,4,7};


//     for(int st=0; st<n; st++){
//         for(int end=st; end<n; end++){
//             for(int i=st; i<=end ; i++){
//                 cout<<arr[i];
//             }
//             cout<< " ";
//         }
//         cout<<endl;
//     }
//     return 0;
// }

// ///////////////////////////////////MAXIMUM SUBARRAAY SUM////////////////////////////
// ///////////////////////////////////BRUTE FORCE APPROACH////////////////////////////
    
 #include<iostream>
 #include<climits>
 #include<vector>
 using namespace std;

 int main(){
     int n=6;
     int arr[6]={2,4,5,1,4,7};
     int maxSum = INT_MIN ;

     for(int st=0;st<n;st++){
         int currSum=0;
         for(int end=st;end<n; end++){
             currSum+= arr[end];
             maxSum= max(currSum, maxSum);
         }
     }
     cout<<"max subarray sum ="<<maxSum <<endl;
    return 0;
 }
      //////////////////////WRONG/////////////////


      ////////////////////////KADANEL'S ALGORITHM//////////////////
#include<iostream>
#include<vector>
using namespace std ;

int main(){
    int maxSubArray(vector<int>& num){
        int currSum=0, maxSum = INT_MIN;

        for(int val:num ){
            currSum+=val;
            maxSum= max(currsum,maxSum);

            if(currSum <0){
                currSum=0;
            }
        }
    }
        return 0;
}
    
    