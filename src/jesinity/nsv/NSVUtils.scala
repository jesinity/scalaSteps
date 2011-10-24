package jesinity.nsv

/**
 * Created by IntelliJ IDEA.
 * User: dgesino
 * Date: 23/10/11
 * Time: 10.37
 * To change this template use File | Settings | File Templates.
 */

import scala.collection.JavaConversions._

object NSVUtils {


  /**
   * gets a list of values corresponding to the name
   */
  def getValue(name: String, l: NSVList): List[String] = {
    require(l != null, name != null)
    l.getList.filter(_.name.equals(name)).map(_.value).toList
  }

  /**
   * remove the entry given the name
   */
  def removeName(name: String, l: NSVList): Unit = {
    require(l != null, name != null)
    val niuList = l.getList.filter(!_.name.equals(name)).toList;
    l.getList.clear()
    l.getList.addAll(niuList)
  }

  /**
   * sets a value
   */
  def setValue(name: String, value: String, l: NSVList): Unit = {
    require(l != null, name != null)
    removeName(name, l);
    l.getList.add(new NSV(name, value));
  }


  def convertToMap(l:NSVList): Map[String,String] = {
    l.getList map { t => (t.name, t.value) } toMap
  }

}