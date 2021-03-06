package MARCH21Inheritance;

public class I5ArrayOps {
    protected int indexInt;
    protected int indexString;
    public I5ArrayOps(){
        this.indexInt=0;
        this.indexString=0;
    }

    public int findIndex(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value){
                this.indexInt=i;
            }
        }
        return this.indexInt;
    }
    public int findIndex(String arr[],String value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(value)){
                this.indexString=i;
            }
        }
        return this.indexString;
    }

    @Override
    public String toString() {
        return "I5ArrayOps{" +
                "indexInt=" + indexInt +
                ", indexString=" + indexString +
                '}';
    }
}
