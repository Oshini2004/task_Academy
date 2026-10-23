//for cal. area and circumference of circle 

//#include<iostream>
//using namespace std;


//double square(int a){
  //return a*a;
//}


//double circumference(int r) {
//return  2*3.14*r;
//}

//double  area(int r){
  //return  3.14*square(r);
//}



//int main (){
  //int r = 3; 
  //cout<<area(r)<<"  "<<circumference(r)<<endl;
  //return 0;
//}





//age limit 

//  #include<iostream>
  //using namespace std;

  //bool checkEligible(int age, int limit){
    //if(age>= limit){
      //return true;
    //} 
    //else{
      //return false;
    //}
  //}
  //int main(){
    //int voting_limit=18;
    //int eligible_for_voting= checkEligible(9, voting_limit);
    //if (eligible_for_voting){
     // cout<<"yes,eligible";
    //}else{
      //cout<<"no,not eligible";
    //}
    //return 0;
  //}





 // #include<iostream>
  //using namespace std;
  //bool odd(int a){
    //if(a % 2== 0){
  //@num is even@ 
      //return false;
    //}else{
      //@number is odd@
      //return true;
    //}
  //}

  //int main(){
  //int a=1, b=10;
  //for (int i=a; i<=b; i++){
  //if(odd(i)){
  //cout<<i<<"  ";
  //}
  //}
  //return 0;
  //}


#include<iostream>
using namespace std;
bool prime(int num){
  //fun checks that no. is prime or not 
  for(int i=2; i<=(num-1);i++){
    if(num%i==0)return false;
  }
  return true;
}

//or
bool isprime(int num){
  for(int i=2; i*i<=num; i++){
    //i^2<=num......i<=sqrt(num)
    if(num%i==0) return false;
  }
  return true;
}


  int main(){
  int a=1, b=50;
  for (int i=a; i<=b; i++){
  if(isprime(i)){


  cout<<i<<"  ";
  }
  }
  return 0;
  }



    
  


