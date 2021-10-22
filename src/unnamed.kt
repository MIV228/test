@file:Suppress("UnusedEquals")

import java.lang.Exception
import kotlin.math.pow
fun errors() {
    try {
        unnamedMain()
    } catch (e:Exception) {
        println(e.message)
        println(e.stackTrace)
        println("Крч произошла ошибка.")
        println("ПРОЦЕСС ВЫПОЛНЯЕТСЯ ЗАНОВО.")
        unnamedMain()
    }
}
fun unnamedMain() {
    var a = make_Powerup(5, 6, "a")
    var m = Powerup(2.5, 3, "m")
    var b = Powerup()
    var c = make_AnotherPowerup(3, 45)
    var d = AnotherPowerup()
    println("d:")
    d.read()
    d.power()
    d.display()
    println("b:")
    b.read()
    b.display()
    a.display()
    m.power()
    m.display()
    c.first += 1
    c.power()
    c.display()
}

fun make_Powerup(first: Int, second: Int, name: String) : Powerup {
    var obj = Powerup()
    obj.first = first.toDouble()
    obj.second = second
    return obj
}
fun make_AnotherPowerup(first: Int, second: Int) : AnotherPowerup {
    var obj = AnotherPowerup()
    obj.first = first.toDouble()
    obj.second = second.toDouble()
    return obj
}

class Powerup (
    var first : Double = 0.0,
    var second : Int = 0,
    var name : String = ""
    ) {
    fun power() : Double {
        return first.pow(second)
    }
    fun read() {
        println("Введите первое число:")
        first == readLine()!!.toDouble()
        println("Введите второе число:")
        second == readLine()!!.toInt()
    }
    fun display() {
        println("Первое число: $first")
        println("Второе число: $second")
    }
}

class AnotherPowerup (
    var first : Double = 0.0,
    var second : Double = 0.0
    ) {
    fun power() : Double {
        return first.pow(second)
    }
    fun read() {
        println("Введите первое число:")
        first == readLine()!!.toDouble()
        println("Введите второе число:")
        second == readLine()!!.toDouble()
    }
    fun display() {
        println("Первое число: $first")
        println("Второе число: $second")
    }
}