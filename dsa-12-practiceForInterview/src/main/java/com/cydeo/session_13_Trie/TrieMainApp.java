package com.cydeo.session_13_Trie;

public class TrieMainApp {

    public static void main(String[] args) {

        Trie trie = new Trie();
        trie.insert("Apple");
        System.out.println(trie.search("Apple"));
        trie.insert("App");
        System.out.println(trie.search("App") + "->After insert ");

    }
}
/*
Your trie object will be instantiated and called as such:
Trie obj = new Trie();
obj.insert(word);
boolean  param_2 = obj.search(word)
boolean param_3 = obj.startsWith(prefix)
 */