public class App {
    public static void main(String[] args) throws Exception {
        String[] nombres = { "Juan", "Pedro", "Maria", "Ana" };
        String concatenacion = "";

        for (String nombre : nombres) {
            concatenacion += nombre + " ";
        }
        System.out.println(concatenacion);
    }
}
