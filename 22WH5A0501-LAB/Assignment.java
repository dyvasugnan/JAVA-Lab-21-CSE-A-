import java.util.Scanner;
class Array1D {
    int s;
    int arr[];
    Array1D(int s) {
        this.s = s;
        arr = new int[s];
    }
    void readData(Scanner sc) {
        System.out.println("Enter Array1D elements:");
        for (int i = 0; i < s; i++)
            arr[i] = sc.nextInt();
    }
    void display() {
        System.out.println("Array1D elements are:");
        for (int i = 0; i < s; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

class Array2D extends Array1D{
    int r;
    int c;
    int arr[][];
    Array2D(int r, int c) {
        super(r);
        this.r = r;
        this.c = c;
        arr = new int[r][c];
    }
    void readData(Scanner sc) {
        System.out.println("Enter Array2D elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        }
    }
    void display() {
        System.out.println("Array2D elements are:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}

class Array3D extends Array2D{
    int r,c,h;
    int arr[][][];
    Array3D(int r, int c, int h) {
        super(r, c);
        this.h = h;
        this.r=r;
        this.c=c;
        arr = new int[r][c][h];
    }
    void readData(Scanner sc) {
        System.out.println("Enter Array3D elements:");
        for (int k = 0; k < h; k++) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++)
                    arr[i][j][k] = sc.nextInt();
            }
        }
    }
    void display() {
        System.out.println("Array3D elements are:");
        for (int k = 0; k < h; k++) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++)
                    System.out.print(arr[i][j][k] + " ");
                System.out.println();
            }
        }
    }
}
class Assignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for Array1D: ");
        int size1D = sc.nextInt();
        Array1D a = new Array1D(size1D);
        a.readData(sc);
        a.display();
        System.out.print("Enter row size for Array2D: ");
        int row2D = sc.nextInt();
        Array1D aa = new Array2D(row2D,size1D);
        aa.readData(sc);
        aa.display();
        System.out.print("Enter depth for Array3D: ");
        int depth3D = sc.nextInt();
        Array1D aaa = new Array3D(row2D,size1D,depth3D);
        aaa.readData(sc);
        aaa.display();
    }
}