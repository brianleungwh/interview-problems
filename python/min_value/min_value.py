def find_min(arr):
    assert arr != None and len(arr) > 0, "Invalid Input"
    min_value = arr[0]
    for i in range(1, len(arr)):
        if arr[i] < min_value:
            min_value = arr[i]
    return min_value
