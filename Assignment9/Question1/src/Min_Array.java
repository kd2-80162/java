
public class Min_Array {

	static <T extends Number> T findMin(T[] arr) {

		T min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].doubleValue() < min.doubleValue())
			{	
				min=arr[i];
			}


		}

		return min;

	}

	public static void main(String[] args) {

		Integer[] arr1 = { 22, 55, 77, 11, 33 };
        System.out.println(+findMin(arr1));
		

		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		System.out.println(+ findMin(arr2));
		
	}

}
