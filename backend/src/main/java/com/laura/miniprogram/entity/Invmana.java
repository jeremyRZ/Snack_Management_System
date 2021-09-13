package com.laura.miniprogram.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeremyZhao
 * @since 2021-09-13
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Invmana implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String name;

    @TableField("addTime")
    private LocalDateTime addTime;

    @TableField("expirTime")
    private LocalDateTime expirTime;

    @TableField("invQuantity")
    private Integer invQuantity;

    @TableField("totalNum")
    private Integer totalNum;


}
