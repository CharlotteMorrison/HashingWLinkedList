
public class HashNode {

    private String key; 
    private Data value; 
  
    //this gives us the next node so that
    //we can deal with collisions,like a linked list
    private HashNode next; 
  
    public HashNode(String key, Data value) 
    { 
        this.key = key; 
        this.value = value; 
    } 
    @Override
    public String toString() {
    	String node;
    	if(value.getNumber() == 0) {
    		node = value.getName();
    	}else {
    		node = value.getName() + " " + value.getNumber();
    	}
    	return node;
    }
    //getters and setters 
    public String getKey() {
    	return key;
    }
    public void setKey(String key) {
    	this.key = key;
    }
    public Data getValue() {
    	return value;
    }
    public void setValue(Data value) {
    	this.value = value;
    }
    public HashNode getNext() {
    	return next;
    }
    public void setNext(HashNode next) {
    	this.next = next;
    }
}

