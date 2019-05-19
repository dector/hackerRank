/* https://www.hackerrank.com/challenges/counting-valleys/ */

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

fun countingValleys(n: Int, s: String): Int {
    var height = 0
    var valleysVisited = 0
    var isInValley: Boolean? = null   // null for undefined sea-level state

    for (step in s) {
        when (step) {
            'D' -> {
                height--

                if (isInValley == null)
                    isInValley = true
            }
            'U' -> {
                height++

                if (isInValley == null)
                    isInValley = false
            }
        }

        if (height == 0) {
            if (isInValley == true) valleysVisited++
            isInValley = null
        }
    }

    return valleysVisited
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}

