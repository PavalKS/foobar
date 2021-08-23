public class Solution {
	public static int solution(int[] l) 
	{
		int c[]=new int[l.length];
		int count=0,j,i;
		for(i=0;i<l.length;i++)
		{
			for(j=0;j<i;j++) 
			{
				if(l[i]%l[j]==0) 
				{
					c[i]+=1;
					count+=c[j];
				}
			}
		}
		return count;
	}
	public static void main(String[]args) {
		int[] l= {1,2,3,4,5,6};
		System.out.println(solution(l));
	}
}
