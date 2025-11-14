# KMP Algorithm Report

## Introduction
This project shows how the KMP string search algorithm works. It can find a
pattern inside a text in a fast way. KMP does not check the same characters many
times, so it is more efficient than a simple search.

## How it works
KMP uses an array called LPS. LPS tells the algorithm how much it can move the
pattern when a mismatch happens. This makes the search faster.

## Complexity
- Time: O(n + m), where n is text size and m is pattern size.
- Space: O(m) for the LPS array.

## Tests
I tested the program with three texts:
- Short: "Qiuyuan"
- Medium: "Name the target."
- Long: description of the character Qiuyuan from Wuthering Waves

The program prints the positions of the pattern in each text.

## Conclusion
The algorithm works well for short and long strings. It is simple to use and
runs fast even with bigger text.
