public class Solution{
	public static int solution(int n) {
		int m[][]=new int[n+1][n+1];
		m[0][0]=1;
		for(int i=1;i<n+1;i++) {
			for(int j=0;j<n+1;j++) {
				m[i][j]=m[i-1][j];
				if(j>=i)
					m[i][j]+=m[i-1][j-i];
			}
		}
		int s=m[n][n]-1;
		return s;
	}
}

