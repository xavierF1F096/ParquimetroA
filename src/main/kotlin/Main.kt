fun main(args: Array<String>) {
    var hours = readLine()!!.toInt()//ingresa un entero desde consola Int
    var total: Double = 0.0
    var day = hours /24 //guarda cuantos dias ay en la horas ingresadas

    if(hours > 24){
        println(day)//dias
        println(hours%24)//residuo
        total = 15*day + (hours%24)*0.5
    }else if(hours > 5 && hours < 24){
        total = 5 + (hours - 5)*0.5
    }else if(hours > 0 && hours < 5) {
        total = hours * 1.0
    } else{
        total =1.0
    }
    println(total)
}
//Problema principal
/*The fee is calculated based on the following price structure:
- the first 5 hours are billed at $1 per hour.
- after that, each hour is billed at $0.5 per hour.
- for each 24 hours, there is a flat fee of $15.*/