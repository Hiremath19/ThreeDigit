public class ThreeDigit {
    public static void main(String[] args) {

        int[] array = new int[100];
        int index = 0;

        for (int i = 0; i < 10; i++) // digit in 100th Place
            for (int j = 0; j < 10; j++) // digit in Tenth Place
                for (int k = 0; k < 10; k++) // digit in Unit Place
                {
                    if ((i + j) == k) {
                        array[index] = (i * 100) + (j * 10) + k;
                        index++;
                    }
                }

        System.out.println("Total numbers matching criteria = " + index);
        for (int x = 0; x < index; x++)
            System.out.printf("%d, ", array[x]);
    }
}

