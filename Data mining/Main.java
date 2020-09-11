n = int(input())
se,so=0,0
while(n>0):
  r = n%10
  if r%2 == 0:
    se = se+r
  else:
    so = so+r
  n = n//10
if(se == so):
  print("Yes")
else:
  print("No")
  
  