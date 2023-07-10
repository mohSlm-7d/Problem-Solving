import java.util.*;
class RandomizedSet  {
    private HashSet<Integer> set;
    public RandomizedSet() {
        this.set = new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
        if(this.set.contains(val)){
            return false;
        }
        this.set.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(this.set.contains(val)){
            this.set.remove(val);
            return true;
        }

        return false;
    }
    
    public int getRandom() {
        Random rand = new Random();
        int randKey = rand.nextInt(this.set.size());
        
        Iterator itr = this.set.iterator();
        int i =0;
        int value = -1;
        while(itr.hasNext()){
            if(i == randKey){
                value = (int)itr.next();
                break;
            }
            itr.next();
            i++;
        }

        return value;
    }
}

/**
 * Your Randomizedset object will be instantiated and called as such:
 * Randomizedset obj = new Randomizedset();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */