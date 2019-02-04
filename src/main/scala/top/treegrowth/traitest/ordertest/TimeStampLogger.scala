package top.treegrowth.traitest.ordertest

trait TimeStampLogger extends ConsoleLogger {
  override def log(message: String): Unit = super.log(s"${java.time.Instant.now()} $message")
}
