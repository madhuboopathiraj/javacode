package numbers;

public class Duplicate {
	public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 2, 5, 6, 6,1};
        
//        find(arr);
//    }
//
//    public static void find(Integer[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate value: " + arr[i]);
                }
            }
        }
    }
  }






































































