import math


# binary_search([1, 2, 3, 4, 5], 4) // 3
# binary_search([1, 2, 3, 4, 5], 10) // None
def binary_search(sorted_list, target):
    def search(sorted_list, target, low, high):
        if low >= high:
            return
        mid_index = ((high - low) / 2) + low
        mid_item = sorted_list[mid_index]
        if target > mid_item:
            return search(sorted_list, target, mid_index, high)
        elif target < mid_item:
            return search(sorted_list, target, low, mid_index)
        else:
            return mid_index
    return search(sorted_list, target, 0, len(sorted_list))
