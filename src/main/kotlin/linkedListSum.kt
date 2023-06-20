/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun reverseNumber(number: Int): Int {
    var n = number
    var reverse = 0
    while (n != 0) {
        reverse = reverse * 10 + n % 10
        n /= 10
    }
    return reverse
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
    val totalFirstNode = l1?.getTotalNumber()
    val totalSecondNode = l2?.getTotalNumber()
    var sum = reverseNumber(totalFirstNode?.plus(totalSecondNode!!)!!)
    val listNode = ListNode(0)
    var first = false
    while (sum >= 0) {
        val remainder = sum % 10
        if (!first) {
            listNode.`val` = remainder
            first = true
        } else {
            listNode.next = ListNode(remainder)
        }
        sum /= 10
        if (sum == 0)
            break
    }
    return listNode
}

fun ListNode.getTotalNumber(): Int {
    var value = this.`val`.toString()
    var node = this
    while (node.next != null) {
        value += node.next?.`val`
        node = node.next!!
    }
    return value.reversed().toInt()
}

fun main() {
    val ln = ListNode(2).apply {
        next = ListNode(4).apply {
            next = ListNode(3)
        }
    }

    val ln2 = ListNode(5).apply {
        next = ListNode(6).apply {
            next = ListNode(4)
        }
    }
    println("number is:")
    println(addTwoNumbers(ln, ln2))
}