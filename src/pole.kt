@file:Suppress("UnusedEquals", "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")

import kotlin.system.exitProcess

fun game() {
    val n = 0
    var errCounter = 0
    var points = 0
    while (n == 0) {
        if (errCounter >= 3) {
            stopGame()
        }
    }
    var strList = listOf(
        "арбуз",
        "сказка",
        "роль",
        "параметр",
        "вирус"
    )
    var trueStr = strList.random()
    var opisanie: String
    var current = ""
    when (trueStr) {
        "арбуз" -> {
            current = "*****"
            opisanie =
                "Однолетнее травянистое растение семейства тыквенные, бахчевая культура.\n Имеет тонкие, длинные ползучие стебли, длиной до 4 м и более.\n Молодые стебли густо опушены мягкими волосками.\n Плод обычно называется ягодой."
        }
        "сказка" -> {
            current = "******"
            opisanie =
                "Один из жанров фольклора, либо литературы.\n Эпическое, преимущественно прозаическое произведение с волшебным, героическим или бытовым сюжетом."
        }
        "роль" -> {
            current = "****"
            opisanie =
                "В широком смысле, это описание ограниченного множества действий,\n выполняемых кем-то или чем-то в рамках определённого процесса."
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
        println("Ваше количество очков: $points")
        Thread.sleep(500)
        println("Задуманное слово: $current")
        Thread.sleep(500)
        println("Крутите барабан!")
        Thread.sleep(500)
        println("*Барабан долго крутится*")
        var sectors = listOf<Int>(
            5,
            5,
            10,
            10,
            20,
            20,
            50,
            50,
            100,
            250,
            500,
            1000,
            -1,
            -2,
            -3,
            -4,
            -5
        )
        var gift = sectors.random()
        Thread.sleep(3000)
        when (gift) {
            -1 -> { //приз
                println("Сектор \"Приз\"!")
                Thread.sleep(500)
                println("Ура! Подарочек в студию!")
                errCounter - 1
                points += 250
            }
            -2 -> { //плюс
                println("Сектор \"Плюс\"!")
                Thread.sleep(500)
                println("Поздравляем!")
                Thread.sleep(500)
                println("Теперь вы можете открыть ЛЮБУЮ букву в слове!")
                Thread.sleep(500)
                println("Назовите номер буквы, которую вы хотите открыть...")
                Thread.sleep(500)
                var index = readLine()!!.toInt() - 1
                if (index == -1) {
                    index++
                }
                Thread.sleep(500)
                for (i in 0 until trueStr.length) {
                    var b = current.split("").toMutableList()
                    b[index] = trueStr[index].toString()
                    current = b.toString()
                }
            }
            -3 -> { //x2
                println("Сектор \"x2\"!")
                Thread.sleep(500)
                println("Да нужели? Правда?")
                Thread.sleep(500)
                println("Все ваши очки умножаются в 2 раза!")
                Thread.sleep(500)
                points *= 2
            }
        }
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
                } else if (finalAnswer == trueStr) {

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