# java-
# 实验目的
1.学习创建包、类，运行java程序
2.学习在每个类中定义构造方法和函数
3.学习调用类中的函数
4.学习private修饰符以及使用set、get方式访问属性值

# 实验内容
描述计算机中CPU的速度、进程数、利用率，硬盘的总容量和现可用容量。

# 实验方法
创建主类text、cpu，HardDisk，pc四个类，在cpu和HardDisk中定义构造方法和set，get函数计算各个属性，pc类实现打印，主类用来调用四个类中的构造方法及函数实现输出。

# 核心代码
1.定义构造方法和函数：
```
        cpu() {}
        cpu (int a){this.jincheng = a；}
        cpu (double b){this.liyonglv = b;}
```
```
        public int getSpeed() {return speed;}
        public void setSpeed(int m) {this.speed = m;}
```
2.使用private修饰符：
(1)定义属性变量：
```
        private int amount;
```
(2)调用输出含private的属性值：
```
        System.out.println("硬盘容量:" + HD.getAmount());
```
# 实验结果
![img](https://github.com/10shi104shi414shi1440shi40/java-/blob/main/img/1.png)

# 实验感想
通过这次试验学会了java的一些基础知识，例如如何定义构造方法，private，set，get等用法。解决问题的同时加深了对这些知识的理解与应用。
