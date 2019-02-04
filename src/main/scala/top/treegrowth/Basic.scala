package top.treegrowth

import top.treegrowth.objectest.extend.DoNothingAction


/**
  * @author wusi 
  * @version 2019/1/25 16:43.
  */
object Basic {

  def main(args: Array[String]): Unit = {
    //    val string = "goodDay"
    //    println(string(4))

    //    test(1)
    //    printFormat()
    //    forTest()
    objectTest()
  }

  def triangleArea(base: Double, height: Double): Double =
    base * height / 2

  def triangleAreaBody(base: Double, height: Double): Double = {
    base * height / 2
  }

  def objectTest(): Unit = {
    val person = Person("wusi", 30)
    person.age = 20
    println(person.age)

    //
    DoNothingAction.redo()
  }


  def forTest(): Unit = {
    //    println(1.to(10))
    //    println(1 to 5)
    val target = "hello"
    var sum = 0
    for (i <- 0 until target.length) {
      println(i)
      //      sum += target(i)
    }
    //    println(sum)

  }

  def printFormat(): Unit = {
    val name = "lily"
    val age = 10
    println(s"hello $name, ${age + 0.5}%7.2f")
    //    %7.2f的格式化会生效
    println(f"hello $name, ${age + 0.5}%7.2f")
  }

  def test(param: Int): Unit = {
    if (param == 1) {
      println(param)
    } else {
      print("数据0")
    }
  }
}
