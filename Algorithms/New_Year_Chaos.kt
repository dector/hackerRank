/* https://www.hackerrank.com/challenges/new-year-chaos/ */

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.math.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun minimumBribes(q: Array<Int>): Unit {
    val minBribes = countTotalBribes(q)

    if (minBribes != null)
        println(minBribes)
    else
        println("Too chaotic")
}

private fun countTotalBribes(q: Array<Int>): Int? {
    val arr = q.copyOf()

    var totalBribes = 0

    for (expectedPos in arr.lastIndex downTo 0) {
        val expectedValue = expectedPos + 1
        val seekRange = (max(expectedPos - 2, 0)..expectedPos)
        val currentPos = arr.findIndex(expectedValue, seekRange)

        if (currentPos == null) return null

        if (currentPos < expectedPos - 1) {
            arr[expectedPos - 2] = arr[expectedPos - 1]
            totalBribes++
        }
        if (currentPos < expectedPos) {
            arr[expectedPos - 1] = arr[expectedPos]
            totalBribes++
        }
        arr[expectedPos] = expectedValue
    }

    return totalBribes
}

private fun Array<Int>.findIndex(value: Int, inRange: IntRange): Int? {
    for (i in inRange) {
        if (this[i] == value) return i
    }

    return null
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val q = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        minimumBribes(q)
    }
}

