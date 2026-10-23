// #include<iostream>
// #include<vector>
// using namespace std;

// int main()
// {
//     vector<int>v(6);
//     for(int i=0;i<v.size();i++){
//         cin>>v[i];
//     }
//     cout<<"enter x:";
//     int x;
//     cin>>x;
//     int occurence=0;

//     for(int ele:v){
//         if(ele==x){
//             occurence++;
//           }
//     }
//     cout << occurence<<endl;
// return 0;
// }



/////////////////////////////////////////UNIQUE/////////////////////////////////////
#include<iostream>
using namespace std;
int main ()
{
    int array[]={2,3,1,3,4,4,1,2,3,5};
    int size=10;
    for(int i=0;i<size;i++){
        for(int j=i+1 ;j<size;j++){
            if(array[i]==array[j]){
                array[i]=array[j]=-1;
            }
        }
    }
    int unique=0;
    for(int i=0;i<size;i++){
        if(array[i]>0){
            unique=array[i];
        }
    }
     cout<<unique<<endl;
    return 0;
}



/////////////////////////////////////



///////////////GREATER THAN NUMBER IN ARRAY////////////////
// #include<iostream>
// #include<vector>
// using namespace std;

// int main ()
// {
//     vector<int>v(6);
//     for(int i=0;i<v.size();i++){
//         cin>>v[i];
//     }
//     cout<<"Enter x:";
//     int x;
//     cin>>x;
//     int count=0;
//     for(int i=0;i<v.size();i++){
//         if(v[i]>x){
//             count++;
//         }
//     }
//     cout<<count<<endl;
//     return 0;
// }

