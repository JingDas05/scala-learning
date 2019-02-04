package top.treegrowth.enumtest

object Color extends Enumeration {

  val Red = Value(2, "red")
  val Yellow = Value("yellow")

  def showAll(): Unit = {
    for (each <- Color.values) println(each)
  }
}
