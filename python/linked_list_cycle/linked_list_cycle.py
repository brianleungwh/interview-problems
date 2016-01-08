class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def hasCycle(self, head):
        if head == None:
            return False
        slow = head
        fast = head.next
        while fast != None:
            if slow == fast:
                return True
            elif fast.next == None or fast.next.next == None:
                return False
            else: 
                slow = slow.next
                fast = fast.next.next
        return False
        