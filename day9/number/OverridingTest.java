package number;

public class OverridingTest implements AbsClass {
	
	@Override
		public Number add(Number a, Number b) {
		int n1 = a.intValue();
		int n2 = b.intValue();
		Number sum = (Number)(n1 + n2);
		return sum;
	}
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
	public Integer add(Integer a, Integer b) {
		Integer sum = a + b;
		
		System.out.println(a.getClass().getName());
		return sum;
	}
	
	public static void main(String[] args) {
		
		OverridingTest test = new OverridingTest();
		
		System.out.println(test.add(1,2));
		Number a = 1231;
		Number b = 12;
		System.out.println(test.add(a, b));
		Integer n1 = 2;
		Integer n2 = 1312;
		
		System.out.println(test.add(n1, n2));
	}
}

/*
Try overriding methods with co-varient return type
ex. Number add(Number a, Number b)

@Override
Integer add(Number a, Number b)
*/