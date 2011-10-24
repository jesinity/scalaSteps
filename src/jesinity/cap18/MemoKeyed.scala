package jesinity.cap18

/**
 * Created by IntelliJ IDEA.
 * User: dgesino
 * Date: 15/10/11
 * Time: 14.15
 * To change this template use File | Settings | File Templates.
 */

class MemoKeyed extends Keyed {
  private var keyCache: Option[Int] = None

  override def computeKey: Int = {
    if (!keyCache.isDefined) keyCache = Some(super.computeKey)
    keyCache.get
  }
}