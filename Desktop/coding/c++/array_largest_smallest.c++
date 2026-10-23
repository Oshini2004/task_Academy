 #include<iostream>
 #include<climits>
 using namespace std;
 int main(){
    int nums[]={55,3,66,57,2,-7,23};
    int size =7;
    int smallest = INT_MAX;
    int largest = 


    for (int i=0; i<size; i++){
        if (nums[i]<smallest){
            smallest = nums [i];
        }
    }
    cout<<"smallest =" <<smallest <<endl;
    return 0;
 }
  