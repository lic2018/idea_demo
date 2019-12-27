package com.lic.t03;

import java.nio.IntBuffer;
import java.util.zip.Inflater;

/**
 * Buffer的使用
 *
 * @Author: lic
 * @data: 2019/12/26
 */
public class BasicBuffer {
    public static void main(String[] args) {
        //创建一个buffer，大小为5，即可以存放5个int
        IntBuffer intBuffer = IntBuffer.allocate(5);

        //存放数据
        intBuffer.put(10);
        intBuffer.put(11);
        intBuffer.put(12);
        intBuffer.put(13);
        intBuffer.put(14);
//        for (int i=0; i< intBuffer.capacity(); i++) {
//            intBuffer.put(i*2);
//        }

        //读取数据, 读写切换
        intBuffer.flip();
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }
    }
}
