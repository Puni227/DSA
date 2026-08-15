class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer =new  ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;

        int left=0;
        int right=n-1;
        int top=0;
        int down=m-1;
        while(left<=right && top<=down)
        {

        for(int i=left;i<=right;i++)
        {
            answer.add(matrix[top][i]);
        }
        top++;
        for(int j=top;j<=down;j++)
        {
            answer.add(matrix[j][right]);
        }
        right--;

        if(top<=down)
        {
            for(int i=right;i>=left;i--)
            {
                answer.add(matrix[down][i]);
            }
            down--;
        }
        if(left<=right)
        {
            for(int j=down;j>=top;j--)
            {
                answer.add(matrix[j][left]);
            }
            left++;
        }
        }
        return answer;
        
    }
}