package com.xuecheng.framework.domain.cms.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 　　* @description: TODO
 * 　　* @param ${tags}
 * 　　* @return ${return_type}
 * 　　* @throws
 * 　　* @author EvanYang
 * 　　* @date 2020/3/10 -- 16:28
 *
 */
@Data
@ApiModel
public class QueryPageReq implements Serializable {
    private static final long serialVersionUID = 236873069761982875L;
    @ApiModelProperty(value = "站点id")
    private String siteId;

    @ApiModelProperty(value = "页面id")
    private String pageId;

    @ApiModelProperty(value = "页面名称")
     private String pageName;

    @ApiModelProperty(value = "别名")
    private String pageAliase;

    @ApiModelProperty(value = "模板id")
     private String templateId;
}
