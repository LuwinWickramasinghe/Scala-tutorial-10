object Lettercounter {
  def countLetterOccurrences(Wordlist: List[String]): Int = {
 
    val letterCountlist = Wordlist.map(word => word.length)

    val Lettercount = letterCountlist.reduceOption(_ + _)

    Lettercount match {
      case Some(sumOfCount) => sumOfCount
      case None => 0
    }
  }

  def main(args: Array[String]): Unit = {
    val Listofwords = List("apple", "banana", "cherry", "date")
    val letterOccurrence = countLetterOccurrences(Listofwords)
    println(s"Average Fahrenheit Temperature: $letterOccurrence")
  }
}