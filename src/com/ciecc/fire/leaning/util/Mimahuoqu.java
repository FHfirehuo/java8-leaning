package com.ciecc.fire.leaning.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mimahuoqu {
	/*
	 * 密码发生器 在对银行账户等重要权限设置密码的时候，我们常常遇到这样的烦恼：如果为了好记用生日吧，
	 * 容易被破解，不安全；如果设置不好记的密码，又担心自己也会忘记；如果写在纸上，担心纸张被别人发现或弄丢了...
	 * 这个程序的任务就是把一串拼音字母转换为6位数字（密码）。
	 * 我们可以使用任何好记的拼音串(比如名字，王喜明，就写：wangximing)作为输入，程序输出6位数字。 变换的过程如下： 第一步.
	 * 把字符串6个一组折叠起来，比如wangximing则变为： wangxi ming 第二步.
	 * 把所有垂直在同一个位置的字符的ascii码值相加，得出6个数字，如上面的例子，则得出： 228 202 220 206 120 105 第三步.
	 * 再把每个数字“缩位”处理：就是把每个位的数字相加，得出的数字如果不是一位数字， 就再缩位，直到变成一位数字为止。例如: 228 =>
	 * 2+2+8=12 => 1+2=3 上面的数字缩位后变为：344836, 这就是程序最终的输出结果！
	 * 要求程序从标准输入接收数据，在标准输出上输出结果。
	 * 输入格式为：第一行是一个整数n（<100），表示下边有多少输入行，接下来是n行字符串，就是等待变换的字符串。 输出格式为：n行变换后的6位密码。
	 * 例如，输入： 5 zhangfeng wangximing jiujingfazi woaibeijingtiananmen
	 * haohaoxuexi 则输出： 772243 344836 297332 716652 875843
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<String> arr = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextLine());
		}
		for (int i = 0; i < n; i++) {
			transform(arr.get(i));
		}
	}

	// 分解字符串
	private static void transform(String str) {
		// TODO Auto-generated method stub
		int n = (str.length() + 5) / 6;
		char[][] c = new char[n][];
		for (int i = 0; i < n; i++) {
			if (str.length() > 6) {
				c[i] = str.substring(0, 6).toCharArray();
				str = str.substring(6);
			} else {
				c[i] = str.substring(0,str.length()).toCharArray();
				break;
			}
		}
		cal(c);

	}

	// 计算
	private static void cal(char[][] c) {
		// TODO Auto-generated method stub
		int last = c[c.length-1].length;
		int[] n = new int[6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < c.length-1; j++) {
				n[i] += c[j][i];
			}
		}
		for(int t=0;t<last;t++){
			n[t] += c[c.length -1][t];
		}
		condense(n);
	}
	//缩位
	private static void condense(int[] n) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<6;i++){
			char[] cc = (""+n[i]).toCharArray();
			sb.append(con(cc));
		}
		System.out.println(sb);
	}

	private static char con(char[] cc) {
		// TODO Auto-generated method stub
		if(cc.length<=1){
			return cc[0];
		}
		int temp = 0;
		for(int i = 0;i<cc.length;i++){
			temp += cc[i]-'0';
		}
		cc = (""+temp).toCharArray();
		return con(cc);
	}

}

//该代码片段来自于: http://www.sharejs.com/codes/java/7792
