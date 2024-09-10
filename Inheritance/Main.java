class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Kucing mengeong");
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.makan(); // Memanggil metode dari parent class
        kucing.suara(); // Memanggil metode dari child class
    }
}
