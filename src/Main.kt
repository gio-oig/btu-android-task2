fun main() {
    val list = listOf<Double>(1.5, 2.4, 3.7, 4.6, 5.5, 6.6)
    println(evenIndexNumbersAvarage(list));
    println(isPalindrom("kayak"));
}

fun isPalindrom(str: String): Boolean {
    var left = 0;
    var right = str.length - 1;
    while(left < right) {
        if(str[left] != str[right]) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

fun getEventIndexNumbersSum(arr: List<Double>): Double {
    var sum: Double = 0.0;

    for (i in arr.indices) {
        if(i % 2 == 0) {
            sum += arr[i];
        }
    }
    return sum;
}

fun isEvenList(arr: List<Double>): Boolean {
    return arr.size % 2 == 0
}


fun evenIndexNumbersAvarage(arr: List<Double>): Double {
    var sum: Double = getEventIndexNumbersSum(arr);

    if(isEvenList(arr)) {
        return sum / (arr.size / 2)
    } else {
        return sum / (arr.size / 2 + 1)
    }
}
