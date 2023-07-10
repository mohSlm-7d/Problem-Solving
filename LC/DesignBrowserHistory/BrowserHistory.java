package DesignBrowserHistory;

import java.util.*;

class BrowserHistory {
    private String Homepage;
    private LinkedList<String> Forward;
    private Stack<String> Back;
   
    public BrowserHistory(String homepage) {
        this.Homepage=homepage;
        this.Forward=new LinkedList<String>();
        this.Back=new Stack<String>();
    }
    
    public void visit(String url) {
        Forward.clear();
        Back.push(Homepage);
        Homepage=url;
    }
    
    public String back(int steps) {
        if(this.Back.size() <  steps){
            steps=Back.size();
        }
        int i=0;
        while(i< steps){
            Forward.add(0, Homepage);
            Homepage = Back.pop();
            i++;
        }
        return Homepage;
    }
    
    public String forward(int steps) {
        if(steps > Forward.size()){
            steps=Forward.size();            
        }
        int i=0;
        while(i<steps){
            Back.push(Homepage);
            Homepage = Forward.poll();
            i++;
        }
        return Homepage;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */