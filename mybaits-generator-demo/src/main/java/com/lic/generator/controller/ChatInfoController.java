package com.lic.generator.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;


/**
 * @author shuke
 * @date 2018/10/16
 */
@Api("ChatInfoController|图片和音频上传控制器类")
@RestController
public class ChatInfoController {

    /**
     * 上传图片接口
     *
     * @param attach  文件对象
     * @param request http请求
     * @return imgSrc：上传后图片文件的路径
     */
    @ApiOperation(value = "上传图片", notes = "文件不能超过20M大小，后缀名为png，jpg，gif")
    @RequestMapping(value = "/uploadImg", method = RequestMethod.POST)
    @ResponseBody
    public String uploadImg(@RequestParam("file") MultipartFile attach, HttpServletRequest request) {
        System.out.println("上传图片");
//        return FileUp.upFile(attach, request, Constants.IMAGE, true);
        return "1";
    }

    /**
     * 上传语音接口
     *
     * @param attach  文件对象
     * @param request http请求
     * @return audioSrc:上传后语音文件的路径
     */
    @ApiOperation(value = "上传语音", notes = "文件不能超过20M大小，后缀名为MP3，silk，flv")
    @RequestMapping(value = "/uploadAudio", method = RequestMethod.POST)
    @ResponseBody
    public String uploadAudio(@RequestParam("file") MultipartFile attach, HttpServletRequest request) {
        System.out.println("上传语音");
//        return FileUp.upFile(attach, request, Constants.AUDIO, true);
        return "2";
    }

}
