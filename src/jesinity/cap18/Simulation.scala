package jesinity.cap18

/**
 * Created by IntelliJ IDEA.
 * User: dgesino
 * Date: 26/10/11
 * Time: 8.23
 * To change this template use File | Settings | File Templates.
 */

abstract class Simulation {

  type Action = () => Unit

  case class WorkItem(time: Int, action: Action)

  private var curtime = 0

  def currentTime: Int = curtime

  private var agenda: List[WorkItem] = List()

  private def insert(ag: List[WorkItem],
                     item: WorkItem): List[WorkItem] = {
    if (ag.isEmpty || item.time < ag.head.time) item :: ag
    else ag.head :: insert(ag.tail, item)
  }

  /**
   * delay is the first parameter, while block is the second.
   * Block do not have an input parameter and returns a Unit.
   */
  def afterDelay(delay: Int)(block: => Unit) = {
    val item = WorkItem(currentTime + delay, () => block)
    agenda = insert(agenda, item)
  }


  private def next() {
    (agenda: @unchecked) match {
      case item :: rest =>
        agenda = rest
        curtime = item.time
        item.action()
    }
  }

  def miao(): Unit = {

  }

  def run() {
    afterDelay(0) {
      println("*** simulation started, time = " +
        currentTime + " ***")
    }
    while (!agenda.isEmpty) next()
  }
}