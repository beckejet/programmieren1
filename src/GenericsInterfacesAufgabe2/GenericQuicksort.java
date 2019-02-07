package GenericsInterfacesAufgabe2;

class GenericQuicksort <T extends Comparable<T>>{
        private T[] values;

        public void sort(T[] values) {
            this.values = values;
            quicksort(0, values.length - 1);
        }

        private void quicksort(int low, int high) {
            T pivot = values[low + (high - low) / 2];
            int lowIdx = low, highIdx = high;

            while (lowIdx <= highIdx) {
                while (values[lowIdx].compareTo(pivot) < 0 ){
                    lowIdx++;
                }
                while (values[highIdx].compareTo(pivot) > 0 ){
                    highIdx--;
                }
                if (lowIdx <= highIdx) {
                    swap(lowIdx, highIdx);
                    lowIdx++;
                    highIdx--;
                }
            }

            if (low < highIdx)
                quicksort(low, highIdx);
            if (lowIdx < high)
                quicksort(lowIdx, high);
        }

        private void swap(int i, int j) {
            T temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
}

