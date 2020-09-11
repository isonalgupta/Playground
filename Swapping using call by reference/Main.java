def swap(x,y):
  temp = 0
  temp = x+y
  x = temp-x
  y = temp-y  
  print("After swapping a= {} and b={}".format(x,y))
  
  
  
n,m = map(int,input().split())
print("Before swapping a= {} and b={}".format(n,m))
swap(n,m)