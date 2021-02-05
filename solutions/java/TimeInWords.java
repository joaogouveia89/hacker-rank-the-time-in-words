public class TimeInWords{
	static String numberInWord(int n){
        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen"};
        String word = "";

        if(n == 15 || n == 45){
            word = "quarter";
        }else if(n == 30){
            word = "half";
        }else if(n > 13 && n < 20){
            String nw = numberInWord(n / 10);
            word = (nw.charAt(nw.length() - 1) == 't') ? nw + "een" : nw + "teen";
        }else if(n == 20){
            word = "twenty";
        }else if(n > 20 && n < 30){
            word = "twenty " + numberInWord(n % 10);
        }else{
            word = words[n - 1];
        }
        return word;
    }

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String minWord = "";
        if(m == 0){
            return numberInWord(h) + " o' clock";
        }else if(m <= 30){
            minWord = numberInWord(m);
            if(!minWord.equals("quarter") && !minWord.equals("half")){
                if(m == 1){
                    minWord = minWord + " minute";
                }else{
                    minWord = minWord + " minutes";
                }
            }
            return minWord + " past " + numberInWord(h);
        }else{
            minWord = numberInWord(60 - m);
            if(!minWord.equals("quarter")){
                minWord = minWord + " minutes";
            }
            return minWord + " to " + numberInWord(h + 1);
        }
    }
}