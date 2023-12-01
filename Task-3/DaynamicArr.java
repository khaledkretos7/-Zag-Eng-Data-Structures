public class DaynamicArr {
    int[] arr;
    int size = 0;
    int count = 0;

    public DaynamicArr() {
        size = 100;
        arr = new int[size];
    }

    public DaynamicArr(int n) {
        size = n;
        arr = new int[size];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private void copyArr() {
        size *= 2;
        int[] newArr = new int[size];
        for (int i = 0; i < count; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void insert(int elements) {
        if (size == count)
            copyArr();
        arr[count] = elements;
        count++;
    }

    public void removeAt(int index) {
        if (index < 0 || index > count)
            System.out.println("out of Range");
        else {
            for (int i = index; i < count - 1; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
        }
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (arr[i] == item)
                return i;
        return -1;
    }

    public int at(int index) {
        if (index < 0 || index > count)
            return -1;
        return arr[index];
    }

    public int max() {
        int max = arr[0];
        for (int i = 1; i < count; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public int min() {
        int min = arr[0];
        for (int i = 1; i < count; i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }

    public void remove(int item) {
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] == item) {
                index = i;
            }
        }
        for (int j = index; j < count - 1; j++) {
            arr[j] = arr[j + 1];
        }
        count--;
    }
}
