package top.treegrowth.traitest.ordertest

class SavingAccount2 extends ShortLogger with TimeStampLogger {

  def save(): Unit = {
    log("SavingAccount2")
  }
}
