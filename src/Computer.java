public class Computer implements Comparable<Computer>{
    private String brand, model;
    private int ram;
    private double price;

    public Computer(String brand, String model, int ram, double price) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public int compareTo(Computer computer) {
        if (this.getBrand().equals(computer.getBrand()) && this.getModel().equals(computer.getModel()))
            return 0;

        if (this.getBrand().equalsIgnoreCase(computer.getBrand()))
            return this.getModel().compareToIgnoreCase(computer.getModel());
        else
            return this.getBrand().compareToIgnoreCase(computer.getBrand());
    }

    @Override
    public String toString()
    {
        return String.format("%s %s has %d of RAM and costs $%.2f",brand, model, ram, price);
    }
}
