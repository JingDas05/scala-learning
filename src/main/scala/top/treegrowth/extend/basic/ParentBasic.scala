package top.treegrowth.extend.basic

class ParentBasic {

  private var name = "parentBasic"
  private var age = 18

  // 辅助构造器
  def this(name: String) {
    this()
    this.name = name
    println(this.name)
  }
}
