package dojo


class Diamond(val middleLetter: Char) {

  def char_sequence(): Seq[Char] = ???

  def indents: Seq[Int] = ???

  def between: Seq[Int] = ???

  def rows: Seq[Seq[Char]] = ???

  def one_row(letter: Char, indent: Int, between: Int): Seq[Char] = ???
}

object Diamond {
  def print(middleLetter: Char): String = {
    val diamond = new Diamond(middleLetter)
    diamond.rows.map(_.mkString).mkString("\n")
  }

  def main(args: Array[String]): Unit = {
    if (args.size == 1) {
      val diamondLetter = args(0).charAt(0)
      System.out.print(print(diamondLetter))
    } else {
      System.out.println("please supply one argument: the char of the diamond middle")
    }
  }
}