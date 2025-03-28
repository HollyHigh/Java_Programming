public class RestrictedIdentifiers {
    public static void main(String[] args) {
//        int public = 5; // Error: 'public' is a keyword
//        int goto = 5; // Error: 'goto' is a reserved word
        int var = 5; // OK: 'var' is not a keyword or reserved word
        var value = 5; // OK: 'var' is not a keyword or reserved word
        System.out.println("var: " + var);
        System.out.println("value: " + value);
    }
}
