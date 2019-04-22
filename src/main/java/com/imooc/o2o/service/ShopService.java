package com.imooc.o2o.service;


import java.io.File;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;

public interface ShopService {
	/**
	 * 创建商铺
	 * 
	 * @param Shop shop对象
	 * @return ShopExecution shopExecution对象
	 * @throws RuntimeException
	 */
	ShopExecution addShop(Shop shop, File shopImg) throws RuntimeException;
}
