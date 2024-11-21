package org.example

fun <T> List<T>.str(): String {
    val sb = StringBuilder("[")
    forEachIndexed { index, element ->
        sb.append(element)
        if (index != this.size - 1) sb.append(",")
    }

    sb.append("]")
    return sb.toString()
}

fun IntArray.str(): String {
    val sb = StringBuilder("[")
    forEachIndexed { index, element ->
        sb.append(element)
        if (index != this.size - 1) sb.append(",")
    }

    sb.append("]")
    return sb.toString()
}

fun <T> Array<T>.str(): String {
    val sb = StringBuilder("[")
    forEachIndexed { index, element ->
        sb.append(element)
        if (index != this.size - 1) sb.append(",")
    }

    sb.append("]")
    return sb.toString()
}

fun Array<IntArray>.str(): String {
    val sb = StringBuilder()
    this.forEach {
        sb.append(it.str() + "\n")
    }
    return sb.toString()
}

fun Array<BooleanArray>.str(): String {
    val sb = StringBuilder()
    this.forEach {
        sb.append(it.str() + "\n")
    }
    return sb.toString()
}

fun BooleanArray.str(): String {
    val sb = StringBuilder("[")
    forEachIndexed { index, element ->
        sb.append(if (element) "T" else "_")
        if (index != this.size - 1) sb.append(",")
    }

    sb.append("]")
    return sb.toString()
}
