package wipro;

public class FIndSumOfDaignalELementsIn2DArray {



	public static void main(String args[]) {

        int	 a[][] = {
				{ 1, 2, 3, 7 },
				{ 5, 6, 7, 8 },
				{ 1, 2, 3, 4 },
				{ 15, 6, 7, 11 } 
				};
		long sum_left =0, sum_right = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i==j)
					sum_left = sum_left+a[i][j];
				if(i+j==a.length-1)
					sum_right = sum_right+a[i][j];
			}
		}
		System.out.println("sum_left:"+sum_left+" sum_right :"+sum_right);

	}
}
