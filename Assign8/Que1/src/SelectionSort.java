import java.util.Comparator;

public class SelectionSort {

	static <T>void selectionSort(T [] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++)
		for(int j=i+1; j<arr.length; j++)
		if(c.compare(arr[i], arr[j])>0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
	}
	public static void main(String[] args) {
		class Test implements Comparator<Integer>
		{
			@Override
			public int compare(Integer o1, Integer o2) {
				int diff = Integer.compare(o1, o2);
				return diff;
			}
		}
		Test t = new Test();
		Integer[] arr = {12, 45, 14, 56, 34};
		
		System.out.println("Before Selection sort--");
		for (Integer integer : arr) {
			System.out.println(integer);
			
		}
		selectionSort(arr, t);
		
		System.out.println("After Selection sort--");
		for (Integer integer : arr) {
			System.out.println(integer);
		
	}
}
}
