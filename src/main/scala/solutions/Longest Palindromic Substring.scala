import scala.collection.mutable.HashSet

object Solution3 {
    def longestPalindrome(str: String): String = {
      val pals = new HashSet[(Int, Int)]
      var longest = str.substring(str.length - 1, str.length)
      (2 to str.length).foreach(l => {
        (0 to (str.length - l)).foreach(s => {
          if(str.charAt(s) == str.charAt(s + l - 1) && (l <= 3 ||  pals.contains(s + 1, s + l - 2))) {
            pals.add((s, s + l - 1))
            longest = str.substring(s, s + l)
          }
        })
      })

//      val d = pals.toList.map(x => str.substring(x._1, x._2 + 1)).toString
//      s"$longest: $d"
      longest
    }
}
