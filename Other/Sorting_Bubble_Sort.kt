/* https://www.hackerrank.com/challenges/ctci-bubble-sort/ */

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
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun countSwaps(a: Array<Int>): Unit {
    val (arr, swaps) = sort(a)
    
    println("Array is sorted in $swaps swaps.")
    println("First Element: ${arr.first()}")
    println("Last Element: ${arr.last()}")
}

private fun sort(arr: Array<Int>): Pair<Array<Int>, Int> {
    val arr = arr.copyOf()
    var swaps = 0

    for (i in 0 until arr.size) {
        for (j in 0 until arr.size - 1) {
            if (arr[j] > arr[j+1]) {
                swap(arr, j, j+1)
                swaps++
            }
        }
    }

    return arr to swaps
}

private fun swap(arr: Array<Int>, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    countSwaps(a)
}

