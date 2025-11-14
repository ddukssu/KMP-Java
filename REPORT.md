# **KMP Search Algorithm — Report**

## **1. Introduction**

The goal of this report is to explain how the KMP (Knuth–Morris–Pratt) string-search algorithm works and how it is implemented in the provided Java code. This algorithm is used to find all occurrences of a pattern inside a text in an efficient way. It improves performance by avoiding repeated comparisons.

---

## **2. Purpose of the Algorithm**

The KMP algorithm solves the problem of searching for a substring in a larger string.
Typical examples include:

* finding keywords in documents
* searching DNA sequences
* matching patterns in logs or input streams

The main advantage of KMP is that it does not re-check characters that were already compared.

---

## **3. How the Algorithm Works**

KMP uses two key ideas:

### **3.1 Character Comparison**

The algorithm compares characters from the text and the pattern.
If characters match, both pointers move forward.
If characters do not match, the algorithm uses the LPS array to decide where to jump next.

### **3.2 LPS (Longest Prefix Suffix) Array**

The LPS array shows, for each position in the pattern, the length of the longest prefix that is also a suffix.
This helps the algorithm skip unnecessary comparisons and improves performance.

Example:
Pattern `"ABABAC"`
LPS → `[0, 0, 1, 2, 3, 0]`

---

## **4. Code Explanation**

### **4.1 `search` Method**

This method returns all positions where the pattern appears in the text.

Steps:

1. Build the LPS array.
2. Compare characters of the text and pattern.
3. If the pattern is matched, record the index.
4. If characters do not match, move the pattern pointer using the LPS values.

### **4.2 `buildLPS` Method**

This method constructs the LPS array by checking repeated prefixes and suffixes in the pattern.
It is essential for making the KMP algorithm efficient.

---

## **5. Example Outputs**

The program tests the algorithm with three text samples: short, medium, and long.
Example:

* Text: `"Qiuyuan"`
* Pattern: `"yu"`
* Result: pattern found starting at index **2**

---

## **6. Efficiency**

KMP runs in **O(n + m)** time:

* `n` = length of the text
* `m` = length of the pattern

This is faster than the naive O(n × m) approach because KMP avoids re-checking characters.

---

## **7. Conclusion**

The KMP algorithm is a powerful and efficient technique for substring search. The Java implementation demonstrates:

* correct use of the LPS array
* efficient character comparison
* practical test cases for validation

Because of these features, the implementation is reliable and suitable for tasks where high-performance string matching is required.

