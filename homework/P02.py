#!/home/lcj/javaSrc/homework python
# - sushu - P02.py

import math

def getSushu(mfrom, to):
    sushus = \
    [num for num in range(mfrom, to) if isSushu(num)]
    return sushus

def isSushu(num):
    sqrt = int(math.sqrt(num)+1)
    for i in range(2, sqrt):  # num**0.5
        if num % i == 0:
            return False
    return True

if __name__ == "__main__":
    mfrom = 101
    to = 200
    sushus = getSushu(mfrom, to)
    for i in sushus:
        print(i)
    print('sushu have: ' + str(len(sushus)))
