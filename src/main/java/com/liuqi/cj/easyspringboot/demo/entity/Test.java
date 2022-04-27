package com.liuqi.cj.easyspringboot.demo.entity;/**
 * @author John
 * @since 2022/4/23 19:27
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.io.Serializable;


/**
 * @author cj
 * @version 1.0
 * @since 2022/4/23 19:27
 */
@Data
@Table(name = "test")
@NoArgsConstructor
@AllArgsConstructor
public class Test implements Serializable {
    private Integer id;
    private String name;
    private String val;

    public Test(String name, String val) {
        this.name = name;
        this.val = val;
    }
}
