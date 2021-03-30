import java.lang.reflect.Method;

public class TestAnnotationTool {
    public static void process(Class<?> clazz) throws Exception {
        Method[] mtdArr = clazz.getMethods();
        Object target = clazz.newInstance();
        int passed = 0;
        int failed = 0;
        for (Method mtd : mtdArr) {
            if (mtd.isAnnotationPresent(Test.class)) {
                try {
                    mtd.invoke(target);
                    passed ++;
                } catch (Exception e) {
                    System.err.printf("方法%s运行失败，异常为：%s\n", mtd, e);
                    failed++;
                }
            }
        }
        System.out.printf("测试完成，共运行了【%d】个方法，运行成功【%d】个方法，运行失败【%d】个方法\n",
                passed+failed, passed, failed);
    }
}
