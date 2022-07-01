package chap05;

public class Test5_2 {

	public static void main(String[] args) {
		//4
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max : " + max);
		
		//5
		int[][] array1 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				};
		
		int sum = 0;
		double agv = 0.0;
		int count = 0;
		
		for(int i=0; i<array1.length; i++) {
			for(int j =0; j<array1[i].length; j++) {
				sum += array1[i][j];
				count++;
			}
		}
		agv = (double)sum/count; // 기본int형이므로 double로 강제 형변환
		System.out.println("sum " + sum);
		System.out.println("agv " + agv);
		
		
	}//main

}
