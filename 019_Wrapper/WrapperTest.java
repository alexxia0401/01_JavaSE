import org.junit.Test;

public class WrapperTest {

    // 基本数据类型转换为包装类，调用包装类的构造器
    @Test
    public void test1() {
        Integer n1 = new Integer(10);
        System.out.println(n1);
        System.out.println(n1.toString());
        
        Integer n2 = new Integer("123");
        System.out.println(n2);
        System.out.println(n2.toString());
        
        Float f1 = new Float(12.3);
        System.out.println(f1);
        Float f2 = new Float("8.8");
        System.out.println(f2);
        
        System.out.println(new Boolean("true"));
        System.out.println(new Boolean(true));
        System.out.println(new Boolean("tRue"));
        System.out.println(new Boolean("true123"));      
    }
    
    // 包装类转换为基本数据类型，调用包装类的 xxxValue()
    @Test
    public void test2() {
        Integer n1 = new Integer(12);
        int i1 = n1.intValue();
        System.out.println(i1 + 1);
        
        Float n2 = new Float(5.8);
        float f1 = n2.floatValue();
        System.out.println(f1 + 1);
    }
    
    @Test
    public void test3() {
        // JDK 5.0 新特性
        // 自动装箱，基本数据类型 ---> 包装类
        Integer i1 = 3;
        System.out.println(i1.toString());
        
        boolean b1 = false;
        Boolean b2 = b1;
        
        // 自动拆箱，包装类 ---> 基本数据类型
        int n1 = new Integer(5);
        System.out.println(n1 + 1);
    }
    
    @Test
    public void test4() {
        // 基本数据类型，包装类 ---> String 类型，调用 String.valueOf()
        // 方式一
        int i1 = 3;
        String str1 = i1 + "";
        // 方式二
        String str2 = String.valueOf(i1);
        Double d1 = new Double(3.6);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);
        
        // String 类型 ---> 基本数据类型，包装类，调用包装类的 parseXxx()
        String s1 = "135";
        int n1 = Integer.parseInt(s1);
        System.out.println(n1 + 1);
    }
}