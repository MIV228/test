@file:Suppress("UNREACHABLE_CODE")

import org.junit.jupiter.api.Test
import kotlin.math.PI
import kotlin.math.pow
import kotlin.system.exitProcess
import kotlin.test.assertEquals

class the() {
    @Test
    fun test() {
        val d = 15.0
        var result = d * PI
        assertEquals(result, b4(d), "Access denied")
    }
}

fun main() {
    println("Решать дальше?(0/1)")
    var b = readLine()!!.toString()
    when (b) {
        "0" -> {
            println("Какая задача?")
            var a = readLine()!!.toString()
            when (a) {
                "0" -> the()
                "a1" -> a1()
                "a2" -> a2()
                "a18" -> a18()
                "p16" -> p16()
                "p17" -> p17()
                "p18" -> p18()
                "p19" -> p19()
                "s1" -> s1()
                "s2" -> s2()
                "s3" -> s3()
                "s4" -> s4()
                "a92" -> a92()
                else -> {
                    println("При вычислениях произошла ошибка.")
                    println("ВЫПОЛНЯТСЯ ПЕРЕЗАПУСК")
                    main()
                }
            }
        }
        "1" -> {
            println("ок")
            exitProcess(Int.MAX_VALUE)
        }
        "2" -> mainErrors()
        "3" -> game()
        else -> {
            println("При вычислениях произошла ошибка.")
            println("ВЫПОЛНЯТСЯ ПЕРЕЗАПУСК")
            main()
        }
    }


}

fun b4(d: Double): Double {
    var pi = PI
    var L = pi * d
    return L
    main()
}

fun a1() {
    var n = 100
    var arr = List(n) {
        it * 2 + 1
    }
    println(arr)
    main()
}

fun a2() {
    var arr = List(100) {
        2.0.pow(it)
    }
    println(arr)
    main()
}

fun a18() {
    var a = List(10) {
        (1..9).random()
    }
    var b = a.findLast { a[0] < it && it < a[9] }
    if (b == null) {
        println(a)
        println(0)
    } else {
        println(a)
        println(b)
    }
    main()
}

fun p16() {
    var a = (-10..10).random()
    println(a)
    Sign(a)
    main()
}

fun Sign(x: Int): Int {
    return when {
        x < 0 -> {
            println(-1)
            -1
        }
        x == 0 -> {
            println(0)
            0
        }
        x > 0 -> {
            println(1)
            1
        }
        else -> Int.MAX_VALUE
    }
//    if (x < 0) {
//        println(-1)
//        return -1
//    } else if (x == 0) {
//        println(0)
//        return 0
//    } else {
//        println(1)
//        return 1
//    }
}

fun p17() {
    var a = (-50..50).random().toDouble()
    var b = (-50..50).random().toDouble()
    var c = (-50..50).random().toDouble()
    println("$a --- $b --- $c")
    println(RootsCount(a, b, c))
}

fun RootsCount(A: Double, B: Double, C: Double): Int {
    var D = B.pow(2) - 4 * A * C
    return when {
        D < 0 -> 0
        D == 0.0 -> 1
        else -> 2
    }
}

fun p18() {
    var a = (1..50).random().toDouble()
    println(a)
    println(CircleS(a))
    main()
}

fun CircleS(R: Double): Double {
    var pi = Math.PI
    var S = pi * R.pow(2)
    return S
}

fun p19() {
    var a = (40..60).random().toDouble()
    var b = (10..30).random().toDouble()
    println("$a --- $b")
    println(RingS(a, b))
    main()
}

fun RingS(R1: Double, R2: Double): Double {
    var r1 = CircleS(R1)
    var r2 = CircleS(R2)
    return (r1 - r2)
}

fun s1() {
    var c: Char = (0..128).random().toChar()
    sus1(c)
    main()
}

fun sus1(c: Char): Int {
    println(c)
    println(c.toInt())
    return c.toInt()
}

fun s2() {
    var n = (32..126).random()
    sus2(n)
    main()
}

fun sus2(n: Int): Char {
    println(n)
    println(n.toChar())
    return n.toChar()
}

fun s3() {
    var c: Char = (0..128).random().toChar()
    sus3(c)
    main()
}

fun sus3(c: Char) {
    var c1 = c.toInt() - 1
    var c2 = c.toInt() + 1
    println(c1)
    println(c.toInt())
    println(c2)
    println(c1.toChar())
    println(c)
    println(c2.toChar())
}

fun s4() {
    var n = (1..26).random()
    sus4(n)
    main()
}

fun sus4(n: Int) {
    var b = 96
    var a = n
    while (a != 0) {
        a = -1
        b = +1
        println(b.toChar())
    }
}

fun a92() {
    amogus92()
    main()
}

fun amogus92() : Int {
    var n = (10..20).random()
    println(n)
    var l = MutableList(n) {
        (0..100).random()
    }
    println(l)
    for (i in l.toList()) {
        if (i % 2 == 0) {
            continue
        } else {
            l.remove(i)
        }
    }
    println(l.size)
    println(l)
    return 0
}

fun a93() {
    amogus93()
    main()
}

fun amogus93() {
    var n = (10..20).random()
    var l = List(n) {
        (0..100).random()
    }
    for (i in l.toList()) {
        if (l[i] % 2 == 0) {
//            l.remove(l[i])
        }
    }
}

//fun a4(a : Int, b : Int) {
//    var n = 10
//    var A = 2
//    var D = 2
//    var ls = Array(n, D) {
//
//    }
//}
//amogus