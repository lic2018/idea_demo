package com.lic.t02;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 说明：
 * BIO模型编写的一个服务器端，监听6666端口，单有客户端连接时，启动一个线程与之通讯
 * 使用线程池机制改善，可以连接多个客户端
 * 服务器端可以接受客户端发送的数据（telnet 方式即可）
 *
 * @Author: lic
 * @data: 2019/12/23
 */
public class BIOService {

    public static void main(String[] args) throws Exception {

        // 线程池机制
        // 1 创建一个线程池
        // 2 如果有客户端连接，就创建一个线程，与之通讯（单独写一个方法）

        ExecutorService threadPool = Executors.newCachedThreadPool();

        //创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(6666);

        System.out.println("服务器启动");

        while (true) {
            System.out.println("线程id=" + Thread.currentThread().getId() + " 名字=" + Thread.currentThread().getName());

            //监听，等待客户端连接
            System.out.println("等待连接");
            final Socket socket = serverSocket.accept();

            System.out.println("连接到一个客户端");

            //就创建一个线程，与之通讯（单独写一个方法）
            threadPool.execute(new Runnable() {
                public void run() {
                    handler(socket);
                }
            });
        }

    }

    // 和客户端通讯
    public static void handler(Socket socket) {

        System.out.println("线程id=" + Thread.currentThread().getId() + " 名字=" + Thread.currentThread().getName());

        byte[] bytes = new byte[1024];
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();

            //循环读取客户端发送的数据
            while (true) {
                System.out.println("线程id=" + Thread.currentThread().getId() + " 名字=" + Thread.currentThread().getName());

                System.out.println("read");
                int read = inputStream.read(bytes);

                if (read != -1) {
                    // 输出客户端发送的数据
                    System.out.println(new String(bytes, 0, read));
                } else {
                    break;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("关闭连接");
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
