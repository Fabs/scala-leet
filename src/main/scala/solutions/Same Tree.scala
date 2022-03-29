class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}

// @solution-sync:begin
object Solution6 {
    def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
      if(p == null && q == null) {
        return true
      } else if (p == null || q == null) {
        return false
      }

      isSameTree(p.left, q.left) &&
        isSameTree(p.right, q.right) &&
          p.value == q.value
    }
}
