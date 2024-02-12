package br.com.aline.collections.set;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordCollection {
    Set<String> wordSet = new HashSet<>();

    void addWord(String word) {
        wordSet.add(word);
    }

    void removeWord(String word) {
        String wordToRemove = "";
        for (String w : wordSet) {
            if(w.equalsIgnoreCase(word)) {
                wordToRemove = w;
            }
        }
        wordSet.remove(wordToRemove);
    }

    boolean contains(String word) {
        boolean isPresent = false;
        for (String w : wordSet) {
            if (w.equalsIgnoreCase(word)) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    Set<String> getUniqueWordsSet() {
        return wordSet;
    }
}
