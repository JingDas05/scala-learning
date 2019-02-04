package top.treegrowth.traitest.ordertest

object Main extends App {

  val savingAccount1 = new SavingAccount1
  val savingAccount2 = new SavingAccount2
  savingAccount1.save()
  savingAccount2.save()
}
