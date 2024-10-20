import java.util.ArrayList;

public class Cashier {
    private ArrayList<Item> items;

    public Cashier() {
        items = new ArrayList<>();
    }

    // Tambahkan barang beserta jumlahnya
    public void addItem(double price, String code, String name, int quantity) {
        items.add(new Item(code, name, price, quantity));
        System.out.println("Barang ditambahkan.");
    }

    // Hapus barang berdasarkan kode
    public void removeItem(String code) {
        for (Item item : items) {
            if (item.getCode().equals(code)) {
                items.remove(item);
                System.out.println("Barang dihapus.");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }

    // Tampilkan daftar item yang ada beserta subtotal per item
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Tidak ada barang dalam transaksi.");
            return;
        }

        System.out.println("Daftar barang dalam transaksi:");
        for (Item item : items) {
            System.out.println("Kode: " + item.getCode() + ", Nama: " + item.getName() +
                    ", Harga: " + item.getPrice() + ", Jumlah: " + item.getQuantity() +
                    ", Subtotal: " + (item.getPrice() * item.getQuantity()));
        }
    }

    // Tampilkan total harga dan proses pembayaran
    public void displayTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        System.out.println("Total belanja: " + total);
    }

    // Proses pembayaran dan hitung kembalian
    public void processPayment(double payment) {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }

        if (payment >= total) {
            double change = payment - total;
            System.out.println("Pembayaran berhasil. Kembalian: " + change);
        } else {
            System.out.println("Uang tidak mencukupi. Silakan coba lagi.");
        }
    }
}
