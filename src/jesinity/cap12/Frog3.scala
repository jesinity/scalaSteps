package jesinity.cap12

/**
 * Created by IntelliJ IDEA.
 * User: dgesino
 * Date: 26/10/11
 * Time: 19.28
 * To change this template use File | Settings | File Templates.
 */

class Frog extends Animal with Philosophical {
  override def toString = "green"

  override def philosophize() {
    println("It ain't easy being " + toString + "!")
  }
}