public class Color {
    // Instance variables for RGB values
    private int red,green,blue;
    // Constructor to initialize RGB values
    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;}
    // Getter methods
    public int getRed() {return red;}
    public int getGreen() {return green;}
    public int getBlue() {return blue;}
    // Override equals method to check if two colors are equal based on RGB values
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if both references point to the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null and type

        Color other = (Color) obj; // Cast the object to Color
        return red == other.red && green == other.green && blue == other.blue;} // Compare RGB values
    // Override hashCode method to maintain the contract between equals and hashCode
    @Override
    public int hashCode() {
        int result = red;
        result = 31 * result + green; // Use a prime number for hashing
        result = 31 * result + blue;
        return result;}
    // Method to display the color
    public void displayColor() {System.out.println("Color RGB(" + red + ", " + green + ", " + blue + ")");}
    public static void main(String[] args) {
        // Create two Color objects
        Color color1 = new Color(255, 0, 0); // Red
        Color color2 = new Color(255, 0, 0); // Red
        Color color3 = new Color(0, 255, 0); // Green
        color1.displayColor();
        color2.displayColor();
        color3.displayColor();
        System.out.println("color1 equals color2: " + color1.equals(color2)); // Should print true
        System.out.println("color1 equals color3: " + color1.equals(color3));}} // Should print false
