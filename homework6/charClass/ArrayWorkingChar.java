package homework6.charClass;

public class ArrayWorkingChar {
    private char[] array = new char[5];
    private int count = 0;
    public void add(char data){
        System.out.println("Add " + count + " " + data);
        if (count == array.length){
            char[] temp = array;
            array = new char[2*array.length];
            copy(temp);
        }
        array[count] = data;
        count++;
    }
    private void copy(char[] temp) {
        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }
    }

    public char get(int index){
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


