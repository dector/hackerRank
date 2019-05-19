/* https://www.hackerrank.com/challenges/repeated-string/ */

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

fun repeatedString(s: String, n: Long): Long {
    val fullLinesCount = n / s.length
    val partialLength = (n % s.length).toInt()

    return fullLinesCount * s.count { it == 'a' } +
        s.substring(0, partialLength).count { it == 'a' }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}

