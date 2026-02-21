package Gla.strings.String_Api_Practice;

public class ProductDescriptionGenerator{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder();
        sb.append("<h1>Laptop</h1>");
        sb.append("<p>Brand: Dell</p>");
        sb.append("<ul><li>16GB RAM</li><li>512GB SSD</li></ul>");
        System.out.println(sb);
    }
}
