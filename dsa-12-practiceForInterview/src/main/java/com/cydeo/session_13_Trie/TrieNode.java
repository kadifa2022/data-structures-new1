package com.cydeo.session_13_Trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    // hash map  // trie Node to make n number of children
    public Map<Character, TrieNode> children = new HashMap<>(); // map for children
    public boolean isWord =false;
}
