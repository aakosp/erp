package com.aako.area.domain.villages;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author loktar
 * @since 2021-12-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Villages对象", description="")
public class Villages implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "code", type = IdType.AUTO)
    private Long code;

    private String name;

    @TableField("streetCode")
    private Integer streetCode;

    @TableField("provinceCode")
    private Integer provinceCode;

    @TableField("cityCode")
    private Integer cityCode;

    @TableField("areaCode")
    private Integer areaCode;


}
