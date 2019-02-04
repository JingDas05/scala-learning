package top.treegrowth.objectest.extend

object DoNothingAction extends UndoableAction("Do nothing") {
  override def undo(): Int = {
    1
  }

  override def redo(): Int = {
    val actions = Map("start" -> DoNothingAction, "stop" -> DoNothingAction)
    print(actions("start"))
    2
  }
}
