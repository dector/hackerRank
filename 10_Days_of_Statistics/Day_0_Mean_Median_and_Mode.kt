/* https://www.hackerrank.com/challenges/s10-basic-statistics/ */

import java.io.*
import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    val size = readLine()!!.trim().toInt()
    
    val arr = readLine()!!.split(" ").map(String::toInt).toIntArray()

    countCentralTendencies(arr)
}

private fun countCentralTendencies(arr: IntArray) {
    arr.sort()

    val mean = arr.sum().toFloat() / arr.size
    
    val median = if (arr.size % 2 == 1)
        arr[arr.size / 2].toFloat()
    else (arr[arr.size / 2] + arr[arr.size / 2 - 1]) / 2.0

    val mode = run {
        val freq = mutableMapOf<Int, Int>().let { freq ->
            for (item in arr) {
                freq[item] = freq.getOrPut(item) { 0 } + 1
            }

            freq.toList()
        }

        val maxFreq = freq.maxBy { (_, value) -> value }?.second

        if (maxFreq != null) freq
            .filter { (_, value) -> value == maxFreq }
            .sortedBy { (_, value) -> value }
            .first().first
        else 0
    }

    println("%.1f".format(mean))
    println("%.1f".format(median))
    println("%d".format(mode))
}

