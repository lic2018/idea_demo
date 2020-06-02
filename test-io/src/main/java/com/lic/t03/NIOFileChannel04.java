package com.lic.t03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * 使用FileChannel（通道）和方法 transferFrom，完成文件的拷贝
 * 拷贝一张图片
 *
 * @Author: lic
 * @data: 2019/12/26
 */
public class NIOFileChannel04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("c:\\a.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("c:\\a2.jpg");

        //获取fileChannel
        FileChannel inChannel = fileInputStream.getChannel();
        FileChannel outChannel = fileOutputStream.getChannel();

        //使用transferForm完成拷贝
        outChannel.transferFrom(inChannel, 0, inChannel.size());
        //关闭
        inChannel.close();
        outChannel.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
