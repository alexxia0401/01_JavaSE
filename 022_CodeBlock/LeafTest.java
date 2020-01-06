public class LeafTest {

    public static void main(String[] args) {
        new Leaf();
        System.out.println("****************");
        new Leaf();
    }
}

class Root {
    static {
        System.out.println("Root static code block.");
    }
    
    {
        System.out.println("Root non-static code block.");
    }
    
    public Root() {
        System.out.println("Root no args constructor.");
    }
}

class Mid extends Root {
    static {
        System.out.println("Mid static code block.");
    }
    
    {
        System.out.println("Mid non-static code block.");
    }
    
    public Mid() {
        System.out.println("Mid no args constructor.");
    }
    
    public Mid(String msg) {
        this();
        System.out.println("Mid with args constructor, args: " + msg);
    }
}

class Leaf extends Mid {
    static {
        System.out.println("Leaf static code block.");
    }
    
    {
        System.out.println("Leaf non-static code block.");
    }
    
    public Leaf() {
        super("尚硅谷");
        System.out.println("Leaf constructor.");
    }
}