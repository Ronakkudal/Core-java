package Cdac.Com.Acts;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StockManager {
    private List<Stock> transactions = new ArrayList<>();

    public void addTransaction(Stock stock) throws IllegalArgumentException {
        if (transactions.stream().anyMatch(t -> t.getTransId().equals(stock.getTransId()))) {
            throw new IllegalArgumentException("Transaction ID must be unique!");
        }
        transactions.add(stock);
    }

    public void removeTransaction(Integer transId) {
        transactions.removeIf(t -> t.getTransId().equals(transId));
    }

    public void displayTransactionsSortedByDate() {
        transactions.stream()
                .sorted(Comparator.comparing(Stock::getTransDate))
                .forEach(System.out::println);
    }

    public void filterTransactionsBySymbol(String symbol) {
        transactions.stream()
                .filter(t -> t.getSymbol().equalsIgnoreCase(symbol))
                .forEach(System.out::println);
    }

    public void saveToFile(String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(transactions);
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            transactions = (List<Stock>) ois.readObject();
        }
    }
}

