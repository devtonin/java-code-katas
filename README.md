# Java Code Katas

Code katas built in Java, educational proposes only. One kata to rule them all 🎌

## ☕ Lang: Java

## 📘 Platforms: LeetCode, HackerRank, GeeksforGeeks, real interviews

## ⚛️ Difficulties: Easy, Medium

![java-katas](JavaKatas.png)

## 🗂️ Structure

Katas are organized by **platform → topic** under `src/main/java`. Every kata has a `main` with sample inputs and the expected output in comments.

```
src/main/java
├── leetcode
│   ├── arrays          ├── strings        ├── matrix
│   ├── binarysearch    ├── backtracking   └── trees
├── hackerrank
│   ├── arrays          ├── matrix
│   ├── strings         └── implementation
├── geeksforgeeks
│   └── strings
└── interviews          (real interview questions)
    ├── strings         ├── sorting        └── formatting
```

### LeetCode

| Topic | Kata | Difficulty |
|---|---|---|
| arrays | [BestTimeToBuyAndSellStock](src/main/java/leetcode/arrays/BestTimeToBuyAndSellStock.java) | Easy |
| arrays | [CanPlaceFlowers](src/main/java/leetcode/arrays/CanPlaceFlowers.java) | Easy |
| arrays | [FindDifferenceBetweenTwoArrays](src/main/java/leetcode/arrays/FindDifferenceBetweenTwoArrays.java) | Easy |
| arrays | [MergeSortedArray](src/main/java/leetcode/arrays/MergeSortedArray.java) | Easy |
| arrays | [MinimumIndexOfAValidSplit](src/main/java/leetcode/arrays/MinimumIndexOfAValidSplit.java) | Medium |
| arrays | [PascalTriangle](src/main/java/leetcode/arrays/PascalTriangle.java) | Easy |
| arrays | [RemoveDuplicatesFromSortedArray](src/main/java/leetcode/arrays/RemoveDuplicatesFromSortedArray.java) | Easy |
| arrays | [RemoveElement](src/main/java/leetcode/arrays/RemoveElement.java) | Easy |
| arrays | [RotateArray](src/main/java/leetcode/arrays/RotateArray.java) | Medium |
| arrays | [SquaresOfSortedArray](src/main/java/leetcode/arrays/SquaresOfSortedArray.java) | Easy |
| strings | [GreatestCommonDivisorOfStrings](src/main/java/leetcode/strings/GreatestCommonDivisorOfStrings.java) | Easy |
| strings | [LengthOfLastWord](src/main/java/leetcode/strings/LengthOfLastWord.java) | Easy |
| strings | [MergeStringsAlternately](src/main/java/leetcode/strings/MergeStringsAlternately.java) | Easy |
| matrix | [RotateImage](src/main/java/leetcode/matrix/RotateImage.java) | Medium |
| binarysearch | [FindFirstAndLast](src/main/java/leetcode/binarysearch/FindFirstAndLast.java) | Medium |
| backtracking | [CombinationSum](src/main/java/leetcode/backtracking/CombinationSum.java) | Medium |
| backtracking | [Permutations](src/main/java/leetcode/backtracking/Permutations.java) | Medium |
| trees | [BinaryTreePreorderTraversal](src/main/java/leetcode/trees/BinaryTreePreorderTraversal.java) | Easy |
| trees | [SearchInBinaryTree](src/main/java/leetcode/trees/SearchInBinaryTree.java) | Easy |

### HackerRank

| Topic | Kata | Difficulty |
|---|---|---|
| arrays | [LeftRotation](src/main/java/hackerrank/arrays/LeftRotation.java) | Easy |
| arrays | [LonelyInteger](src/main/java/hackerrank/arrays/LonelyInteger.java) | Easy |
| arrays | [SparseArrays](src/main/java/hackerrank/arrays/SparseArrays.java) | Medium |
| matrix | [DiagonalDifference](src/main/java/hackerrank/matrix/DiagonalDifference.java) | Easy |
| strings | [CaesarCipher](src/main/java/hackerrank/strings/CaesarCipher.java) | Easy |
| implementation | [CountingValleys](src/main/java/hackerrank/implementation/CountingValleys.java) | Easy |

### GeeksforGeeks

| Topic | Kata |
|---|---|
| strings | [FindRepeatedChars](src/main/java/geeksforgeeks/strings/FindRepeatedChars.java) |

### Interviews

| Topic | Kata |
|---|---|
| strings | [FirstNonRepeatingCharacter](src/main/java/interviews/strings/FirstNonRepeatingCharacter.java) |
| strings | [SearchSuggestions](src/main/java/interviews/strings/SearchSuggestions.java) |
| sorting | [BubbleSort](src/main/java/interviews/sorting/BubbleSort.java) |
| formatting | [TablePrinter](src/main/java/interviews/formatting/TablePrinter.java) |

## ▶️ Running

```bash
mvn compile
java -cp target/classes leetcode.arrays.RotateArray
```

Or run any class directly from your IDE.
