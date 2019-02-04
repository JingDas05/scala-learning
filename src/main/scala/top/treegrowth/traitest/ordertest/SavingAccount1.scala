package top.treegrowth.traitest.ordertest

class SavingAccount1 extends TimeStampLogger with ShortLogger {

  def save(): Unit = {
    log("SavingAccount1")
  }
}
