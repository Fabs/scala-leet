object Solution8 {
  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
    mat.zipWithIndex.sortBy(score).map(_._2).take(k)
  }

  def score(row: (Array[Int], Int)): (Int, Int) = {
    val soldiers = row._1.takeWhile(_ == 1).length
    val index = row._2

    (soldiers, index)
  }
}
