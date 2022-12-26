a = int(input())
b = int(input())
s = []
for i in range(b):
    c, d = map(int, input(). split())
    s.append(c*d)
if sum(s) == a:
    print('Yes')
elif sum(s) != a:
    print('No')