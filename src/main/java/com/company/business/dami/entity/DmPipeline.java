package com.company.business.dami.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author shanshui
 * @since 2020-06-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DmPipeline implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;


}
