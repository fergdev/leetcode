package org.example

fun printLN(ln: ListNode) {
    println(ln.str())
}

fun ListNode?.str(): String {
    if (this == null) return "[]"
    val sb = StringBuilder("[")
    var l: ListNode? = this
    while (l != null) {
        sb.append("${l.`val`}")
        if (l.next != null) {
            sb.append(", ")
        }
        l = l.next
    }
    sb.append("]")
    return sb.toString()
}

fun createListNode(vararg v: Int): ListNode {
    val head = ListNode(v[0])

    var h = head
    for (i in 1 until v.size) {
        val next = ListNode(v[i])
        h.next = next
        h = next
    }
    return head
}

data class ListNode(
    var `val`: Int,
    var next: ListNode? = null
)

class ListNodeBuilder {
    var v: Int = 0
    var n: ListNode? = null
    fun build(): ListNode {
        return ListNode(v, n)
    }
}

fun ln(block: ListNodeBuilder.() -> Unit) = ListNodeBuilder().apply(block).build()
