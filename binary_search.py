def binary_search(arr, x):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = low + (high - low) // 2
        if arr[mid] == x:
            return mid
        elif arr[mid] < x:
            low = mid + 1
        else:
            high = mid - 1
    return -1

arr = [int(x) for x in input("Enter the values in sorted array: ").split()]
tgt = int(input("Enter a value to be searched from the sorted array: "))
result = binary_search(arr, tgt)
if result != -1:
    print("Element is found at index", result)
else:
    print("Number is not found.")
