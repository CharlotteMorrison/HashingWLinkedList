//Chris Dutton, N01048106, Eggen
//Project 1, COP3601

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Program1{

    public static void main(String[] args) throws IOException{
    	//I don't want to deal with command line while testing the program.
        //String file = args[0];
        FileReader fileReader = new FileReader("src/TestTextFile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readString;
        
        //create hash table
        HashTable hashTable = new HashTable(2);
    
        //I can use an arraylist to store the values as they load
        //because I don't need to know how long it is.
        ArrayList<Data> nameList=new ArrayList<Data>();
        Data data;        
        String[] temp;
        
        //read and load into list
        while((readString = bufferedReader.readLine()) != null){
        	temp = readString.split(" ");
        	if(temp.length == 2) {
        		data = new Data( temp[0], Integer.parseInt(temp[1]));
        		nameList.add(data);
        	}else{
        		data = new Data(temp[0]);
        		nameList.add(data);
        	}
        }
        //add to hashlist
        System.out.println("*****Hashing Results*****\n");
        for(Data name: nameList) {
         	hashTable.add(name.getName(), name);
        }
        System.out.println();
        System.out.println(hashTable);
        fileReader.close();
        bufferedReader.close();
    }

}

