#include<iostream>
using namespace std;
int main (){
    int n;
    cin>>n;

   int no=0;
   int power=1;
   while(n>0){
   int lastdigit = n%10;
   no+=lastdigit*power;
   power*=2;
   n/=10;
   
   }

   cout<<no<<endl;
   return 0;
}
