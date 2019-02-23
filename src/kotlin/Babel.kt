import java.io.File

class Babel  {

    fun readFile(fileName: String): MutableList<String> {
        var targetList = mutableListOf<String>()
        File(fileName).forEachLine { targetList.add(it.split(" ")[0]) }
        return targetList
    }

    fun calc(wordList: MutableList<String>) {
        var longest = ""
        var shortest = wordList[0]
        var lengthSum = 0
        var wordsCount = 0


        for (word: String in wordList) {
            wordsCount++
            lengthSum += word.length
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
    val firstList = babel.readFile("src/resources/en_full.txt")
    val secondList = babel.readFile("src/resources/pl_full.txt")

    val outputList = babel.calc(firstList)
    val calculatedList2 = babel.calc(secondList)
//    val targetList = babel.getCommonElementList(outputList, calculatedList2)
}