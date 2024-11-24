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
    val max = this.max()
    val pad = max.toString().length

    forEachIndexed { index, element ->
        sb.append(element.toString().padStart(pad, ' '))
        if (index != this.size - 1) sb.append(",")
    }

    sb.append("]")
    return sb.toString()
}

fun Array<Boolean>.str(): String {
    val sb = StringBuilder("[")
    forEachIndexed { index, element ->
        sb.append(if (element) "T" else "_")
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

fun <T> Array<Array<T>>.str(): String {
    val sb = StringBuilder("[")
    forEachIndexed { index, element ->
        sb.append(element.str())
        if (index != this.size - 1) sb.append("\n")
    }

    sb.append("]")
    return sb.toString()
}


fun Array<IntArray>.str(): String {
    val sb = StringBuilder()
    val max = maxOfOrNull { it.max() }
    val pad = max.toString().length + 1

    this.forEachIndexed { i, arr ->
        sb.append("[")
        arr.forEachIndexed { index, element ->
            sb.append(element.toString().padStart(pad, ' '))
            if (index != arr.size - 1) sb.append(",")
        }

        sb.append("]")
        if (i != this.size - 1) sb.append("\n")
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
