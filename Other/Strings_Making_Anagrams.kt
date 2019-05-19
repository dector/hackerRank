/* https://www.hackerrank.com/challenges/ctci-making-anagrams/ */

import java.io.*
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


fun makeAnagram(a: String, b: String): Int {
    val freqA = countFrequencies(a)
    val freqB = countFrequencies(b)

    val letters = (freqA.keys + freqB.keys).distinct()
    val deletionsCount = letters.map { letter ->
        val countInA = freqA[letter] ?: 0
        val countInB = freqB[letter] ?: 0

        abs(countInA - countInB)
    }.sum()

    return deletionsCount
}

private fun countFrequencies(s: String): Map<Char, Int> =
    s.toList()
        .distinct()
        .map { ch: Char -> ch to s.count { it == ch } }
        .toMap()

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val a = scan.nextLine()

    val b = scan.nextLine()

    val res = makeAnagram(a, b)

    println(res)
}

