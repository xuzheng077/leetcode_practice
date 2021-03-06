# Java 核心技术卷1

## Java程序设计概述

十一个关键词解释Java的特性：简单性，面向对象，网络技能，健壮性，安全性，体系结构中立，可移植性，解释型，高性能，多线程，动态性。

## Java程序设计环境

JDK: Java Development Kit的缩写，可以编译和运行Java程序，包含JRE和编译器。

JRE：Java运行时环境，包含虚拟机但不包含编译器，如果只需要运行编译好的Java程序，可以只使用JRE

Java SE：Standard edition

Java EE：Enterprise edition

Java ME：Micro edition

Java applet：在浏览器中运行的Java小程序，内嵌在Html文件中。

## Java基本程序设计结构

### Notes：

Java对大小写敏感。Java类名必须以字母开头，后面跟字母和数字的任意组合，命名规范为每个单词的首字母大写（骆驼命名法）。源代码的文件名必须与公共类的名字相同，并用.java作为扩展名。根据Java语言规范，main方法必须声明为public。

### 注释：

不会被编译到最后的可执行程序中。

// 单行注释    /**/多行注释（不能嵌套，就是说如果代码中有 */ 符号，就不能用这个注释符号括起来）

/** */ 文档注释，可以用来生成注释文档

### 数据类型：

8种基本类型：整型有四种，（int(4)，short(2)，long(8)，byte(1)），整型的范围与运行代码的机器无关，这点和C++不同。长整型有一个后缀L。浮点类型有两种（float(4) 和 double(8)），float类型有一个后缀F，没有的默认为double类型，double类型可以有D后缀，也可以没有。

常量Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY 和 Double.NaN是三个特殊值。使用Double.isNaN(x)检测一个值是不是NaN。

浮点数不适用于禁止出现误差的金融计算中，因为浮点数采用二进制系统表示，无法精确表示分数1/10，2.0-1.1会打印出0.8999999999999999而不是0.9。如要精确，应使用BigDecimal类。

char类型表示单个字符，通常用来表示字符常量。在Java中使用UTF-16编码。

boolean类型有true和false，整型值和布尔型之间不能进行转换。

### 变量：

以字母，下划线，美元符开头，由字母，下划线，美元符，数字组成。（字母和数字也包含某种语言中代表字母和数字的任何Unicode字符，不过这不重要，一般的字母数字就够用了）

不能使用未初始化的变量。

final关键词表示其修饰的变量是常量，只能被赋值一次，然后就不能在更改值，习惯上常量名全部字母大写。static final修饰类常量，通常也很有用。

### 运算符：

+，-，*，/，%五种运算符，注意除法运算的操作数是整数和浮点数时结果是否取整的区别。另外整数除以0会产生异常，浮点数除以0会得到无穷大或者NaN结果。使用strictfp关键字修饰类或方法可以使用严格的浮点计算来产生理想的结果，但这并不常用，而且可能产生溢出错误，这些与cpu芯片的计算方式有关。

自增和自减运算符以及它们的前缀和后缀形式。++x，--x，x++，x--。不要用在太复杂的表达式中，会影响代码理解。

关系运算符：==，!=，<=，>=，>，<

逻辑运算符：&&和||以及！。前两个以短路方式求值。即如果第一个表达式就可确定整个表达式的值，就不计算第二个表达式了。

三元操作符：condition ? Expression 1: Expression 2

位运算符：&，|，^，~，<<，>>分别是与，或，异或，非，左移和右移。>>>将用0填充高位，没有<<<。& 和 | 用于布尔值的时候采用非短路方式计算。对移位运算符右边的参数要进行模32的运算，若右边是long类型则模64，也就是1<<35和1<<3一样。

Math类的一些方法为了达到最快性能，涉及到浮点数时结果可能不非常准确，可以使用StrictMath类，这个也不是很常见的样子。

另外也要注意一下数值类型的转换，尤其是哪些有精度丢失哪些没有，计算过程中有哪些自动转换。一般小的转大的都不会有丢失，整型转浮点数都有丢失（int转double没有）。计算过程中有double，则另一个也转成double，有float或者long也是如此，若都没有，两个都变成int。另外也可以进行强制转换，这种操作比较常见，如果忘了可以再查一下。

运算符优先级：优先使用括号，就不用记住各种符号的优先级顺序了。

枚举类型：enum关键字。

字符串：一个字符串与一个非字符串的值进行拼接时，后者被自动转换成字符串表示。字符串不可变。这样做在修改字符串的时候效率可能低一点，但是这样编译器可以让字符串共享，把所有字符串放在公共的存储池中使用。字符串比较的时候要注意equals和==的区别。注意，只有字符串常量是共享的，+或substring产生的结果不是共享的，而是新建的另一个String对象。检查字符串既不是null也不是空串的时候要先检查null，不然若是null会报错。

代码点和代码单元：通常在使用一些不太常见的字符的时候需要注意这两点的区别。有的字符需要两个代码单元来表示，这时要遍历字符串的时候就不能使用charAt了，而应该是codePointAt(index)来得到代码点。

### 字符串：

### 输入输出：

### 控制流：

### 大数值：

### 数组：



