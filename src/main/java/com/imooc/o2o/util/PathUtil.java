package com.imooc.o2o.util;

public class PathUtil {

	private static String seperator = System.getProperty("file.separator");
	
    /**
     * 根据不同的操作系统，设置储存图片文件不同的根目录
     */
    public static String getImgBasePath() {

        String os =System.getProperty("os.name");
        String basePath = "";
        if(os.toLowerCase().startsWith("win")) {
          basePath = "C:/myDevelopmentData/testImg/"; //windows：根据自己的实际路径进行设置
        }else {
            basePath = "/home/o2o/image/";//linux or macOS根据自己的实际路径进行设置
        }
        basePath = basePath.replace("/", seperator);//使用系统的分隔符
        return basePath;
    }

    //根据不同的业务需求返回不同的子路径
    public static String getShopImagePath(long shopId) {
        String imagePath = "/upkoad/item/shop/"+ shopId + "/";
        return imagePath.replace("/", seperator);
    }
}
