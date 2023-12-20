package ArrayProgrammes;

public class MutiplyTwoMatrix {

	 public static void main(String[] args) {
		int[][] a = {{0,2,1},{0,2,1},{0,7,8}};
		int[][] b = {{2,3,4},{5,6,8},{4,2,1}};
		
		int len = a.length;
		int[][] c = new int[len][len];
		multiply(a,b,c);
		displayMatrix(c);
	}

	private static void displayMatrix(int[][] c) {
		// TODO Auto-generated method stub
		for(int[] temp:c) {
			for(int n:temp) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}

	private static void multiply(int[][] a, int[][] b, int[][] c) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					c[i][j] = c[i][j] + a[i][k]*b[k][j];
				}
			}
		}
	}
}
