/**DTO
 * Data Transfer Object数据传输对象

       主要用于远程调用等需要大量传输对象的地方。

       比如我们一张表有100个字段，那么对应的PO就有100个属性。

       但是我们界面上只要显示10个字段，

       客户端用WEB service来获取数据，没有必要把整个PO对象传递到客户端，
 */
package com.imooc.o2o.dto;