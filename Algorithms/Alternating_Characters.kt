/* https://www.hackerrank.com/challenges/alternating-characters/ */

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

fun alternatingCharacters(s: String): Int {
    if (s.isEmpty()) return 0

    var deletions = 0

    var prevCh = s[0]
    for (ch in s.drop(1)) {
        if (ch == prevCh) deletions++
        else prevCh = ch
    }

    return deletions
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = alternatingCharacters(s)

        println(result)
    }
}

