public class LRUCache{
  
  public LRUCache(int capacity) {
      this.capacity = capacity;
      HashMap<Integer, CacheItem> key2value = new  HashMap<Integer, CacheItem> ();
      head = null;
      tail = null;
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
