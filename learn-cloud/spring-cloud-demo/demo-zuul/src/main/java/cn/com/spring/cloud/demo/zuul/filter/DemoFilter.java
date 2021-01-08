package cn.com.spring.cloud.demo.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：macx7@chinatelecom.cn
 * @since ：2021/1/8
 */
@Component
public class DemoFilter extends ZuulFilter {

    /**
     * 返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型
     *      pre：     路由之前
     *      outing：  路由之时
     *      post：    路由之后
     *      error：   发送错误调用
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤的顺序
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里可以写逻辑判断，是否要过滤，本文true,永远过滤
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问
     *
     * @throws ZuulException
     */
    @Override
    public Object run() {
        RequestContext rc = RequestContext.getCurrentContext();
        HttpServletRequest request = rc.getRequest();
        String token = request.getHeader("token");

        if(null == token) {
            rc.setSendZuulResponse(false);
            rc.setResponseStatusCode(401);
            try {
                rc.getResponse().getWriter().write("token is empty");
            }catch (Exception e){

            }
            return null;
        }
        return null;
    }
}
