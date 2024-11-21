package org.example.sort

class SelectionSort : Sorter<Int> {
    override fun sort(a: Array<Int>) {
        for (i in a.indices) {
            var lowestI = i
            for (j in i + 1 until a.size) {
                if (a[j] < a[lowestI]) {
                    lowestI = j
                }
            }
            if (lowestI != i) {
                val t = a[i]
                a[i] = a[lowestI]
                a[lowestI] = t
            }
        }
    }
}