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
                else -> {
                    println("При вычислениях произошла ошибка.")
                    println("ВЫПОЛНЯТСЯ ПЕРЕЗАПУСК")
                    main()
                }
            }
        }
        "1" -> {
            println("ок")
            exitProcess(0)
        }
        else -> {
            println("При вычислениях произошла ошибка.")
            println("ВЫПОЛНЯТСЯ ПЕРЕЗАПУСК")
            main()
        }
    }


}
fun b4(d : Double): Double {
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

fun Sign(x : Int) : Int {
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

//fun a4(a : Int, b : Int) {
//    var n = 10
//    var A = 2
//    var D = 2
//    var ls = Array(n, D) {
//
//    }
//}
//amogus