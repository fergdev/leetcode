package org.example.sort

/**
 * Time: O(n^2)
 * Space: O(1)
 */
class BubbleSort : Sorter<Int> {
    override fun sort(a: Array<Int>) {
        for (i in a.indices) {
            var swap = false
            for (j in 0 + 1 until a.size) {
                if (a[j - 1] > a[j]) {
                    swap = true
                    val t = a[j]
                    a[j] = a[j - 1]
                    a[j - 1] = t
                }
            }
            if (!swap) return
        }
    }
}
