package sebas.lab07_refactoring;

public class PriceCalculator {
    private double basePrice;
    private int quantity;

    public PriceCalculator(double basePrice, int quantity) {
        this.basePrice = basePrice;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return getSubtotal() + getTax();
    }

    private double getPrice() {
        return basePrice * quantity;
    }

    private double getDiscount() {
        double price = getPrice();
        if (price > 1000) return price * 0.15;
        if (price > 500) return price * 0.10;
        return price * 0.05;
    }

    private double getSubtotal() {
        return getPrice() - getDiscount();
    }

    private double getTax() {
        return getSubtotal() * 0.18;
    }
}
