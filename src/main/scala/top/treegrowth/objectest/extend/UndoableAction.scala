package top.treegrowth.objectest.extend

abstract class UndoableAction(val description: String) {

  def undo(): Int

  def redo(): Int
}
