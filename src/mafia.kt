class Player {
    val trick : Int = (1..10).random()
    var role : Role = Role.PEACEFUL
}

fun startMafia() {
    println("Сколько игроков?")
    var answer = readLine()!!.toIntOrNull()
    if (answer == null) {
        answer = 5
    }
    var players : List<Player> = List(answer) {
        Player()
    }

    for (player in players) {
        if (players.find { player.role == Role.MAFIA } == null) {
            players.random().role = Role.MAFIA
        } else {
            continue
        }
        if (players.find { player.role == Role.DOCTOR } == null) {
            players.random().role = Role.DOCTOR
        } else {
            continue
        }
    }

    while (true) {
        println()
        for (player in players) {
            println(player.role)
        }

        println()
        var i = 3
        while (players.filter { it.trick <= i }.isEmpty()) {
            i++
        }
        players = players.minus(
        players.filter { it.trick <= i }.random()
        )

        if (players.find { it.role == Role.MAFIA } == null) {
            for (player in players) {
                println(player.role)
            }
            println("Игра окончена.")
            Thread.sleep(1000)
            println("Мирные победили!")
            Thread.sleep(1000)
            break
        }

        if (players.filter { it.role != Role.MAFIA }.isEmpty()) {
            for (player in players) {
                println(player.role)
            }
            println("Игра окончена.")
            Thread.sleep(1000)
            println("Мафия выиграла!")
            Thread.sleep(1000)
            break
        }
        if (answer >= 50) {
            Thread.sleep(250)
        } else if (answer >= 150) {
            Thread.sleep(100)
        } else if (answer >= 250) {
            Thread.sleep(50)
        } else {
            Thread.sleep(5)
        }
    }
    main()
}

enum class Role {
    PEACEFUL,
    MAFIA,
    DOCTOR
}