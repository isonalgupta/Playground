year = int(input())
if (year % 4) == 0:  
   if (year % 100) == 0:  
       if (year % 400) == 0:  
           print("Vicky can celebrate his birthday.")  
       else:  
           print("Vicky can't celebrate.")  
   else:  
       print("Vicky can celebrate his birthday.")  
else:  
   print("Vicky can't celebrate.")  