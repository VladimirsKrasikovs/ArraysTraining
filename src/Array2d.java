public class Array2d {

    public static void main(String[] args) {
        int[][] intMatrix = {
                {4, 6, 8, 10, 12, 14, 16},
                {18, 20, 22, 24, 26, 28, 30},
                {32, 34, 36, 38, 40, 42, 44},
                {46, 48, 50, 52, 54, 56, 58},
                {60, 62, 64, 66, 68, 70, 79}
        };
        // Store the number of subarrays of intMatrix into a variable called 'numSubArrays'
        int numSubArrays = intMatrix.length;
      //  System.out.println(intMatrix.length);

        int subArrayLength = intMatrix[0].length;
       // System.out.println(intMatrix[0].length);

        int columns = subArrayLength;
        int rows = numSubArrays;

        int sum = 0;
        for (int i=0;i < intMatrix.length; i++ ){
            for (int j=0; j <intMatrix[0].length; j++){
                sum +=intMatrix[i][j];
            }
        }
        System.out.println(sum);
    }

}

