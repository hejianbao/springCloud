package com.example.springclouddemoproduct.controller;

import com.example.springclouddemoentity.entity.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

/**
 * @Classname ProductController
 * @Description TODO
 * @Date 2020/7/27 0027 10:00
 * @Author hejianbao
 * @Version HL
 */
@RestController
public class ProductController {
    //添加bean
    /*@Autowired
    private StringRedisTemplate redisTemplate;*/

    @RequestMapping(value = "getProduct")
    //当调用微服务出现异常会降级到getProduct1方法中
    @HystrixCommand(fallbackMethod = "getProduct1")
    public String getProduct() {
        Product product = new Product();
        return product.toString();
    }

    //注意，方法签名一定要要和api方法一致
    private String getProduct1(HttpServletRequest request){
        //监控报警
        String saveOrderKye = "getProduct";
        //有数据代表20秒内已经发过
       /* String sendValue = redisTemplate.opsForValue().get(saveOrderKye);
        final String ip = request.getRemoteAddr();

        //新启动一个线程进行业务逻辑处理
        new Thread( ()->{
            if (StringUtils.isBlank(sendValue)) {
                System.out.println("紧急短信，获取信息失败，请离开查找原因,ip地址是="+ip);
                //发送一个http请求，调用短信服务 TODO
                redisTemplate.opsForValue().set(saveOrderKye, "getProduct1-fail", 20, TimeUnit.SECONDS);

            }else{
                System.out.println("已经发送过短信，20秒内不重复发送");
            }
        }).start();*/
        System.out.println("controller中的降级方法");
        //这对gai该接口进行一些逻辑降级处理........
        return "请停止controller服务";
    }
}
