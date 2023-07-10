/**
 * @param {number} k
 */
var MyCircularDeque = function(k) {
    this.deque = [];
    this.capacity = k;
    this.size = 0;
    this.first = -1;
    this.last = -1;
};

/** 
 * @param {number} value
 * @return {boolean}
 */
MyCircularDeque.prototype.insertFront = function(value) {
    if(this.isFull()){
        return false;
    }
    if(this.isEmpty()){
        this.first = 0;
        this.last = 0;
    }
    else{
        this.first = (this.first - 1) % this.capacity;
    }
    this.deque[this.first] = value;
    this.size++;
    return true;
};

/** 
 * @param {number} value
 * @return {boolean}
 */
MyCircularDeque.prototype.insertLast = function(value) {
    if(this.isFull()){
        return false;
    }
    if(this.isEmpty()){
        this.first = 0;
        this.last = 0;
    }
    else{
        this.last = (this.last + 1) % this.capacity;
    }
    this.deque[this.last] = value;
    this.size++;
    return true;
};

/**
 * @return {boolean}
 */
MyCircularDeque.prototype.deleteFront = function() {
    if(this.isEmpty()){
        return false;
    }
    
    this.first = (this.first + 1) % this.capacity;
    this.size--;
    return true;
};

/**
 * @return {boolean}
 */
MyCircularDeque.prototype.deleteLast = function() {
    if(this.isEmpty()){
        return false;
    }
    
    this.last = (this.last - 1) % this.capacity;
    this.size--;
    return true;
};

/**
 * @return {number}
 */
MyCircularDeque.prototype.getFront = function() {
    if(this.isEmpty()){
        return -1;
    }
    return this.deque[this.first];
};

/**
 * @return {number}
 */
MyCircularDeque.prototype.getRear = function() {
    if(this.isEmpty()){
        return -1;
    }
    return this.deque[this.last];
};

/**
 * @return {boolean}
 */
MyCircularDeque.prototype.isEmpty = function() {
    return this.size === 0;
};

/**
 * @return {boolean}
 */
MyCircularDeque.prototype.isFull = function() {
    return this.size === this.capacity;
};

/** 
 * Your MyCircularDeque object will be instantiated and called as such:
 * var obj = new MyCircularDeque(k)
 * var param_1 = obj.insertFront(value)
 * var param_2 = obj.insertLast(value)
 * var param_3 = obj.deleteFront()
 * var param_4 = obj.deleteLast()
 * var param_5 = obj.getFront()
 * var param_6 = obj.getRear()
 * var param_7 = obj.isEmpty()
 * var param_8 = obj.isFull()
 */