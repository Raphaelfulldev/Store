package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product produto = new Product();

        System.out.println("Enter Product data: ");
        System.out.println("Name: ");
        produto.name = sc.nextLine();
        System.out.println("Price: ");
        produto.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        produto.quantity = sc.nextInt();

        System.out.println();
        System.out.println(produto);

        System.out.println("");
        System.out.println("Enter the number of products to be add in stock");
        int quantidadee = sc.nextInt();
        produto.addProduto(quantidadee);

        System.out.println(produto);
        System.out.println();
        System.out.println("Enter the number of products to be removed from stock");
        quantidadee = sc.nextInt();
        produto.rmvProduto(quantidadee);
        System.out.println(produto);

        sc.close();
    }
}