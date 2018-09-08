public class BinaryIterativeSearch implements Practice2Search{

	public String searchName(){
		return "Binary Search";
	}
	
	public int search(int [] arr, int target){
		
		int lower = 0;
		int upper = arr.length;
		int mid = (lower+upper)/2;
		
		while(lower<upper){
			if(arr[mid] == target){
				return mid;
			}
			else if(arr[mid] < target){
				lower = mid + 1;
				mid = (upper+lower)/2;
			}
			else {
				upper = mid-1;
				mid = (upper+lower)/2;
			}
			
		}
		return mid;		
	}
	
}