import java.util.ArrayList;

class ATK<T> {
    private ArrayList<T> data;

    public ATK() {
        this.data = new ArrayList<>();
    }

    public void add(T item) {
        data.add(item);
    }

    public void remove(T item) {
        data.remove(item);
    }

    public void edit(int index, T newItem) {
        data.set(index, newItem);
    }

    public void display() {
        for (T item : data) {
            System.out.println(item);
        }
    }
}

class Bag<T> {
    private ArrayList<T> data;

    public Bag() {
        this.data = new ArrayList<>();
    }

    public void add(T item) {
        data.add(item);
    }

    public void remove(T item) {
        data.remove(item);
    }

    public void edit(int index, T newItem) {
        data.set(index, newItem);
    }

    public void display() {
        for (T item : data) {
            System.out.println(item);
        }
    }
}

class Item {
    private String code;
    private String type;
    private String name;
    private int stock;

    public Item(String code, String type, String name, int stock) {
        this.code = code;
        this.type = type;
        this.name = name;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Type: " + type + ", Name: " + name + ", Stock: " + stock;
    }
}

public class gen {
    public static void main(String[] args) {
        // Membuat objek untuk ATK
        ATK<Item> atkInventory = new ATK<>();
        // Menambahkan data untuk ATK
        atkInventory.add(new Item("A001", "Pulpen", "Snowman Board Marker - Hitam", 50));
        atkInventory.add(new Item("A002", "Spidol", "Snowman Permanent Marker - Merah", 30));
        atkInventory.add(new Item("A003", "Pensil", "Faber Castell 2B", 40));
        atkInventory.add(new Item("A004", "Pulpen", "Snowman Board Marker - Biru", 20));
        atkInventory.add(new Item("A005", "Spidol", "Snowman Whiteboard Marker - Hitam", 25));

        Bag<Item> bagInventory = new Bag<>();

        bagInventory.add(new Item("C001", "Tas", "Tas Serut Motif Bunga", 15));
        bagInventory.add(new Item("C002", "Tempat Pensil", "Tempat Pensil Kotak - Hijau", 20));
        bagInventory.add(new Item("C003", "Tas", "Tas Selempang Canvas - Biru", 10));
        bagInventory.add(new Item("C004", "Tempat Pensil", "Tempat Pensil Silikon - Pink", 30));
        bagInventory.add(new Item("C005", "Tas", "Tas Ransel Anak - Merah", 12));

        System.out.println("Inventory Alat Tulis Kantor (ATK):");
        atkInventory.display();

        System.out.println("\nInventory Barang Lain:");
        bagInventory.display();
    }
}
