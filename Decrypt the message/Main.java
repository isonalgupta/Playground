x, y = int(input()), int(input())
s = x+y
c = 0
for i in range(1,(s//2)+1):
  if s%i == 0:
    c = c+i
if (s == c):
  print("They can read the message")
else:
  print("They can't read the message")
    