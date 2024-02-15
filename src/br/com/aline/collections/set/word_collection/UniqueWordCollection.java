package br.com.aline.collections.set.word_collection;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordCollection {
    Set<String> wordSet = new HashSet<>();

    public void addWord(String word) {
        wordSet.add(word);
    }

    public void removeWord(String word) {
        String wordToRemove = "";
        for (String w : wordSet) {
            if(w.equalsIgnoreCase(word)) {
                wordToRemove = w;
            }
        }
        wordSet.remove(wordToRemove);
    }

    public boolean contains(String word) {
        boolean isPresent = false;
        for (String w : wordSet) {
            if (w.equalsIgnoreCase(word)) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    public Set<String> getUniqueWordsSet() {
        return wordSet;
    }
}
