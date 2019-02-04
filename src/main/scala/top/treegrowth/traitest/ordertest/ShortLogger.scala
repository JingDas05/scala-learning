package top.treegrowth.traitest.ordertest

trait ShortLogger extends ConsoleLogger {
  override def log(message: String): Unit = println(message.substring(5))
}
