package com.lic.t03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 使用ByteBuffer(缓冲)和FileChannel(通道)
 * 将“你好”写入到file01.txt中
 *
 * @Author: lic
 * @data: 2019/12/24
 */
public class NIOFileChanne101 {
    public static void main(String[] args) throws IOException {
        String str = "你好";
        //输出流
        FileOutputStream fileOutputStream = new FileOutputStream("c:\\file01.txt");
        //通道
        FileChannel channel = fileOutputStream.getChannel();

        // 创建一个缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        //文字放入缓冲区
        byteBuffer.put(str.getBytes());
        byteBuffer.flip();
        channel.write(byteBuffer);
        fileOutputStream.close();
    }
}
