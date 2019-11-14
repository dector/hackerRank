/* https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/ */

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

private fun minimumAbsoluteDifference(arr: Array<Int>): Int {
    val arr = arr.sorted()
    
    var diff = Int.MAX_VALUE

    for (i in 0 until arr.lastIndex) {
        val newDiff = abs(arr[i] - arr[i+1])

        if (newDiff < diff) diff = newDiff
    }

    return diff
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = minimumAbsoluteDifference(arr)

    println(result)
}

