package collections;

import java.util.Map;
import java.util.TreeMap;

class TMap implements Comparable<TMap>{
	
	private Integer key;
	private String value;
	
	public TMap(Integer key, String value) {
		this.key = key;
		this.value = value;
	}

	public Integer getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "TMap [key=" + key + ", value=" + value + "]";
	}

	@Override
	public int compareTo(TMap o) {
		String checkVar = key.toString().concat(value);
		String checkObj = o.getKey().toString().concat(o.getValue());
		
		return checkVar.compareTo(checkObj);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TMap other = (TMap) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
public class App {

	public static void main(String[] args) {
		

		Map<TMap,String> classes = new TreeMap<TMap, String>();
		
		classes.put((new TMap(1, "c01")),"Test1");
		classes.put((new TMap(18, "c05")),"Test7");
		classes.put((new TMap(3, "c16")),"Test6");
		classes.put((new TMap(15, "c06")),"Test5");
		classes.put((new TMap(9, "c08")),"kkkkkk");
		classes.put((new TMap(4, "c02")),"Test8");
		classes.put((new TMap(7, "c07")),"Test4");
		classes.put((new TMap(2, "c09")),"Test3");
		classes.put((new TMap(9, "c08")),"oooooooo");
		
		
		for(TMap key : classes.keySet()) {
			
			System.out.println("TMAP-Key-->" + key.getKey() + "  TMAP-Value-->" + key.getValue() + "  class-value-->" + classes.get(key));
		}
		
	}

}
