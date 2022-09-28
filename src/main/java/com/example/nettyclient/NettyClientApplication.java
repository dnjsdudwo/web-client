package com.example.nettyclient;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

@SpringBootApplication
public class NettyClientApplication {

    public static void main(String[] args) throws InterruptedException {
        Socket socket = new Socket();
        SocketAddress address = new InetSocketAddress("localhost", 8080);
        try {
            socket.connect(address);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        ≥
    }
}

