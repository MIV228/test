@file:Suppress("UnusedEquals")

import kotlin.system.exitProcess

fun game() {
    var n = 0
    var errCounter = 0
    while (n == 0) {
        if (errCounter >= 3) {

        }
    }
    var strList = listOf<String>(
        "арбуз",
        "сказка",
        "роль",
        "параметр",
        "вирус"
    )
    var trueStr = strList.random()
    var opisanie : String
    var current = ""
    when (trueStr) {
        "арбуз" -> {
            current = "*****"
            opisanie = "Однолетнее травянистое растение семейства тыквенные, бахчевая культура.\n Имеет тонкие, длинные ползучие стебли, длиной до 4 м и более.\n Молодые стебли густо опушены мягкими волосками.\n Плод обычно называется ягодой."
        }
        "сказка" -> {
            current = "******"
            opisanie = "Один из жанров фольклора, либо литературы.\n Эпическое, преимущественно прозаическое произведение с волшебным, героическим или бытовым сюжетом."
        }
        "роль" -> {
            current = "****"
            opisanie = "В широком смысле, это описание ограниченного множества действий,\n выполняемых кем-то или чем-то в рамках определённого процесса."
        }
        "параметр" -> {
            current = "********"
            opisanie = "Свойство или показатель объекта или системы, которое можно измерить."
        }
        "вирус" -> {
            current = "*****"
            opisanie = "Неклеточный инфекционный агент, который\n может воспроизводиться только внутри клеток."
        }
    }
    var a = trueStr.split("")
    a.forEach { it.toString() }
    println("Игра начинается!")
    Thread.sleep(500)
    while (n == 0) {
        println("Задуманное слово: $current")
        Thread.sleep(500)
        println("Что будете вводить: слово или букву? (1/2)")
        var answer = readLine()!!.toString()
        Thread.sleep(500)
        when (answer) {
            "1" -> {
                println("Что же, назовете все слово?")
                var finalAnswer = readLine()!!.toString()
                Thread.sleep(500)
                if (finalAnswer != trueStr) {
                    println("В яблочко!")
                    Thread.sleep(1500)
                    println("Но не в то! ;D")
                    errCounter += 1
                }
            }
            "2" -> {
                println("Итак, назовите букву...")
                var answer = readLine()!!.toString()
                Thread.sleep(500)
                var c = current
                for (i in 0 until trueStr.length) {
//                    current = current.replace(answer.first(), '*')
                    var b = current.split("").toMutableList()
                    b[i] = (if (trueStr[i] == answer.first()) answer.first() else '*').toString()
                    current = b.toString()
                }
                if (current == c) {

                }
            }
            else -> {

            }
        }
        println("")
    }
}

fun stopGame() {
    println("Упс, вы проиграли!")
    println("Хотите сыграть снова? (0/1)")
    var a = readLine()!!.toString()
    Thread.sleep(500)
    when (a) {
        "0" -> game()
        "1" -> {
            println("Что же, возвращайтесь ещё!")
            Thread.sleep(500)
            println("Досвидания!")
            Thread.sleep(500)
            exitProcess(0)
        }
    }
}