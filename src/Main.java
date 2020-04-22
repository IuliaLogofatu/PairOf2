public class Main {

    public static void main(String[] args) {
        int arr[] = {1, -1, 2,-2,4,6};
        pairs(arr);

    }

    public static void pairs(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for(int j = i+1; j<arr.length; j++)
            if (arr[i] + arr[j] == 0)
                count++;
        System.out.println(count);
    }

}






