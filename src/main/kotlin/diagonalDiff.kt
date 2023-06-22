fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val n = arr.size
    var leftToRightSum = 0
    var rightToLeftSum = 0

    for (i in 0 until n) {
        leftToRightSum += arr[i][i] // Sum of elements on the left-to-right diagonal
        rightToLeftSum += arr[i][n - i - 1] // Sum of elements on the right-to-left diagonal
    }

    return Math.abs(leftToRightSum - rightToLeftSum)
}
