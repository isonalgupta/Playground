n,m = int(input()), int(input())
for i in range(n,m):
  number = i
  c=0
  for j in range(1,(number//2)+1):
    if number%j ==0:c=c+j
  if(number == c):print(number, end = " ")
  
