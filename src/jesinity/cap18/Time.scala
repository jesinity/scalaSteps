package jesinity.cap18

/**
 * Created by IntelliJ IDEA.
 * User: dgesino
 * Date: 26/10/11
 * Time: 8.12
 * To change this template use File | Settings | File Templates.
 */

class Time {
  private[this] var h = 12
  private[this] var m = 0

  def hour: Int = h

  def hour_=(x: Int) {
    require(0 <= x && x < 24)
    h = x
  }

  def minute = m

  def minute_=(x: Int) {
    require(0 <= x && x < 60)
    m = x
  }
}