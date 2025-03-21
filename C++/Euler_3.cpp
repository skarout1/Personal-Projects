#include <iostream>
using namespace std;
int main(){
   long num = 600851475143L, factor = 0L;
   for(int i = 1; i < 100000; i++){
      if(num / i == 0){
         for(int e = 1; e < 100000; e++){
            if((num/i)/e == 0){
            }
            else{   
               factor = num/i;
            }
         }
      }
   }
   std:: cout << factor << std::endl;
return 0;
}