/* https://www.hackerrank.com/challenges/jumping-on-the-clouds/ */

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

fun jumpingOnClouds(c: Array<Int>): Int {
    var jumps = 0
    
    var i = 0
    while(i < c.lastIndex) {
        val lookup = i + 2
        if (lookup <= c.lastIndex && c[lookup] == 0)
            i += 2
        else i++

        jumps++
    }

    return jumps
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}

