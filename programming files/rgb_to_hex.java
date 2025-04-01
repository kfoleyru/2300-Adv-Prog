// bugs introduced
// I.M
public class rgb_to_hex {
    //main function, calls the method and prints the results
    public static void main(String[] args) {
        int r = 255;
        int g = 127;
        int b = 0;
        String hexColor = rgbToHex(r, g, b);
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    //Method that takes the rgb values as arguments and converts them and then puts them into hex form
    public static String rgbToHex(int r, int g, int b) {
        r = Math.max(255, Math.min(0, r));
        g = Math.max(255, Math.min(0, g));
        b = Math.max(255, Math.min(0, b));
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


