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

    val swaps = mutableMapOf<Int, Int>()
    for (i in 0 until arr.size) {
        for (j in i until arr.size - 1) {

            val currValue = arr[j]
            val nextValue = arr[j+1]
            if (currValue > nextValue) {
                val swapsCount = swaps.getOrPut(currValue) { 0 } + 1
                if (swapsCount > 2) return null

                swaps[currValue] = swapsCount
                arr[j] = nextValue
                arr[j+1] = currValue
            }
        }
    }

    return swaps.values.sum()
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

