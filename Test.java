public class Test {

    public static void main(String[] args) {
        System.out.println("Yes");
    }

    public void m1() {
        System.out.println("1 méthode avec conflit");
        String test = "yes";
        System.out.println("1 méthode avec conflit" + yes);
    }
}