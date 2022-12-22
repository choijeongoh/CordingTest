year = int(input())
yun1 = year%4
yun2 = year%100
yun3 = year%400
if yun1 == 0 and yun2 != 0:
    print(1)
elif yun3 == 0:
    print(1)
else:
    print(0)