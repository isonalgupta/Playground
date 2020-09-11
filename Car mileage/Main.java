#include<iostream>
using namespace std;
int main()
{
  float m;
  int l,d;
  std::cin>>m;
  std::cin>>l;
  std::cin>>d;
  float x =m*l;
  if(x<d)
    std::cout<<"Cannot reach"<<"\n";
  else
    std::cout<<"Can reach";
}