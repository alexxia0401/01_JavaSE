public class VarParameter {
    public static void main(String[] args) {
        VarParameter test = new VarParameter();
        
        test.show(5);
        test.show(new int[]{5, 3, 2, 4, 1});      
    }
    
    public void show(int i) {
        System.out.println(i);
    }
    
    public void show(int... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}