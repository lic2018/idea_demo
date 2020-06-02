package com.lic.t03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 使用ByteBuffer(缓冲)和FileChannel(通道)
 * 读取file01.txt中的内容
 * @Author: lic
 * @data: 2019/12/24
 */
public class NIOFileChanne102 {
    public static void main(String[] args) throws IOException {

        File file = new File("c:\\file01.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        FileChannel channel = fileInputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate((int) file.length());

        channel.read(byteBuffer);

        byte[] array = byteBuffer.array();
        System.out.println(new String(byteBuffer.array()));
        fileInputStream.close();

    }
}
