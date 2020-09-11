P= int(input())
R= int(input())
Y= int(input())
r = R/100
a = P*(1+(r*Y))
amount = int(a)
interest = amount-P
discount = interest*(2/100)
final = amount - discount
print("{}\n{}\n{}\n{}".format(interest,amount,discount,final))
