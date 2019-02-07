package GenericsInterfacesAufgabe2;

class Quicksort {
        private int[] values;

        public void sort(int[] values) {
            this.values = values;
            quicksort(0, values.length - 1);
        }

        private void quicksort(int low, int high) {
            int pivot = values[low + (high - low) / 2];
            int lowIdx = low, highIdx = high;

            while (lowIdx <= highIdx) {
                while (values[lowIdx] < pivot) {
                    lowIdx++;
                }
                while (values[highIdx] > pivot) {
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
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
}

