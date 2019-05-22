/* https://www.hackerrank.com/challenges/ctci-ransom-note/ */

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

fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    val usedNotes = mutableMapOf<String, Int>()

    for (str in note) {
        val searchFromIndex = usedNotes[str] ?: 0
        val index = magazine.findValueIndex(str, searchFromIndex)

        if (index == null) {
            println("No")
            return
        }

        usedNotes[str] = index + 1
    }

    println("Yes")
}

private fun Array<String>.findValueIndex(value: String, fromIndex: Int): Int? {
    if (fromIndex > lastIndex) return null

    for (i in fromIndex..lastIndex) {
        if (this[i] == value) return i
    }

    return null
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val magazine = scan.nextLine().split(" ").toTypedArray()

    val note = scan.nextLine().split(" ").toTypedArray()

    checkMagazine(magazine, note)
}
