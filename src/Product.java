public class Product {
    private String ID, name, description;
    private double cost;

    public Product()
    {
        this.ID = this.description = this.name = "";
        this.cost = 0.0;
    }

    public Product(String ID, String name, String description, double cost) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toFileStr()
    {
        return(getID() + "," + getName() + "," + getDescription() + "," + String.format("%.2f", getCost()));
    }

    @Override
    public String toString()
    {
        return("ID: " + getID() + ", Name: " + getName() + ", Description: " + getDescription() + ", Cost: $" + String.format("%.2f", getCost()));
    }
}
