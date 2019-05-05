package what;

public class Solution {
    public static int[] solve(int[][] A, int[] B, int[] C, int[] D) {
        int[] resArr = new int[D.length];
        for(int i=0;i<D.length;i++){
            int x = B[i] - 1;
            int y = C[i] - 1;
            int k = D[i];
            int r = A.length;
            int c = A[0].length;
            
            if(x == 0 || y == 0 || x == A.length-1 || y == A[0].length-1)
            	resArr[i] = 1;
            else {
            	int startRow = x-1;
        		int startCol = y-1;
        		int limit = 2;
        		resArr[i] = 1;
            	while(true) {
            		
            		int kCount = 0;
            		int Area = 0;
            		if(startRow<0 || startCol<0 || (startRow + limit)>r-1 || (startCol + limit)>c-1)
            			break;
            		for(int l=startRow;l<=(startRow + limit);l++) {
            			for(int m=startCol;m<=(startCol + limit);m++) {
            				if(A[l][m] == 1)
            					kCount++;
            				Area++;
            			}
            		}
            		limit = limit + 2;
            		startRow--;
            		startCol--;
            		
            		if(kCount <= k) {
            		if(Area > resArr[i])
            			resArr[i] = Area;}
            		else {
            			break;
            		}
            	}
            }
           
        }
		return resArr;
    }
    public static void main(String[] args) {
   int[][] arr={{1,0,1,0,1,1,1},
				{1,0,1,0,1,1,1},
				{1,0,1,1,0,1,0},
				{1,0,1,0,1,1,1},
				{1,0,1,0,0,0,1}};
		int[] b = {3};
		int[] c = {6};
		int[] d = {6};
		int[] a = solve(arr,b,c,d);
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		
	}
}
