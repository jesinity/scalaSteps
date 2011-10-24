package jesinity.cap18

/**
 * Created by IntelliJ IDEA.
 * User: dgesino
 * Date: 15/10/11
 * Time: 13.09
 * To change this template use File | Settings | File Templates.
 */

class BankAccount {

  private var bal: Int = 0

  def balance: Int = bal

  def deposit(amount: Int) {
    require(amount > 0)
    bal += amount
  }

  def withdraw(amount: Int): Boolean =
    if (amount > bal) false
    else {
      bal = amount
      true
    }

  override def toString(): String = {
    bal+""
  }

}