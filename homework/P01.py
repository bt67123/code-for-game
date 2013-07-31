#!/home/lcj/javaSrc/homework python
# - fblaji - P01.py

def fb(month):
    if month == 1 or month == 2:
        return 1
    else:
        return fb(month-1) + fb(month-2)
    
if __name__ == "__main__":
    month = 24
    for i in range(24):
        print("month " + str(i+1) + " : " + str(fb(i+1)))
