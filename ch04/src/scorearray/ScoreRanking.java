package scorearray;

public class ScoreRanking {

	public static void main(String[] args) {
		// 순위 매기기
		int[] score = {80, 90, 74, 100, 50};
		int[] rank = new int[5];

		for(int i = 0; i < score.length; i++) {
			int count = 1;
//			rank = {1,1,1,1,1};
			for(int j = 0; j < score.length; j++) {
				if(score[i] < score[j])
					count++;
			}
			rank[i] = count;
			
		}
//			i=0, 80<80, 80<90, 80<74, 80<100, 80<50 count = 3		
//			i=1, 90<80, 90<90, 90<84, 90<100, 90<50 count = 2
		for(int i = 0; i < rank.length; i++) {
			System.out.println(rank[i] + " ");
		}
	}

}
