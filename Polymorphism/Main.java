class Hewan {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing menggonggong");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Anjing();
        hewan.suara(); // Output: Anjing menggonggong
    }
}
