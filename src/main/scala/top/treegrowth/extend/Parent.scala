package top.treegrowth.extend

class Parent(var name: String, var age: Int) {

  val height = 180
  var weight = 70

  def getAll: String = {
    this.name + age + height + weight
  }
}
