//Calculator.java
class Calculator {
	public static void main(String[] args) {
		try{
			int res = Addition.add(7, 8);
			System.out.println("Result: " + res);
		}
		catch(IllegalArgumentException e){
			System.out.println("Error: " + e.getMessage());
		}
	}
}
