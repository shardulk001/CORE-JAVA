
import java.util.*;
public class spiral {
    
    public static void spiral (int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow && startcol<= endcol){
            //top
            for(int j= startcol;j<=endcol;j++){
                System.out.print(matrix [startrow][j]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i++){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
           //System.out.println();
        }
        startcol++;
        startrow++;
        endrow--;
        endcol--;

    }
//------------------------------------------------

    /*it is a sum of 
    two diagonals of a
    marix that is 
    then added to the
    varable sum and printed*/
    
    
    public static int digonalsum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){

                sum +=matrix[i][j];

                }

                else if(i+j==matrix.length-1){
                    sum +=matrix[i][j];

                }
            }
        }
        return sum;
    }

//-------------------------------------------------------------


    /*it is a funntion that
    find the shortest path of 
    finding the key in sorted matrix
    that is sorted by row wise and coloumn wise also
    the topright column and bottom left column is compaired to 
    biggest and smallest respectivly*/


    public static boolean binarusearch(int matrix[][],int key){
      
        int n=matrix.length;
        int col=matrix[0].length-1;
        int row=0;

        while(row<n && col >= 0){

            if(matrix[row][col]==key){
                System.out.println("key found at ("+row+","+col+ ")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
       System.out.println("key not found");
       return false;
    }
    public static void main(String[] args) {

        // (for spiral nad digonalsum)
       /*  int matrix[][]= {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}};*/

                    //System.out.println(spiral(matrix));
                    
                    //System.out.println(digonalsum(matrix));

                    int matrix[][]={{10,20,30,40},
                                    {15,25,35,45},
                                    {27,29,37,48},
                                    {32,33,39,50}};
                 
                    System.out.println(binarusearch(matrix, 29));
                    
    }
}
