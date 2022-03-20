class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

// @solution-sync:begin
object Solution {
    def isPalindrome(head: ListNode): Boolean = {
      if(head == null || head.next == null) {
        return true
      }
      val firstHalf = head
      val secondHalf = headOfSecondHalf(head)
      val reversedSecondHalf = reverse(secondHalf)

      val isPalindrom = isEqualLinkedList(reversedSecondHalf, firstHalf)

      val fixedSecondHalf = reverse(reversedSecondHalf)
      join(firstHalf, fixedSecondHalf)

      isPalindrom
    }

    def headOfSecondHalf(list: ListNode): ListNode = {
      var step1 = list
      var step2 = list
      while(step2 != null && step2.next != null) {
        step1 = step1.next
        step2 = step2.next.next
      }

      step1
    }

    def reverse(head: ListNode): ListNode = {
      reverseR(null, head)
    }

    def reverseR(parent: ListNode, head: ListNode): ListNode = {
      if(head == null) {
        return parent
      }
      val next = head.next
      head.next = parent
      reverseR(head, next)
    }

    def isEqualLinkedList(list1: ListNode, list2: ListNode): Boolean = {
      if(list1 == null) {
        return true
      }

      if(list2 == null) {
        return false
      }

      if(list1.x == list2.x) {
        return isEqualLinkedList(list1.next, list2.next)
      }

      false
    }

    def join(list1: ListNode, list2: ListNode): ListNode = {
      val joint = list1
      while(joint.next != null) {
        joint.next = joint.next.next
      }

      joint.next = list2

      list1
    }
}