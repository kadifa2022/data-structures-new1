package com.cydeo.session_13_Trie;

import com.cydeo.session_9_RangeSumBST.TreeNode;

public class Trie {

    TrieNode root;

    //constructor an empty object
    public Trie(){
        root = new TrieNode();
    }
    //insert a new word into trie
        public void insert(String word){
            TrieNode curNode = root;
            char[] arr= word.toCharArray();
            //to put value we need for loop
           for(char c: arr) {   //Iterate each node
               //children is map
           if(!curNode.children.containsKey(c)){
               curNode.children.put(c, new TrieNode());//empty
           }
           //if is the node continue
           curNode= curNode.children.get(c);
        }
           curNode.isWord=true;
    }



        public boolean search(String word){
        TrieNode curNode = root;
        char[]arr=word.toCharArray();
        for(char c : arr){
            if(!curNode.children.containsKey(c)) return false;
            curNode=curNode.children.get(c); // move forward
        }
        return curNode.isWord;
        }


        public boolean startsWith(String prefix){
        TrieNode curNode = root;
        char[] arr = prefix.toCharArray();
        for(char c : arr){
            if(!curNode.children.containsKey(c)) return false;
            curNode= curNode.children.get(c);
        }

        return curNode.isWord;

    }
}

























/*
Your trie object will be instantiated and called as such:
Trie obj = new Trie();
obj.insert(word);
boolean  param_2 = obj.search(word)
boolean param_3 = obj.startsWith(prefix)
 */
















