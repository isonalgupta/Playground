def fun(n):
    l=[]
    while(n>10):
        t = n%10
        l.append(t)
        n = n//10
    l.append(n)
    s = sum(l)
    if s <10:
        return s
    else:
        return fun(s)
    
n = int(input())
res = fun(n)
print(res)
   