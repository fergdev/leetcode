package org.example.sort

import org.example.str
import org.junit.jupiter.api.Test

class BubbleSortTest {
    private val testCases = {
        listOf(
            arrayOf(),
            arrayOf(0),
            arrayOf(1 shl 31),
            arrayOf((1 shl 31).inv()),
            arrayOf(1, 1),
            arrayOf(1, 2),
            arrayOf(1, 0),
            arrayOf(1 shl 31, (1 shl 31).inv()),
            arrayOf((1 shl 31).inv(), 1 shl 31),
            arrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0),
            arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        )
    }

    private val sorters: List<Sorter<Int>> = listOf(
        BubbleSort(),
        SelectionSort()
    )

    @Test
    fun sort() {
        sorters.forEach { sorter ->
            val t = testCases()
            t.forEach { arr ->
                sorter.sort(arr)
                assert(arr.isSorted()) {
                    "Failed ${sorter.javaClass.simpleName} ${arr.str()}"
                }
            }
        }
    }

    private fun Array<Int>.isSorted(): Boolean {
        var max = 1 shl 31
        for (v in this) {
            if (v < max) {
                return false
            }
            max = v
        }
        return true
    }
}
