public class nestedif {
    public static void main(String[] args) {
        boolean kfc = true;
        boolean checken = true;
        boolean pizza = true;

        if (kfc) {
            System.out.println("go kfc.");

            if ( checken) {
                System.out.println("eating chenken");
                if (pizza) {
                    System.out.println("eating pizza");
                } 
                }
            } 
    }
}
