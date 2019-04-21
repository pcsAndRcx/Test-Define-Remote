package testMethod;

import pojo.Person;
import pojo.User;

public class DiGui {
    public static void main(String[] args) {
            /*User user = new User("lidachui","2");
            Person person = new Person("李大锤",24,user);
            System.out.println(person);
            System.out.println("===========递归Start===========");
            System.out.println(digui(5));
            System.out.println("===========递归End===========");*/

        System.out.println("求5的阶乘Start");
        System.out.println(jiecheng2(5));
    }

    public static int num = 1;

        /*public static int digui(int x){
            num ++;
            if (x<2){
                System.out.println("递归马上就要结束了");
                return 1;
            }
            else{
                System.out.println(num);
                return digui(x-1);
            }
        }*/

    public static long jiecheng1(int x) {
        if (x > 0) {
            num *= x;
            return jiecheng1(x - 1);
        } else {
            return num;
        }
    }

    public static long jiecheng2(int x) {
        if (x >= 2) {
            return x * jiecheng2(x - 1);
        } else {
            return x;
        }

    }


}
