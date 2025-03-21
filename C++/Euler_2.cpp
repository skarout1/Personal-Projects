#include <iostream>
#include <cmath>
using namespace std;

int main() {
   double total, seq, first = 0.0, second = 1.0;
   
   for(int i = 0; i < 400; i++){
      seq = first + second;
      first = second;
      second = seq;
      if(fmod(seq, 2) == 0 && seq < 4000000){
         total += seq;
      }
   }
   std:: cout << total << std::endl;

return 0;
}