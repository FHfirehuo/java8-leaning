package com.ciecc.fire.leaning.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
/**
 * 把一个整数数组保存到文件中并读出来进行逆序排序 
 * @author fire
 *
 */
public class Demo45 {

	public static void main(String[] args) {
        int a[] = {1,2,3,44,5,6,7,11,124,8};
        Demo45 demo = new Demo45();
        demo.write(a);
        int b[] = demo.read();
        demo.reverse(b);
        System.out.println(Arrays.toString(b));
    }
 
    public void write(int a[]) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo.txt")))
        {
            oos.writeObject(a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int[] read() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo.data")))
        {
            return (int[])ois.readObject();
        } catch (IOException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new int[]{};
    }
    public void reverse(int a[]) {
        for (int i = 0, len = a.length>>1; i < len; i++) {
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
    }

}
