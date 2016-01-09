def find_min(arr):
    assert arr != None and len(arr) > 0, "Invalid Input"
    min_value = arr[0]
    for i in range(1, len(arr)):
        if arr[i] < min_value:
            min_value = arr[i]
    return min_value

print(find_min([2, 3, 1, 4, 5]))
print(find_min([2, 3]))
print(find_min([3]))
