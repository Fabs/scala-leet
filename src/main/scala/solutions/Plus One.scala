object Solution5 {
  def plusOne(digits: Array[Int]): Array[Int] = {
    val result = digits.reverse.foldLeft((1, Array.empty[Int]))((mem, d) => {
      val carry = mem._1
      val res = mem._2

      val sum = d + carry
      val newCarry = sum / 10
      val newDigit = sum % 10

      (newCarry, res.prepended(newDigit))
    })

    if (result._1 == 1) {
      result._2.prepended(1)
    } else {
      result._2
    }
  }
}
