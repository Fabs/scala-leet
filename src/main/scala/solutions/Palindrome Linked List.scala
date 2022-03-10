package leet
package solutions

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

// @solution-sync:begin
object SolutionPalindrome {
    def isPalindrome(head: ListNode): Boolean = {
      val list = toList(head)
      val listReverse = toList(head).reverse

      list == listReverse
    }

    def toList(head: ListNode): List[Int] = {
      var list = List.empty[Int]
      var current = head
      while(current != null) {
        list = current.x +: list
        current = current.next
      }

      list
    }
}
