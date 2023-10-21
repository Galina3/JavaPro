package homework6.doubleClass;

public class ArrayWorking {
    private double[] array = new double[5];
    private int count = 0;
    public void add(double data){
        System.out.println("Add " + count + " " + data);
        if (count == array.length){
            double[] temp = array;
            array = new double[2*array.length];
            copy(temp);
        }
        array[count] = data;
        count++;
    }
    private void copy(double[] temp) {
        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }
    }

    public double get(int index){
        return array[index];
    }

    public void deleteElement() {
        count--;
    }
    public void deleteArray() {
        count = 0;
    }

    public void hack() {
        count = array.length;
    }

    public void erase(){
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        count = 0;
    }

    public void display () {
        System.out.println("Выделенная память: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void displayInitialized(){
        System.out.println("Массив: ");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}