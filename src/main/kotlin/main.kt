fun main() {
    fun secondsToMinute(seconds: Int): String {
        val minutes = seconds / 60
        return when {
            minutes in 11..14 -> "минут"
            minutes % 10 == 1 -> "минуту"
            minutes % 10 in 2..4 -> "минуты"
            else -> "минут"
        }
    }

    fun minutesToHour(seconds: Int): String {
        val hour = seconds / 3600
        return when {
            hour in 11..14 -> "часов"
            hour % 10 == 1 -> " час "
            hour % 10 in 2..4 -> "часа"
            else -> "часов"
        }
    }

    fun agoToText(seconds: Int) = when (seconds) {
        in 0..60 -> "Был(а) в сети только что"
        in 61..60 * 60 -> "Был(а) в сети ${seconds / 60} ${secondsToMinute(seconds)} назад"
        in 60 * 60 + 1..24 * 60 * 60 -> "Был(а) в сети ${seconds / 60 / 60} ${minutesToHour(seconds)} назад"
        in 24 * 60 * 60 + 1..48 * 60 * 60 -> "Был(а) в сети вчера"
        in 48 * 60 * 60 + 1..72 * 60 * 60 -> "Был(а) в сети позавчера"
        else -> "Давно"
    }


    println(agoToText(120))
    println(agoToText(14800))
}