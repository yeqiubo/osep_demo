package com.imooc.demo.util;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class ImageUtil {
    public static void main(String[] args) throws IOException {
        String basePath=Thread.currentThread().getContextClassLoader().getResource("").getPath();
        Thumbnails.of(new File("D:\\demo\\img\\xiaohuangren.jpg"))
                .size(200,200).watermark(Positions.BOTTOM_RIGHT,
                ImageIO.read(new File(basePath+"/watermark.jpg")),0.5f).outputQuality(0.8f)
        .toFile("D:\\demo\\img\\xiaohuangren2.jpg");
//        System.out.println(basePath);

    }

}
