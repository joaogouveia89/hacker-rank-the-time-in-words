fun numberInWord(n: Int): String{
    val words = arrayOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen")
    var word = if(n == 15 || n == 45)"quarter"
    else if(n == 30) "half"
    else if(n > 13 && n < 20){
        val nw = numberInWord(n / 10)
        if (nw[nw.length - 1] == 't') "${nw}een" else "${nw}teen"
    }else if(n == 20) "twenty"
    else if(n > 20 && n < 30) "twenty ${numberInWord(n % 10)}"
    else words[n - 1]
    return word
}
// Complete the timeInWords function below.
fun timeInWords(h: Int, m: Int): String {
    var minWord: String = ""
    
    return if(m == 0){
        "${numberInWord(h)} o' clock"
    }else if(m <= 30){
        minWord = numberInWord(m)
        if(minWord !== "quarter" && minWord !=="half"){
            minWord = if(m == 1) "$minWord minute" else "$minWord minutes"
        }
        "$minWord past ${numberInWord(h)}"
    }else{
        minWord = numberInWord(60 - m)
        if(minWord !== "quarter"){
            minWord = "$minWord minutes"
        }
        "$minWord to ${numberInWord(h + 1)}"
    }
}