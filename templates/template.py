# run on python 3.7.2

def main():
    n = int(input())
    s = input()
    x = [None] * n
    y = [None] * n
    for i in range(n):
        x[i], y[i] = map(int, input().split())
    # solve here
    print(n)
    print(s)
    print(x[0])
    print(y[n - 1])

def solve(n):
    return 0

main()
