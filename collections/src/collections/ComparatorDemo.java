package collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Data <K,V>{
	private K key;
	private V value;
	
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	
}


public class ComparatorDemo {

	public static void main(String[] args) {
		
		
		Comparator<Data<Integer,String>> COMPARE_KEY = new Comparator<Data<Integer,String>>(){

			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
				if(o1.getKey() < o2.getKey()) {
					return -1;
				}
				else if(o1.getKey() > o2.getKey()) {
					return 1;
				}
				else 
					return 0;
				
			}
			
			
		};
		
		Set<Data<Integer,String>> data = new TreeSet<Data<Integer,String>>(COMPARE_KEY);
		
		
		data.add(new Data<Integer, String>(1,"hello"));
		data.add(new Data<Integer, String>(2,"llo"));
		data.add(new Data<Integer, String>(7,"lo"));
		data.add(new Data<Integer, String>(4,"o"));
		data.add(new Data<Integer, String>(12,"hel"));
		data.add(new Data<Integer, String>(3,"helloooo"));
		data.add(new Data<Integer, String>(1,"hella"));
		
		for(Data<Integer,String>element : data) {
			
			System.out.println(element);
			
		}

	}

}
