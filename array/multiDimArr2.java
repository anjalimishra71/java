class multiDimArr2{
    public static void main(String args[]) {
        int i, j;
        int x[][] = new int[2][];
        x[0] = new int[]{1, 2, 3, 4};
        x[1] = new int[]{5, 6, 7, 8, 9};

        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}