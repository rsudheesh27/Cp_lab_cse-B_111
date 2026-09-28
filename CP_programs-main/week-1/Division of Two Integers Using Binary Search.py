# Enter your code here. Read input from STDIN. Print output to STDOUT
INT_MAX = 2147483647
INT_MIN = -2147483648

dividend, divisor = map(int, input().split())

q = int(dividend / divisor)

if q > INT_MAX:
    print(INT_MAX)
elif q < INT_MIN:
    print(INT_MIN)
else:
    print(q)
