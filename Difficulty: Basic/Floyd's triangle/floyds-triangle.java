// User function Template for Java
class Solution {
    static void printFloydTriangle(int n) {
        // code here
        int c=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}