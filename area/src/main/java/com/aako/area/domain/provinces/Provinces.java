package com.aako.area.domain.provinces;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Provinces对象", description="")
public class Provinces implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "code", type = IdType.AUTO)
    private Integer code;

    private String name;


}
