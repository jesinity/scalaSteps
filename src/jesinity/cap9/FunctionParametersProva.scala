package jesinity.cap9

/**
 * Created by IntelliJ IDEA.
 * User: dgesino
 * Date: 26/10/11
 * Time: 8.35
 * To change this template use File | Settings | File Templates.
 */

object FunctionParametersProva {

  /**
   * takes a function as a parameter, that
   * has a String as an input and an Int as
   * a return value.
   */
  def mimmoApplierFunction(myFunction: (String) => Int) {
    print(myFunction("MIMMO"))
  }

  def applierFunctionFactory(): (String => Int) = {
    return (x: String) => x.length()
  }

  /**
   * the parameters can be separated like this
   */
  def moreParams2(x: Int)(y: Int)(z: Int): Int = {
    x + y + z
  }

  def moreParams(x: Int, y: Int, z: Int): Int = {
    x + y + z
  }

  def differenceInInvocations(): Unit = {
    print(moreParams(1, 2, 3))
    print(moreParams2(1)(2)(3))

  }


}