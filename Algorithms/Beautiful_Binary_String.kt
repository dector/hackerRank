/* https://www.hackerrank.com/challenges/beautiful-binary-string/ */

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

fun beautifulBinaryString(b: String): Int {
    val str = b.toCharArray()
    var changes = 0

    for (i in 0..(b.length - 3)) {
        if (str[i] == '0' && str[i+1] == '1' && str[i+2] == '0') {
            str[i+2] = '1'
            changes++
        }
    }

    return changes
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val b = scan.nextLine()

    val result = beautifulBinaryString(b)

    println(result)
}

