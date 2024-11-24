package org.example

import java.util.*

class TreeBuilder {
    var left: TreeNode? = null
    var right: TreeNode? = null
    var v: Int = 0
    fun build() = TreeNode(v, left, right)
}

fun node(block: TreeBuilder.() -> Unit) = TreeBuilder().apply(block).build()

data class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
)

fun str(root: TreeNode): String {
    val sb = StringBuilder("[")
    val s = Stack<TreeNode>()
    var curr: TreeNode? = root

    while (curr != null || s.isNotEmpty()) {
        while (curr != null) {
            s.push(curr)
            curr.left
        }
        curr = s.pop()
        sb.append("${curr.`val`},")
        curr = curr.right
    }

    sb.append("]")
    return sb.toString()
}
