import org.junit.jupiter.api.Test
import kotlin.math.PI
import kotlin.math.pow
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
    var a = readLine()!!.toString()
    when (a) {
        "0" -> the()
        "a1" -> a1()
        "a2" -> a2()
    }
}
fun b4(d : Double): Double {
    var pi = PI
    var L = pi * d
    return L
}

fun a1() {
    var n = 100
    var arr = List(n) {
        it * 2 + 1
    }
    println(arr)
}

fun a2() {
    var arr = List(100) {
        2.0.pow(it)
    }
    println(arr)
}


//fun a4(a : Int, b : Int) {
//    var n = 10
//    var A = 2
//    var D = 2
//    var ls = Array(n, D) {
//
//    }
//}