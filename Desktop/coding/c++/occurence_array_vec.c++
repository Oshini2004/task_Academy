// #include<iostream>
// #include<vector>
// using namespace std;

/////////////////////////////SUM/////////////////////////////

//  int main(){

//      int array[]={3,4,10,11};
//      int size= sizeof(array)/sizeof(array[0]);

//      int sum=0;
//      for(int i=0;i<size;i++){
//          sum+=array[i];
//      }
//      cout<<sum<<endl;
//      return 0;
//  }


////////////////////////MAX VALUE /////////////////////////

//  
//  int main(){

//  int array[]={2,5,7,9,4};
//  int max=array[0];

//  for(int i=0;i<5;i++){
//      if(max<array[i]){
//          max=array[i];
//      }
//  }

//  cout<<max<<endl;
//  return 0;
//  }

///////////////////// SUM AND PRODUCT ////////////////////////

 //int main() {
//     int array[]={3,6,7,2,1};
//     int sum=0;
//     int pro=1;

//     for(int i=0;i<5;i++){
//         sum+=array[i];
//         pro*=array[i];
//     }
//     cout<<sum<<endl;
//     cout<<pro<<endl;
// return 0;
// }

/////////////////////UNIQUE VALUE//////////////////////////

class solution{
    public:
    int singleNum(vector<int>& nums){
        int ans=0;

        for(int val: nums){
            ans=ans^val;
        }
        return ans;
    }
};



