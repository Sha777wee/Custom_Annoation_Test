public class MethodTest {
    @Test
    public void m1() {
        System.out.println("执行m1方法");
    }

    @Test
    public void m2() {
        System.out.println("执行m2方法");
        throw new IllegalArgumentException("参数出错了");
    }

    @Test
    public void m3() {
        System.out.println("执行m3方法");
    }

    @Test
    public void m4() {
        System.out.println("执行m4方法");
        throw new NullPointerException("目标对象为null");
    }

    public void m5() {
        System.out.println("执行m5方法");
    }
}
