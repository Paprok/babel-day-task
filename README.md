# Babel Day #01

Welcome to the very first Babel Day. A day in which we speak many programming languages at once.

![babel tower](https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Pieter_Bruegel_the_Elder_-_The_Tower_of_Babel_%28Vienna%29_-_Google_Art_Project.jpg/640px-Pieter_Bruegel_the_Elder_-_The_Tower_of_Babel_%28Vienna%29_-_Google_Art_Project.jpg)

## Why do we do this

IT industry is changing continuously. Programming languages popularity is a rollercoaster. Today JavaScript is popular, tomorrow it'll be C#, next week it'll probably be Rust, and then JavaScript again. If you want to survive in this jungle you have to get flexible. This event is aiming to teach you this.

## Your task

In this repository you can find two text files taken from [this repository](https://github.com/hermitdave/FrequencyWords). These files contain the frequencies of words used in subtitles available on [opensubtitles.org](https://www.opensubtitles.org). Your task is to process these files and extract some interesting data.

### Task 1

Write a program that finds the following things  in both files:

* longest word
* shortest word
* average word length
* number of words (count)

Sample output (fake data):

```console
===pl_full.txt===
longest word: cholerniedługiesłowo
shortest word: jajo
average length: 3
word count:  333

===en_full.txt===
longest word: areallylongword
shortest word: s
average length: 8
word count:  123456
```

### Task 2

A more challenging task. Find words that exist in both files and count them.
(Hint) Pay attention to the optimization. Given files are quite big so calculating the common part in the most straightforward way might take way too long.

Sample output (fake data):

```console
common words: ["Codecool", "babel", "day"]
count: 3
```

### Hint

One hour is a really short time to implement something in a language that you don't know yet. Thus split responsibilities in your team wisely.

### Optional Task

Display all words that fall below 20th [percentile](https://en.wikipedia.org/wiki/Percentile). Resources:

* [Percentiles for dummies](https://www.dummies.com/education/math/statistics/how-to-calculate-percentiles-in-statistics/)
* [Percentile calculation examples](https://www.mathsisfun.com/data/percentiles.html)
