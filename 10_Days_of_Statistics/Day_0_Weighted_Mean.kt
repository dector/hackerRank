/* https://www.hackerrank.com/challenges/s10-weighted-mean/ */

import java.io.*
import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    val count = readLine()!!.trim().toInt()
    val values = readLine()!!.split(" ").map(String::toInt).toIntArray()
    val weights = readLine()!!.split(" ").map(String::toInt).toIntArray()

    val weightedMean = countWeightedMean(values, weights)
    println("%.1f".format(weightedMean))
}

private fun countWeightedMean(vals: IntArray, w: IntArray): Float {
    var sum = 0
    for (i in 0..vals.lastIndex) {
        sum += vals[i] * w[i]
    }

    return 1f * sum / w.sum()
}
