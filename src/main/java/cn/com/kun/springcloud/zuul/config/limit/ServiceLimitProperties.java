package cn.com.kun.springcloud.zuul.config.limit;

import java.util.List;

/**
 * 一个ServiceLimitProperties表示一个微服务的限流配置
 * author:xuyaokun_kzx
 * date:2021/7/1
 * desc:
*/
public class ServiceLimitProperties {

    /**
     * 整个微服务的限流（所有接口的访问量总和不能超过这个值）
     */
    private Double rate;

    /**
     * 各个接口的限流配置，假如不配置，默认不需要限流
     * （通常的使用是已经确定了这个接口没多少访问量，那就不需要限流，配了也是多余的，基本不会起作用
     * 所以最佳的实践是只为可能是高并发的接口作配置）
     *
     */
    private List<ApiLimit> apiLimit;

    /**
     * 和上面的属性同理，这里是限制IP
     */
    private List<IPLimit> ipLimit;

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public List<ApiLimit> getApiLimit() {
        return apiLimit;
    }

    public void setApiLimit(List<ApiLimit> apiLimit) {
        this.apiLimit = apiLimit;
    }

    public List<IPLimit> getIpLimit() {
        return ipLimit;
    }

    public void setIpLimit(List<IPLimit> ipLimit) {
        this.ipLimit = ipLimit;
    }
}
