package com.people_fruit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("common")
public class CommonController {

    @Value("${fruit.images.path}")
    String path;

    @Value("${swiper.images.path}")
    String swiperPath;


    @RequestMapping("upload")
    public String upload(MultipartFile file){
        String originalFileName= file.getOriginalFilename();
        String subString=originalFileName.substring(originalFileName.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        String fileName=uuid+subString;
        File dir=new File(path);
        if (!dir.exists()){
            dir.mkdir();
        }
        try {
            file.transferTo(new File(path+fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileName;
    }

    @GetMapping("download")
    public void download(String name,HttpServletResponse response){
        response.setContentType("image/jpeg");
        FileInputStream fileInputStream=null;
        ServletOutputStream servletOutputStream=null;
        try {
            fileInputStream=new FileInputStream(new File(path+name));
            servletOutputStream= response.getOutputStream();
            int len=0;
            byte[] bytes=new byte[1024];
            while ((len=fileInputStream.read(bytes))!=-1){
                servletOutputStream.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                servletOutputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @GetMapping("swiperDownload")
    public void swiperDownload(String name,HttpServletResponse response){
        response.setContentType("image/jpeg");
        FileInputStream fileInputStream=null;
        ServletOutputStream servletOutputStream=null;
        try {
            fileInputStream=new FileInputStream(new File(swiperPath+name));
            servletOutputStream= response.getOutputStream();
            int len=0;
            byte[] bytes=new byte[1024];
            while ((len=fileInputStream.read(bytes))!=-1){
                servletOutputStream.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                servletOutputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
