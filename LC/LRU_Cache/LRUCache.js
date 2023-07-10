/**
 * @param {number} capacity
 */
var LRUCache = function(capacity) {
    this.map = new Map();
    this.capacity = capacity;
    this.recentKeys=[];
};

/** 
 * @param {number} key
 * @return {number}
 */

LRUCache.prototype.size = 0;
LRUCache.prototype.get = function(key) {
    if(this.map.has(key)){
        for(let i=0; i<this.recentKeys.length; i++){
            if(this.recentKeys[i] === key){
                this.recentKeys.splice(i,1);
                break;
            }
        }
        this.recentKeys.push(key);
        return this.map.get(key);
    }
    return -1;
};

/** 
 * @param {number} key 
 * @param {number} value
 * @return {void}
 */
LRUCache.prototype.put = function(key, value) {
    if(this.map.has(key)){
        this.map.set(key, value);
        for(let i=0; i<this.recentKeys.length; i++){
            if(this.recentKeys[i] === key){
                this.recentKeys.splice(i,1);
                break;
            }
        }
        this.recentKeys.push(key);
    }
    else{
        if(this.size >= this.capacity){
            let keyToEvict = this.recentKeys.shift();
            this.map.delete(keyToEvict);
            this.size--;
            this.put(key, value);
        }
        else{
            this.map.set(key, value);
            this.size++;
            this.recentKeys.push(key);
        }
    }
};

/** 
 * Your LRUCache object will be instantiated and called as such:
 * var obj = new LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */