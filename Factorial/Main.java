def fact(n):
  fact =1
  for i in range(1,n+1):
    fact = fact * i
  return fact

n = int(input())
res= fact(n)
print("The factorial of {} is {}".format(n,res))
    