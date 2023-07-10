package DesignAddAndSearchWordsDataStructure;
import java.util.*;
class WordDictionary {
    ArrayList<String> Dictionary;
    public WordDictionary() {
        Dictionary = new ArrayList<String>();
    }
    
    public void addWord(String word) {
        Dictionary.add(word);
    }
    
    public boolean search(String word) {
        int WordLength = word.length();           
        int i=0;
        int Common = 0;
        
       for(String DictionaryWord : Dictionary){
            if(DictionaryWord.length() == WordLength){
                int j=0;
                while(j< DictionaryWord.length()){
                    if(word.charAt(j) != '.'){
                        if(DictionaryWord.charAt(j) != word.charAt(j)){
                            break;
                        }
                        Common++;
                    }
                    else {
                        Common++;
                    }
                    j++;
                        
                }
                
                if(WordLength == Common){
                    return true;
                }
                Common = 0;
                    
            }
                
        }
            return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */