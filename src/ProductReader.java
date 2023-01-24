import javax.swing.JFileChooser;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ProductReader {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Product> products = new ArrayList<>();

        JFileChooser chooser = new JFileChooser();
        Scanner in = null;
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            in = new Scanner(selectedFile);
        }

        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "ID", "Name", "Description", "Cost");
        System.out.println("======================================================================");

        for (Product product : products) {
            System.out.printf("%-15s", product.getID());
            System.out.printf("%-15s", product.getName());
            System.out.printf("%-15s", product.getDescription());
            System.out.printf("%-15s", product.getCost());
        }
    }

    private static String removeComma(String inString) {
        return inString.substring(0, inString.length() - 1);
    }
}

