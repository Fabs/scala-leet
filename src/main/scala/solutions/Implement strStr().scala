object Solution2 {
  def strStr(haystack: String, needle: String): Int = {
    if (needle == "") {
      return 0
    }

    if (needle.length > haystack.length) {
      return -1
    }

    var i = 0
    var j = 0
    while (i < haystack.length && j < needle.length) {
      if (haystack(i) == needle(j)) {
        j += 1
        i += 1

        if (j == needle.length) {
          return i - j
        }
      } else {
        i = i + 1 - j
        j = 0
      }
    }

    -1
  }
}
