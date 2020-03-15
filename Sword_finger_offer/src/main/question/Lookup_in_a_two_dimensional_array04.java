public class Lookup_in_a_two_dimensional_array04 {


    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * @param target
     * @param array
     * @return
     */
    public  boolean Find(int target, int [][] array) {
        int rows = array.length; //初始化行开始位置
        int cols = array[0].length;//初始化列开始位置
        if (rows == 0 && cols == 0) return false;
        int row =0;
        int col=cols -1;
        while (row<=rows-1 && col>=0){
            /* 如果右上的位置小于目标数字，则下移一行  */
            if (array[row][col]<target) {
                row ++;
                /* 如果右上的位置大于目标数字，则前移一列  */
            } else if (array[row][col]>target){
                col--;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arrays = new int[][]{{1, 3, 5, 7}, {2, 4, 6, 7}, {4, 6, 8, 10}, {7, 9, 12, 20}};
        int target = 9;
        Lookup_in_a_two_dimensional_array04 solution001 = new Lookup_in_a_two_dimensional_array04();
        System.out.println(solution001.Find(target, arrays));
    }
}
