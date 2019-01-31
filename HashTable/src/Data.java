
public class Data {
	private String name;
	private int number;
	
	public Data(String name, int number){
		this.name = name;
		this.number = number;
	}
	public Data(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	@Override
	public String toString() {
		String result;
		if(number == 0) {
			result = name;
		}else {
			result = name + " " + number;
		}
		return result;
	}
}
