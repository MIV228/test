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
                "a65" -> a65()
                "a66" -> a66()
                else -> {
                    println("При вычислениях произошла ошибка.")
                    println("ВЫПОЛНЯТСЯ ПЕРЕЗАПУСК")
                    main()
                }
            }
        }
        "1" -> {
            val a = Int.MAX_VALUE
            println("Ок")
            println("ВЫПОЛНЯЕТСЯ ВЫХОД ИЗ СИСТЕМЫ")
            exitProcess(a)
        }
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

fun a65() {
    var n = 10
    var k = 5
    var a = List(n) {
//        if (it == k) {
//            var int = it
//        }
        it
    }
    var a2 = List(n) {
        a[it] + k
    }
    println(a)
    println(a2)
    main()
}

fun a66() {
    var n = 10
    var list = List(n) {
        (1..9).random()
    }
    var a = list.find { it % 2 == 0 }
    var l2 = list.map {
        if ((it % 2) == 0) {
        it + a!!
        }
    }
    println(l2)
}

//fun a4(a : Int, b : Int) {
//    var n = 10
//    var A = 2
//    var D = 2
//    var ls = Array(n, D) {
//
//    }
//}