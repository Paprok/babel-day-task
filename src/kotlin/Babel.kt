import java.io.File

class Babel constructor() {

    fun readFileAsLinesUsingReadLines(fileName: String): List<String> = File(fileName).readLines()

    fun calc(wordList: List<String>): List<String> {
        var longest = ""
        var shortest = wordList[0].split(" ")[0]
        var lengthSum = 0
        var wordsCount = 0
        var targetList = emptyList<String>()

        for (word: String in wordList) {
            val singleWord = word.split(" ")[0]
//            targetList += singleWord
            wordsCount++
            lengthSum += singleWord.length
            if (checkIfShortest(word, shortest.length)) {
                shortest = word
            }
            if (checkIfLongest(word, longest.length)) {
                longest = word
            }

        }
        var average = getAverageLength(lengthSum, wordsCount)
        print("longest word : ${longest.length} \n")
        print("longest word : ${longest} \n")
        print("shortest word : ${shortest.length} \n")
        print("shortest word : ${shortest} \n")
        print("words total : $wordsCount \n")
        print("average word length : $average \n")
        print("\n")
        return targetList
    }

    private fun getAverageLength(lengthSum: Int, wordsCount: Int): Any {
        return lengthSum / wordsCount
    }

    fun checkIfLongest(word: String, longest: Int): Boolean {
        if (word.length > longest) {
            return true
        }
        return false
    }

    fun checkIfShortest(word: String, shortest: Int): Boolean {
        if (word.length < shortest) {
            return true
        }
        return false
    }

    fun getCommonElementList(firstList: List<String>, secondList: List<String>): Any {
        var targetList = emptyList<String>()
        for (word: String in firstList) {
            if (word in secondList) {
                targetList += word
            }
        }
        return targetList
    }
}

fun main(args: kotlin.Array<String>) {
    val babel = Babel()
    val firstList = babel.readFileAsLinesUsingReadLines("src/resources/en_full.txt")
    val secondList = babel.readFileAsLinesUsingReadLines("src/resources/pl_full.txt")

    val outputList = babel.calc(firstList)
    val calculatedList2 = babel.calc(secondList)
//    val targetList = babel.getCommonElementList(outputList, calculatedList2)
}