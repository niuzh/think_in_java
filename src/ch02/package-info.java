/**
 * 第2章 一切都是对象
 * @author niuzhihuan 2017-12-25
 */
package ch02;
/**
2.1 用引用操作对象
2.2 必须由你创建所有对象
2.2.1 存储到什么地方
寄存器，堆栈(基本类型)，堆(Java对象存储的地方)，常量存储，非RAM存储
2.2.2 特例：基本类型
 java基本类型存储空间是确定的。基本类型使用包装器类可以在堆中创建。
 包装器类型和基本类型可以互相转换。
 高精度数字BigInteger,BigDecimal.
2.2.3 Java中的数组
java中数组会进行安全检查，并且初始化为null.如果是基本类型则初始化为0
2.3 永远不需要销毁对象
2.3.1 作用域
作用域定义了在其内定义的变量的可见性和生命周期。 
2.3.2 对象的作用域
java对象可以存在于作用域之外，对象的引用和传递
2.4 创建新的数据类型：类
2.4.1 字段和方法
java中的工作就是定义类，创建类的对象，给对象发送消息。

*/