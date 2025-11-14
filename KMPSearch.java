import java.util.ArrayList;
import java.util.List;

public class KMPSearch {

    public static List<Integer> search(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        int[] lps = buildLPS(pattern);
        int i = 0;
        int j = 0;

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    result.add(i - j);
                    j = lps[j - 1];
                }
            } else {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
        return result;
    }

    private static int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {

        // Short
        run("Qiuyuan", "yu");

        // Medium
        run("Name the target.", "the");

        // Long
        run(
            "Qiuyuan (Chinese: 仇远) is a playable Aero Unclear Resonator in Wuthering Waves. " +
            "Former senior agent of Mingting's Internal Security Agency, he is a swordsman of " +
            "cool resilience and absolute integrity, wandering Huanglong alone and seeks not fame " +
            "nor high office, but mastery of swordsmanship and a life guided by high morals.",
            "a"
        );
    }

    private static void run(String text, String pattern) {
        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);
        List<Integer> pos = search(text, pattern);
        System.out.println("Found at: " + pos);
        System.out.println();
    }
}
