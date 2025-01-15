public class Main {
    public static void main(String[] args) {
        int[] list = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
        int[] list2 = {20, 11, 18, 14, 15, 9, 32, 5, 26};
        int[] list3 = {20, 11, 18, 14, 15, 9, 32, 5, 26, 74, 34, 53, 27};

//        BinarySearch binarySearch = new BinarySearch(list, 78);
//        System.out.println(binarySearch.searchForValue());
//        BinarySearch binarySearch2 = new BinarySearch(list, 40);
//        System.out.println(binarySearch2.searchForValue());

        QuickSorter quickSorter = new QuickSorter(list3);
        System.out.println(quickSorter);
        quickSorter.quicksort();
        System.out.println(quickSorter);
//Aš rankiniu būdu greičiau išrikiuočiau...

    }
}







