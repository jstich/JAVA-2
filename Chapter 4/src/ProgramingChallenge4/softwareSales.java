package ProgramingChallenge4;

public class softwareSales {
    private double quant;
    private double discount;

    public double getDiscount() {
        if (quant < 10) {
            discount = 0;
        } else if (quant < 20) {
            discount = 0.2;
        } else if (quant < 50) {
            discount = 0.3;
        } else if (quant < 100) {
            discount = 0.4;
        } else {
            discount = 0.5;
        }

        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getQuant() {
        return quant;
    }

    public void setQuant(double quantity) {
        this.quant = quantity;
    }

    public double getTotalAmount() {
        double retailPrice    = 99;
        double amountOfOrder  = quant * retailPrice;
        double discountAmount = amountOfOrder * discount;
        double totalAmount    = amountOfOrder - discountAmount;

        return totalAmount;
    }

    public void setTotalAmount(double total) {}
}


