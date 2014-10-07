public class LRUCache{
  
  public LRUCache(int capacity) {
      this.capacity = capacity;
      HashMap<Integer, CacheItem> key2value = new  HashMap<Integer, CacheItem> ();
      head = null;
      tail = null;
  }
    public void removeItem(Item item){
    	// remove item from the list
    	if (item.pre == null)
    		head = item.next;
    	else
    	    item.pre.next = item.next;
    	if (item.next != null)
    		item.next.pre = item.pre;
    	else
    		tail = item.pre;
    }
    public void setHead(item){
    	if (head == null){
    		head = item;
    		if (tail == null)
    			tail = head;
    	}
    	else{
    		item.next = head;
    		item.pre = null;
    		if (head != null)
    			head.pre = item;
    		head = item;
    		if (tail == null)
    			tail = item.next;
    	}
    }
    public void removeEnd(){
    	if (tail == null)
    		return;
    	Item newTail = tail.pre;
    	if (newTail != null)
    		newTail.next = null;
    	tail = newTail;
    }
    public int get(int key) {
      if (key2value.containsKey(key)){
        Item item = key2value.get(key);
        removeItem(item);
        setHead(item);
        return item.getValue();
      }
      else
        return -1;
    }
    
    public void set(int key, int value) {
      if (key2value.containsKey(key)){
        Item item = key2value.get(key);
	removeItem(item);
	item.set(key, value);
	setHead(item);
      }
      else{
      	// add this new key value pair
      	Item item = new Item(key,value);
      	if (size == capacity){
      		key2value.remove(tail.getkey());
      		removeEnd();
      		setHead(item);
      		key2value.put(key,item);
      	}
      	else{
      		setHead(item);
      		key2value.put(key,item);	
      		size ++;
      	}
      }
    }
    
  
  
  Item head;
  Item tail;
  priviate int capacity;
  int size = 0;
  private HashMap<Integer, CacheItem> key2value;
}

class Item{
    int key;
    int value;
    Item prev;
    Item next;
    Item(int key, int value){
      this.key = key;
      this.value = value;
      prev = null;
      next = null;
    }
    public void set(int key,int value){
		this.key = key;
		this.value = value;
	}
	int getKey(){return key;}
	int getValue(){return value;}
  }
