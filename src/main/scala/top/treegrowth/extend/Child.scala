package top.treegrowth.extend

class Child extends Parent(name = "staticName", age = 88) {

  override def getAll: String = super.getAll
}
