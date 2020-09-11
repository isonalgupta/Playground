x,y,u,v = int(input()),int(input()),int(input()),int(input())
dollar = x+u
cent = y+v
if cent > 100:
  cent-=100
  dollar +=1
print(dollar)
print(cent)