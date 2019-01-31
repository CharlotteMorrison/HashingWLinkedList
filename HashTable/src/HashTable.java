import java.util.ArrayList;

class HashTable{
	
	//array list that stores the linked lists
	private ArrayList<HashNode> hashTable;
	//stores how many spots are in the hashTable
	private int hashTableMax;
	//how big the hashTable is
	private int hashTableCurrentSize;
	
	public HashTable(int max) {
		hashTable = new ArrayList<>();
		hashTableMax = max;
		hashTableCurrentSize = 0;
		
		//make empty chains for each available spot in hashTable
		for(int i = 0; i < hashTableMax; i++) {
			hashTable.add(null);
		}
	}
	//gets the location based on key.
    private int getIndex(String key) { 
        int hash = key.hashCode(); //add own implementation
        int index = hash % hashTableMax; 
        return index; 
    } 
	 // add the key & value to hash
    public void add(String key, Data value) { 
        // Find head of chain for given key 
        int hashIndex = getIndex(key); 
        HashNode head = hashTable.get(hashIndex); 
  
        // Check if key is already present 
        while (head != null) { 
            if (head.getKey().equals(key)) { 
                //head.setValue(value); 
            	System.out.println("ERROR " + value.toString() + " exists at location " + hashIndex);
                return; 
            } 
            head = head.getNext(); 
        } 
  
        // Insert key in chain
        //increment size of list
        hashTableCurrentSize++; 
        head = hashTable.get(hashIndex); 
        HashNode newNode = new HashNode(key, value); 
        newNode.setNext(head); 
        hashTable.set(hashIndex, newNode); 
        System.out.println("Stored " + value.toString() + " at location " + hashIndex);
    // want to return instead of print?
    }
    @Override
    public String toString() {
    	String result = "\n*****Printing Hash Table*****\n";
    	for(HashNode item: hashTable) {
        	result += item;
            while (item != null) { 
                if (item.getNext() != null) { 
                	result += (", ");
                	result += (item.getNext());
                } 
                item = item.getNext(); 
            } 
            result += ("\n");
        }
    	return result;
    }
}