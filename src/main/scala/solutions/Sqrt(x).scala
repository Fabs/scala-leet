object Solution {
    def mySqrt(x: Int): Int = {
      var k = 0
      while((k+1) <= x/(k+1)) {
        k += 1
      }
      
      k
    }
}