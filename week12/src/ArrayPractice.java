public class ArrayPractice {
    public static void main(String[] args) {
//        int[][] matrix = new int[3][3]; 하고 값넣거나
        int[][] matrix = { { 50, 60, 55, 67, 70 },
                { 62, 65, 70, 70, 81 },
                { 72, 66, 77, 80, 69 } };

        //for 반복문 사용
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");

        // for each 사용
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.printf("%d ", col);
            }
            System.out.println("");//이거 없으면 일렬로 출력됨
        }


    }
}
