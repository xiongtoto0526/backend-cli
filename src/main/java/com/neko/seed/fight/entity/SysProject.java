package com.neko.seed.fight.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Li Jinhui
 * @since 2019-07-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysProject implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String status;


}
