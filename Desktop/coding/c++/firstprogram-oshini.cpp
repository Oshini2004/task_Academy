#include<iostream>
using namespace std;
int main(){
  
  int mark[]={23,45,56,89};

  int mathmarks[4];
  mathmarks[0]=223;
  mathmarks[1]=784;
  mathmarks[2]=833;
  mathmarks[3]=654;  

  cout<<"these are math marks"<<endl;
  cout<<mathmarks[0]<<endl;
  cout<<mathmarks[1]<<endl;
  cout<<mathmarks[2]<<endl;
  cout<<mathmarks[3]<<endl;

  
mark[2]=123;
cout<<"these are marks"<<endl;

for(int i=0; i<4; i++)
{
  cout<<"the value of marks"<< i <<"is"<<mark[i]<<endl;
}
return 0;
}
    
    


    
    
 

    
    
    
    
    
    

  
            
        


    
    


    
