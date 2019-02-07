package GenericsInterfacesAufgabe2;


public class Sort {
    public static void main(String[] args) {
        Integer[] intList = {3, 2, 8, 11, 9, 5, 21, 1, 4, 10, 19};
        Double[] doubleList = {16.0, 18.3, 9.4, 28.3, 1.4, 3.6, 7.5};

        int[] values = {3, 2, 8, 11, 9, 5, 21, 1, 4, 10, 19};
        GenericQuicksort genericQuicksort = new GenericQuicksort();
        genericQuicksort.sort(intList);
        genericQuicksort.sort(doubleList);

        for(int i=0 ; i<intList.length; i++) {
            System.out.println(intList[i]);
        }
        for(int i=0 ; i<doubleList.length; i++) {
            System.out.println(doubleList[i]);
        }
    }
}

