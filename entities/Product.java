package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double valorNoEstoque() {
        return price * quantity;
    }
    public void addProduto (int quantidade){
        quantity = quantity + quantidade;
    }
    public void rmvProduto (int quantidade){
        quantity = quantity - quantidade;
    }
    public String toString (){
        return ("Product data: " + name + ", $ " + String.format("%.2f",price) + " "
                +quantity + " units " + ", total: $ "+ String.format("%.2f",valorNoEstoque()));
    }
}
