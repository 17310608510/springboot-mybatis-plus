package com.example.demo.test.entity.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月18日 下午12:00:42 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Myuser对象",description ="")
public class Myuser implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "主键ID")
    private Long id;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "邮箱")
    private String email;
}
