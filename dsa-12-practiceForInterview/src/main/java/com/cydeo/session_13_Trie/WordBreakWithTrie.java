package com.cydeo.session_13_Trie;

import java.util.*;

public class WordBreakWithTrie {
    public static void main(String[] args) {
      //  List<String> dict= Arrays.asList("a", "b", "bbbb", "bbb");
       // System.out.println(wordBreak("bb", dict));
        List<String> dict= Arrays.asList("cats", "dog","leet", "code", "leetcod", "aaa");
        System.out.println(wordBreak("catsdog", dict));
    }

    public static boolean wordBreak(String str, List<String> wordDict){
        //create trie
        Trie trie = new Trie();
        TrieNode curNode = trie.root;
        //create a stack and hashset
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        //fill in the dist
        for(String s: wordDict){
            trie.insert(s);
        }
        //string in char ->start word break
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            //if no word contains curr char and stack is empty return false
            if (!curNode.children.containsKey(arr[i]) && stack.isEmpty()) return false;
            else if (!curNode.children.containsKey(arr[i]) && !stack.isEmpty()) { //if did't work  no  children contens character
                i = stack.pop();//
                curNode = trie.root;
                continue;//if the current node is word
            }
            curNode = curNode.children.get(arr[i]);//jump to next node
            //if the current node not null  and is word
            if (curNode != null && curNode.isWord) {
                if (visited.add(i)) stack.push(i);//if the return true push to stack
                if (curNode.children.size() == 0)
                    curNode = trie.root;    // reset  means no children and need to start over and inserted pointer to root
            }
            if (!stack.isEmpty() && !curNode.isWord && i == arr.length - 1) {     // end of the arr //reset
                i = stack.pop();
                curNode = trie.root;
            }
        }
        //return result
        return curNode.isWord || curNode== trie.root;
    }
}
