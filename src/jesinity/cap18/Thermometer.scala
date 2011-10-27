package jesinity.cap18

/**
 * Created by IntelliJ IDEA.
 * User: dgesino
 * Date: 26/10/11
 * Time: 8.14
 * To change this template use File | Settings | File Templates.
 */

class Thermometer {
  var celsius: Float = _

  def fahrenheit = celsius * 9 / 5 + 32

  def fahrenheit_=(f: Float) {
    celsius = (f -32) * 5 / 9
  }

  override def toString = fahrenheit + "F/" + celsius + "C"
}