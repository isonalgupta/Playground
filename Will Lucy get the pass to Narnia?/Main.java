#include <iostream>
using namespace std;

int main() 
{
  int x,y,z;
  std::cin>>x;
  std::cin>>y;
  std::cin>>z;
  std::cout<<"Enter first number : Enter second number : Menu \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Remainder\n";
  switch(z)
  {
    case 1:std::cout<<x+y;
      	   break;
    case 2:std::cout<<x-y;
           break;
    case 3:std::cout<<x*y;
           break;
    case 4:std::cout<<x/y;
           break;
    case 5:std::cout<<x%y;
           break;
    default:std::cout<<"Invalid operation"; 
  } 
  return 0;
}